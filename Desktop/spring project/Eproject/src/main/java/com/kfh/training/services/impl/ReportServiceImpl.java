package com.kfh.training.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.ProductRepository;
import com.kfh.training.dao.ReportRepository;
import com.kfh.training.entities.Product;
import com.kfh.training.entities.Report;
import com.kfh.training.services.ProductService;
import com.kfh.training.services.ReportService;

@Service
public class ReportServiceImpl implements ReportService{

	@Autowired
	private ReportRepository reportRepository;

	@Override
	public Report creatReport(Report report) {return  reportRepository.save(report);}

	@Override
	public void updateReport(Report report) {reportRepository.save(report);}

	@Override
	public Report getReport(int id) {
		Optional <Report> optional=reportRepository.findById(id);
		Report report=optional.get();
		return report;
	}

	@Override
	public List<Report> getReport() {return (List<Report>)reportRepository.findAll();}

	@Override
	public void deleteReport(int id) {reportRepository.deleteById(id);}

	@Override
	public boolean isReportExist(int id) {return reportRepository.existsById(id);}
	


}
