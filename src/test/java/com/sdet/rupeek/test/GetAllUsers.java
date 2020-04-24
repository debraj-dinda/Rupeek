package com.sdet.rupeek.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;
import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import com.sdet.genericLib.BaseLib;
import com.sdet.genericLib.IEndPoints;

import io.restassured.http.ContentType;
/**
 * 
 * @author Debraj
 *
 */
public class GetAllUsers extends BaseLib {

	@Test
	public void getAllUsers() {

		given().when().get(IEndPoints.GET_ALL_USERS).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and().body("error", Matchers.equalTo("Unauthorized")).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(3000l));

	}

}
