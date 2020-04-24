package com.sdet.genericLib;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.BeforeSuite;
/**
 * 
 * @author Debraj
 *
 */
public class BaseLib {
	
	/*
	 * to initialize the base URI, port and authentication
	 */
	@BeforeSuite
	public void config() {
		baseURI="http://13.126.80.194";
		port=8080;
		given().auth().basic("rupeek", "password");
	}
	
}
