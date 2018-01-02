package com.javapapers.jee;

public class AnimalTypeService {
	public String animalType(String animal) {
		String animalType = "";
		if ("Lion".equals(animal)) {
			animalType = "Wild";
		} else if ("Dog".equals(animal)) {
			animalType = "Domestic";
		} else {
			animalType = "I don't know!";
			System.out.println("success");
			System.out.println("got");
		}
		return animalType;
		
	}

}
