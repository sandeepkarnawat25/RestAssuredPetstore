package api.endpoints;

public class routes {
	
	/*
	 
	 Swagger  URI : https://petstore.swagger.io
	 
	 Create user (post) -->   https://petstore.swagger.io/v2/user
	 Get user (GET) -->   https://petstore.swagger.io/v2/user/{username}
	 Update user (PUT) -->  https://petstore.swagger.io/v2/user/{username}
	 delete user (DELETE) -->  https://petstore.swagger.io/v2/user/{username}
	 
	 */

	public static String base_url = "https://petstore.swagger.io/v2/";
	
//	https://petstore.swagger.io/v2/user

	
	
	// user module
	
	public static String post_url = base_url+"/user";
	public static String get_url = base_url+"/user/{username}";
	public static String update_url = base_url+"/user/{username}";
	public static String delete_url = base_url+"/user/{username}";
	
	//store module 
	 	//here we will add store module url
	
	
	//pet module 
		//here we will add pet module url	
	
}
