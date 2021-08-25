package com.safetyNet.alertsApi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.safetyNet.alertsApi.model.AgeCalculator;
import com.safetyNet.alertsApi.model.MedicalRecord;

@SpringBootApplication
@EnableCaching
public class AlertsApiApplication {

	private static final Logger logger = LogManager.getLogger(AlertsApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AlertsApiApplication.class, args);
		logger.info("app inititialized");
		AgeCalculator ac = new AgeCalculator();
		MedicalRecord mr = new MedicalRecord("Bart", "Simpson", "08/26/1991", null, null);
		logger.info(ac.calculateAge(mr.getBirthDate()));
//		HomeService hs = new HomeService(null, null, null, null, null, null, null, null);
//		logger.info(hs.getHomeList(hs.getAddressList()));
//		FirestationDataAccessService firestationDao = new FirestationDataAccessService();
//		ArrayList<Firestation> firestations = firestationDao.getAllFirestations();
//		logger.info(firestations);
	}
}