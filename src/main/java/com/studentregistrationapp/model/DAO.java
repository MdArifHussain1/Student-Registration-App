package com.studentregistrationapp.model;

import java.sql.ResultSet;

public interface DAO {
		public void connectDB();
		public boolean verifyCredentials(String email, String password);
		public void SaveReg(String name, String city, String email, String mobile);
		public ResultSet listAllRegistrations();
		public void deleteRegistration(String email);
		public void updateRegistration(String email, String mobile);
		
		
}
