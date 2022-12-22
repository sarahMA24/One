package com.kfh.training.services;

import java.util.List;

import com.kfh.training.entities.Product;
import com.kfh.training.entities.Report;

public interface ReportService {
	public abstract Report creatReport(Report report);
	public abstract void updateReport(Report report);
	public abstract Report getReport(int id);
	public abstract List<Report> getReport();
	public abstract void deleteReport(int id);
	public abstract boolean isReportExist(int id);
}
