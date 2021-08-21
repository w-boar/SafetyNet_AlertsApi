package com.safetyNet.alertsApi.repository;

import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Repository;

import com.safetyNet.alertsApi.AlertsApiApplication;
import com.safetyNet.alertsApi.model.Person;

@Repository("personDao")
public class PersonDataAccessService implements PersonDAO{
	private static final Logger logger = LogManager.getLogger(AlertsApiApplication.class);
	private static JsonReader jsonReader = new JsonReader();
	private static ArrayList<Person> persons;
	
	public PersonDataAccessService() {
		super();
		JSONObject dataJsonObject = jsonReader.readDataFromJsonFile();
		persons = jsonReader.getPersonsFromJson(dataJsonObject);
		
		
	}

	@Override
	public ArrayList<Person> getAllPersons() {
		return persons;
	}

	@Override
	public int insertPerson(Person person){
		persons.add(new Person(person.getFirstName(), person.getLastName(), person.getAddress(), person.getCity(), person .getZip(), person.getPhone(), person.getEmail()));
		return 1;
	}

	//public ArrayList<Person> getPersonsArrayListFromJson(){
	//return persons;
	//String firstName, String lastName, String address, String city, String zip, String phone,
	//String email
	//firstName, lastName, address, city, zip, phone,email
	// (new Person(person.getFirstName(), person.getLastName(), person.getAddress(), person.getCity(), person .getZip(), person.getPhone(), person.getEmail()));
}
