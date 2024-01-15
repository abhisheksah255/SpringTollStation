package com.example.webfunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebFunctionApplication.class, args);
	}

	List<TollStation> tollstation;
	
	public WebFunctionApplication() {
		tollstation = new ArrayList<TollStation>();
		tollstation.add((new TollStation("1010A",1212.34f,3)));
		tollstation.add((new TollStation("1435B",1441.14f,4)));
		tollstation.add((new TollStation("2122C",1321.35f,5)));
		tollstation.add((new TollStation("1230A",1221.21f,4)));
		tollstation.add((new TollStation("1231A",121.22f,6)));
	}	
	
	@Bean
	public Function<String, TollStation> retrieveStation() {
	    return value -> {
	        System.out.println("Received request for station - " + value);

	        return tollstation.stream()
	                .filter(toll -> value.equals(toll.getStationId()))
	                .findAny()
	                .orElse(null);
	    };
	}
	
}
 