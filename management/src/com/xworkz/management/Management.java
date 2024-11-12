package com.xworkz.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Management {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/car";
		String userName = "root";
		String password = "Nagaraj@007";
		String insertQuery = "INSERT INTO car VALUES "
				+ "(1, 'Aman', 'Singh', 'aman.singh@example.com', 'Singh', 9876543101, '2024-01-01', 101, 58000.00, 29, '123 A Block, Sector 12, Noida, UP', '1995-02-15 08:30:00', 'M'),"
				+ "(2, 'Riya', 'Verma', 'riya.verma@example.com', 'Verma', 9876543102, '2024-02-01', 102, 62000.00, 28, '456 B Street, Koramangala, Bengaluru, KA', '1996-03-10 10:00:00', 'F'),"
				+ "(3, 'Rajeev', 'Kumar', 'rajeeve.kumar@example.com', 'Kumar', 9876543103, '2024-03-01', 103, 65000.00, 31, '789 C Avenue, Baner, Pune, MH', '1993-04-25 09:45:00', 'M'),"
				+ "(4, 'Neha', 'Sharma', 'neha.sharma@example.com', 'Sharma', 9876543104, '2024-04-01', 104, 57000.00, 30, '321 D Road, Sadar Bazar, Agra, UP', '1994-05-10 14:30:00', 'F'),"
				+ "(5, 'Sandeep', 'Gupta', 'sandeep.gupta@example.com', 'Gupta', 9876543105, '2024-05-01', 105, 53000.00, 33, '654 E Lane, Rajendra Nagar, Patna, BR', '1991-06-15 11:15:00', 'M'),"
				+ "(6, 'Meera', 'Reddy', 'meera.reddy@example.com', 'Reddy', 9876543106, '2024-06-01', 106, 60000.00, 28, '987 F Circle, Sadar Bazar, Surat, GJ', '1996-07-20 12:00:00', 'F'),"
				+ "(7, 'Anuj', 'Patel', 'anuj.patel@example.com', 'Patel', 9876543107, '2024-07-01', 107, 59000.00, 32, '159 G Building, Mansarovar, Jaipur, RJ', '1992-08-25 16:45:00', 'M'),"
				+ "(8, 'Swati', 'Soni', 'swati.soni@example.com', 'Soni', 9876543108, '2024-08-01', 108, 62000.00, 31, '753 H Road, Kasavanahalli, Bengaluru, KA', '1993-09-30 15:30:00', 'F'),"
				+ "(9, 'Karan', 'Mehta', 'karan.mehta@example.com', 'Mehta', 9876543109, '2024-09-01', 109, 63000.00, 30, '852 I Street, Mahalakshmi, Mumbai, MH', '1994-10-05 10:15:00', 'M'),"
				+ "(10, 'Shruti', 'Aggarwal', 'shruti.aggarwal@example.com', 'Aggarwal', 9876543110, '2024-10-01', 110, 55000.00, 29, '951 J Road, Chetpet, Chennai, TN', '1995-11-10 08:00:00', 'F'),"
				+ "(11, 'Arun', 'Verma', 'arun.verma@example.com', 'Verma', 9876543111, '2024-11-01', 111, 61000.00, 28, '753 K Block, Tilak Nagar, Delhi, DL', '1996-12-15 13:45:00', 'M'),"
				+ "(12, 'Pooja', 'Chauhan', 'pooja.chauhan@example.com', 'Chauhan', 9876543112, '2024-12-01', 112, 57000.00, 27, '852 L Street, Anand Vihar, Lucknow, UP', '1997-01-20 11:30:00', 'F'),"
				+ "(13, 'Vikram', 'Patil', 'vikram.patil@example.com', 'Patil', 9876543113, '2024-01-15', 113, 65000.00, 30, '951 M Road, Indore, MP', '1993-02-25 14:15:00', 'M'),"
				+ "(14, 'Sanjay', 'Kumar', 'sanjay.kumar@example.com', 'Kumar', 9876543114, '2024-02-15', 114, 59000.00, 33, '123 N Lane, Sector 11, Chandigarh, CH', '1991-03-30 10:45:00', 'M'),"
				+ "(15, 'Nikita', 'Jain', 'nikita.jain@example.com', 'Jain', 9876543115, '2024-03-15', 115, 57000.00, 31, '456 O Building, Kailash Colony, Delhi, DL', '1994-04-05 09:00:00', 'F'),"
				+ "(16, 'Raj', 'Kapoor', 'raj.kapoor@example.com', 'Kapoor', 9876543116, '2024-04-15', 116, 64000.00, 32, '789 P Block, Lajpat Nagar, Mumbai, MH', '1992-05-10 12:30:00', 'M'),"
				+ "(17, 'Simran', 'Bhat', 'simran.bhat@example.com', 'Bhat', 9876543117, '2024-05-15', 117, 60000.00, 30, '321 Q Road, New Friends Colony, Delhi, DL', '1995-06-15 08:45:00', 'F'),"
				+ "(18, 'Kunal', 'Singh', 'kunal.singh@example.com', 'Singh', 9876543118, '2024-06-15', 118, 65000.00, 31, '654 R Lane, Hauz Khas, New Delhi, DL', '1993-07-20 14:00:00', 'M'),"
				+ "(19, 'Neelam', 'Patel', 'neelam.patel@example.com', 'Patel', 9876543119, '2024-07-15', 119, 57000.00, 28, '987 S Road, Malad, Mumbai, MH', '1996-08-25 11:45:00', 'F'),"
				+ "(20, 'Ravi', 'Soni', 'ravi.soni@example.com', 'Soni', 9876543120, '2024-08-15', 120, 59000.00, 29, '159 T Lane, Andheri, Mumbai, MH', '1994-09-30 13:15:00', 'M')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			int data = statement.executeUpdate(insertQuery);

			if (data > 0) {
				System.out.println("Connected Successfull ");
			} else {
				System.out.println("not connected");
			}

		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

}
