package com.kfh.training.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kfh.training.entities.Report;
import com.kfh.training.exception.ReportNotFoundException;
import com.kfh.training.exception.ReportNotFoundException;
import com.kfh.training.services.ReportService;

public class ReportServiceController {

	@Autowired
	private ReportService reportService;
	
	
	
	@RequestMapping(value="/report/{r_id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateReport(@PathVariable("r_id")int id,@RequestBody Report report){
		boolean isReportExist=reportService.isReportExist(id);
		if(isReportExist) {
			report.setR_id(id);
			reportService.updateReport(report);
			return new ResponseEntity<>("Report is updated successfully",HttpStatus.OK);
		}else {
			throw new ReportNotFoundException();
		}
	}
	
	@RequestMapping(value="/report",method=RequestMethod.GET)
	public ResponseEntity<Object> getUser(){
		List<Report> reportList=reportService.getReport();
		return new ResponseEntity<>(reportList, HttpStatus.OK);
	}
	
	@RequestMapping(value="/report/{r_id}", method=RequestMethod.DELETE)//<--
	public ResponseEntity<Object> deleteReport(@PathVariable("r_id")int id){
		boolean isReportExist=reportService.isReportExist(id);
		if(isReportExist) {
			reportService.deleteReport(id);
			return new ResponseEntity<>("Report is deleted successfully",HttpStatus.OK);
		}else {
			throw new ReportNotFoundException();
		}
	}
}
