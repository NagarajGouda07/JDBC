package com.xworkz.firstprogram.runner;

public class Runner {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.firstprogram.Dosa");
			System.out.println(" Dosa laoding Successfully ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("My Sql is running Successfully ...");
		} catch (Exception t) {
			t.printStackTrace();
		
		} 
		
		try {
			Class.forName("com.xworkz.firstprogram.ButterMilk");
			System.out.println("ButterMlik is laoding Successfully ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("My Sql is running Successfully >>>>>>>");
		} catch (Exception c) {
			c.printStackTrace();
		
		} 
		
		try {
			Class.forName("com.xworkz.firstprogram.Bottel");
			System.out.println("Bottel is laoding kalikali.. ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("My Sql is running Successfully >>>>>>>");
		} catch (Exception c) {
			c.printStackTrace();
		
		}
		
		try {
			Class.forName("com.xworkz.firstprogram.Kalikali");
			System.out.println("Kalikali is laoding jalijali.. ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("My Sql is running Successfully >>>>>>>");
		} catch (Exception c) {
			c.printStackTrace();
		
		}
		try {
			Class.forName("com.xworkz.firstprogram.ByeBye");
			System.out.println("ByeBye is laoding jalijali.. ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("My Sql is running Successfully >>>>>>>");
		} catch (Exception c) {
			c.printStackTrace();
		
		}
	}

}
