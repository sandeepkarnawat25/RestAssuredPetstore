package api.endpoints;

import api.payload.User;

import static io.restassured.RestAssured.given;
import  io.restassured.http.ContentType;
import  io.restassured.response.Response;

// create,update,read and delete Request implementation for the user API.

public class userEndPoints {
	
	public static Response createUser(User payload){
		
		Response response = given()
			.contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(payload)
		.when()
			.post(routes.post_url);

		return response;
	}
	
	
 public static Response readUser(String userName){
		
		Response response = given()
				.pathParam("username", userName)
		.when()
			.get(routes.get_url);

		return response;
	}

 public static Response updateUser(String userName, User payload){
	
	Response response = given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(payload)
		.pathParam("username", userName)
	.when()
		.put(routes.update_url);

	return response;
}

 public static Response deleteUser(String userName){

	Response response = given()
		.pathParam("username", userName)
	.when()
		.delete(routes.delete_url);

	return response;
}

}
