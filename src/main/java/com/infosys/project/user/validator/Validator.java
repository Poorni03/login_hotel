package com.infosys.project.user.validator;



public class Validator {
	public static boolean name(String name) {
		if(name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$")) {
			return true;
		}
		else {
			return false;
		}}
		
		
	
	public static boolean emailid(String mail) {
		if(mail.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
				"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
			return true;
		}else {
			return false;
		}}
}
	