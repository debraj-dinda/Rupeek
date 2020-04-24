package com.sdet.rupeek.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import com.sdet.genericLib.IEndPoints;

import io.restassured.http.ContentType;
/**
 * 
 * @author Debraj
 *
 */
public class Authenticate {
	
	@Test
	public void authenticate() {

		given().when().post(IEndPoints.POST_REQUEST).then().assertThat().statusCode(400).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Bad Request")).and()
				.time(lessThan(1500l));

	}

}
