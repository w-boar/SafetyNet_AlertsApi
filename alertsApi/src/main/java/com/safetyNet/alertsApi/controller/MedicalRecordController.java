package com.safetyNet.alertsApi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.safetyNet.alertsApi.model.MedicalRecord;
import com.safetyNet.alertsApi.service.MedicalRecordService;

@RequestMapping("/medicalRecord")
@RestController
public class MedicalRecordController {
	
	private final MedicalRecordService medicalRecordService;

	@Autowired
	public MedicalRecordController(MedicalRecordService medicalRecordService) {
		super();
		this.medicalRecordService = medicalRecordService;
	}
	
	@GetMapping
	public ArrayList<MedicalRecord> getAllMedicalRecords(){
		return medicalRecordService.getAllMedicalRecords();
	}

	@PostMapping
	public void insertMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
		medicalRecordService.insertMedicalRecord(medicalRecord);
	}
}
