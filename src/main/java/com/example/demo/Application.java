package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private Map<String,Object> cache = new HashMap<String,Object>()
	private static final String REST_URL="http://www.equifax.com/getScores";


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		int a =10;
	}

	//HIS-301changes
	public void loadDataToCache(){
		//logic to retrieve from db
	}
}
