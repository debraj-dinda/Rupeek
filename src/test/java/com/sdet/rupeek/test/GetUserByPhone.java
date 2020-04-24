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
public class GetUserByPhone extends BaseLib{
	
	@Test
	public void getAllUsersByPhone() {

		given().when().get(IEndPoints.GET_USER_PHONE).then().assertThat().statusCode(401).and()
				.contentType(ContentType.JSON).and()
				.body("message", Matchers.equalTo("Unauthorized")).and().time(lessThan(1000l));
}

}
