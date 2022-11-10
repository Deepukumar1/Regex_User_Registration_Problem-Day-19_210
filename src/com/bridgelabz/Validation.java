package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	 Scanner sc=new Scanner(System.in);

	    public void checkFirstName(){
	        System.out.println("Enter Your First Name : ");
	        String firstName=sc.next();
	        if (Pattern.matches("^[A-Z]{1}[a-z]{4,}",firstName)){
	            System.out.println("First Name is Valid   ");
	        }else {
	            System.out.println("First Nmae is Invalid  ");
	        }
	    }
	    
		public void checkLastName() {
			 System.out.println("************");
		        System.out.println("Enter Last Name : ");
		        String lastName = sc.next();
		        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", lastName)) {
		            System.out.println("LastName is Valid  ");
		        } else {
		            System.out.println("LastName is Invalid   ");
		        }
			
		}
		
		 public void checkEmail() {
		        System.out.println("************");
		        System.out.println("Enter Email : ");
		        String email = sc.next();
		        if (Pattern.matches("^[a-zA-Z]{3,}[.]?[A-za-z0-9]{3,}[.]?[a-zA-Z]+[@]{1}[a-z]+[.]?[a-z]*", email)) {
		            System.out.println("Email is Valid  ");
		        } else {
		            System.out.println("Email is Invalid  ");
		        }
		    }
		 public void checkPhoneNumber() {
		        System.out.println("****************");
		        System.out.println("Enter PhoneNumber : ");
		        String phoneNumber  = sc.nextLine();
		        if (Pattern.matches("^[0-9]+\s[0-9]{10}", phoneNumber)) {
		            System.out.println("PhoneNumber is Valid	");
		        } else {
		            System.out.println("PhoneNumber is Invalid	");
		            checkPhoneNumber();
		        }
		    }
		 public void checkPasswordRule1() {
		        System.out.println("-----------------");
		        System.out.println("Enter Password : ");
		        String password  = sc.nextLine();
		        if (Pattern.matches("^[a-zA-z]{8,}",password)) {
		            System.out.println("Password is Valid---!!");
		        } else {
		            System.out.println("Password is Invalid--!!");
		            checkPasswordRule1();
		        }
		    }
}
