package lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Files {
	ArrayList<File> myFiles;
	static Scanner input = new Scanner(System.in);
	String path = "../files";
	File folder = new File(path);

	public Files(ArrayList<File> myFiles) {
		// super();
		this.myFiles = new ArrayList<File>(Arrays.asList(folder.listFiles()));
	}

	public static void sort(ArrayList<File> myFiles) {
		if (!myFiles.isEmpty()) {
			myFiles.sort(null);
			for (File f : myFiles) {
				System.out.println(f.getName());
			}
		} else {
			System.out.println("There is no files to sort :D");
		}

	}

	public static void addFile(ArrayList<File> myFiles) throws IOException {
		System.out.println("please enter the file name :");
		String fileName = input.next();
		String path = "../files";
		if (myFiles.contains(fileName)) {
			System.out.println("already exists...");
		} else {
			File file = new File(path + "/" + fileName);
			file.createNewFile();
			myFiles.add(file);
		}
	}

	public static void deleteFile(ArrayList<File> files) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the file name to  delete it :");
		String fileName = input.nextLine();
		String path = "../files";
		File file = new File(path + "/" + fileName);// <--added
		if (files == null)
			return;
		if (!file.exists())
			return;
		if (file.delete()) {
			if (files.remove(file)) {
				System.out.println("Removed from arrayList");
			} else {
				System.out.println("Wasn't removed from arrayList");
			}
			System.out.println("Deleted from directory");
		} else
			System.out.println("Deleted");

	}

	public static void searchFile(ArrayList<File> files) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the file name to  search for it :");
		String fileName = input.nextLine();
		String path = "../files";
		File file = new File(path + "/" + fileName);// <--added
		if (files == null)
			return;
		if (file.exists()) {
			// return;
			System.out.println("File is exists");
		} else {
			System.out.println("File is not exists");

		}
	}

	public void menu() throws IOException, InputMismatchException {
		boolean done = false;
		int choice1;
		int choice2;
		String fileName, dFile;

		while (!done) {
			System.out.println("1. Return the current file names in ascending order ");// <--done
			System.out.println("2. User details");// <--done
			System.out.println("3. Exit the application");// <---done
			System.out.println("Select your choice :");// <--done
			choice1 = input.nextInt();
			switch (choice1) {
			case 1:
				sort(myFiles);
				break;
			case 2:
				System.out.println("1. Add a file");// <--done
				System.out.println("2. Delete a file");// <--done
				System.out.println("3. Search for a file");// <--done
				System.out.println("4. Go Back To The Main Menu");// <--done
				choice2 = input.nextInt();
				switch (choice2) {// seconed switch start
				case 1:
					addFile(myFiles);
					break;
				case 2:
					deleteFile(myFiles);
					break;
				case 3:
					searchFile(myFiles);
					break;
				case 4:
					break;
				}// seconed switch end
				break;

			case 3:
				done = true;
				break;

			default:
				System.out.println("invalid choice !!");
				break;

			}
		}
	}

}
