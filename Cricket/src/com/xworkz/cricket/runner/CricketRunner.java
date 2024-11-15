package com.xworkz.cricket.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.cricket.dto.CricketDto;
import com.xworkz.cricket.enums.CricketEnum;

public class CricketRunner {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prdstatement = null;

		CricketDto cricketDto1 = new CricketDto(1, "Virat", "Kohli", "viratk@example.com", "pass123", "Delhi", 35,
				1988 - 11 - 05, "M");
		CricketDto cricketDto2 = new CricketDto(2, "Rohit", "Sharma", "rohits@example.com", "pass456", "Mumbai", 36,
				1987 - 04 - 30, "M");
		CricketDto cricketDto3 = new CricketDto(3, "Jasprit", "Bumrah", "jaspritb@example.com", "pass789", "Ahmedabad",
				30, 1993 - 12 - 06, "M");
		CricketDto cricketDto4 = new CricketDto(4, "Hardik", "Pandya", "hardikp@example.com", "pass321", "Baroda", 31,
				1993 - 10 - 11, "M");
		CricketDto cricketDto5 = new CricketDto(5, "Ravindra", "Jadeja", "ravindraj@example.com", "pass654", "Jamnagar",
				34, 1988 - 12 - 06, "M");
		CricketDto cricketDto6 = new CricketDto(6, "Shikhar", "Dhawan", "shikhard@example.com", "pass987", "Delhi", 37,
				1985 - 12 - 05, "M");
		CricketDto cricketDto7 = new CricketDto(7, "KL", "Rahul", "klrahul@example.com", "pass213", "Bangalore", 31,
				1992 - 04 - 18, "M");
		CricketDto cricketDto8 = new CricketDto(8, "Rishabh", "Pant", "rishabhp@example.com", "pass546", "Delhi", 27,
				1997 - 10 - 04, "M");
		CricketDto cricketDto9 = new CricketDto(9, "Mohammed", "Shami", "mohammeds@example.com", "pass879", "Amroha",
				33, 1990 - 9 - 03, "M");
		CricketDto cricketDto10 = new CricketDto(10, "Yuzvendra", "Chahal", "yuzich@example.com", "pass135", "Haryana",
				34, 1990 - 07 - 23, "M");

		try {
			connection = DriverManager.getConnection(CricketEnum.URL.getValue(), CricketEnum.USERNAME.getValue(),
					CricketEnum.PASSWORD.getValue());
			prdstatement = connection.prepareStatement("INSERT INTO bescuites_info VALUES(?,?,?,?,?,?,?,?,?,?)");

			prdstatement.setInt(1, cricketDto1.getId());
			prdstatement.setString(2, cricketDto1.getF_name());
			prdstatement.setString(3, cricketDto1.getL_name());
			prdstatement.setString(4, cricketDto1.getEmail());
			prdstatement.setString(5, cricketDto1.getPassword());
			prdstatement.setString(6, cricketDto1.getAddress());
			prdstatement.setInt(7, cricketDto1.getAge());
			prdstatement.setInt(8, cricketDto1.getDob());
			prdstatement.setString(9, cricketDto1.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto2.getId());
			prdstatement.setString(2, cricketDto2.getF_name());
			prdstatement.setString(3, cricketDto2.getL_name());
			prdstatement.setString(4, cricketDto2.getEmail());
			prdstatement.setString(5, cricketDto2.getPassword());
			prdstatement.setString(6, cricketDto2.getAddress());
			prdstatement.setInt(7, cricketDto2.getAge());
			prdstatement.setInt(8, cricketDto2.getDob());
			prdstatement.setString(9, cricketDto2.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto3.getId());
			prdstatement.setString(2, cricketDto3.getF_name());
			prdstatement.setString(3, cricketDto3.getL_name());
			prdstatement.setString(4, cricketDto3.getEmail());
			prdstatement.setString(5, cricketDto3.getPassword());
			prdstatement.setString(6, cricketDto3.getAddress());
			prdstatement.setInt(7, cricketDto3.getAge());
			prdstatement.setInt(8, cricketDto3.getDob());
			prdstatement.setString(9, cricketDto3.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto4.getId());
			prdstatement.setString(2, cricketDto4.getF_name());
			prdstatement.setString(3, cricketDto4.getL_name());
			prdstatement.setString(4, cricketDto4.getEmail());
			prdstatement.setString(5, cricketDto4.getPassword());
			prdstatement.setString(6, cricketDto4.getAddress());
			prdstatement.setInt(7, cricketDto4.getAge());
			prdstatement.setInt(8, cricketDto4.getDob());
			prdstatement.setString(9, cricketDto4.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto5.getId());
			prdstatement.setString(2, cricketDto5.getF_name());
			prdstatement.setString(3, cricketDto5.getL_name());
			prdstatement.setString(4, cricketDto5.getEmail());
			prdstatement.setString(5, cricketDto5.getPassword());
			prdstatement.setString(6, cricketDto5.getAddress());
			prdstatement.setInt(7, cricketDto5.getAge());
			prdstatement.setInt(8, cricketDto5.getDob());
			prdstatement.setString(9, cricketDto5.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto6.getId());
			prdstatement.setString(2, cricketDto6.getF_name());
			prdstatement.setString(3, cricketDto6.getL_name());
			prdstatement.setString(4, cricketDto6.getEmail());
			prdstatement.setString(5, cricketDto6.getPassword());
			prdstatement.setString(6, cricketDto6.getAddress());
			prdstatement.setInt(7, cricketDto6.getAge());
			prdstatement.setInt(8, cricketDto6.getDob());
			prdstatement.setString(9, cricketDto6.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto7.getId());
			prdstatement.setString(2, cricketDto7.getF_name());
			prdstatement.setString(3, cricketDto7.getL_name());
			prdstatement.setString(4, cricketDto7.getEmail());
			prdstatement.setString(5, cricketDto7.getPassword());
			prdstatement.setString(6, cricketDto7.getAddress());
			prdstatement.setInt(7, cricketDto7.getAge());
			prdstatement.setInt(8, cricketDto7.getDob());
			prdstatement.setString(9, cricketDto7.getGender());
			prdstatement.addBatch();
			
			prdstatement.setInt(1, cricketDto8.getId());
			prdstatement.setString(2, cricketDto8.getF_name());
			prdstatement.setString(3, cricketDto8.getL_name());
			prdstatement.setString(4, cricketDto8.getEmail());
			prdstatement.setString(5, cricketDto8.getPassword());
			prdstatement.setString(6, cricketDto8.getAddress());
			prdstatement.setInt(7, cricketDto8.getAge());
			prdstatement.setInt(8, cricketDto8.getDob());
			prdstatement.setString(9, cricketDto8.getGender());
			prdstatement.addBatch();
			
			

			int value = prdstatement.executeUpdate();

			if (value > 0) {
				System.out.println("This is saved");
			} else {
				System.out.println("this is not saved");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
