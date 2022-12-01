package lockedme;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to lockedMe");
		System.out.println("My Name is Sarah LockedMe developer");
		ArrayList<File> myFiles = null;
		Files F = new Files(myFiles);
		F.menu();
	}
}
