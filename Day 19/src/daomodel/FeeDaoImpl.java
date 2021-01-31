package daomodel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FeeDaoImpl implements FeeDao {

	public void addFee(Fee fee) {
		String query ="INSERT INTO feedetails VALUES("+fee.getPaymentid()+","+"'"+fee.getStudentid()+"'"+","+"'"+
			      fee.getBatchname()+"'"+","+"'"+fee.getPaymentstatus()+"'"+")";
				try {
					Connection conn = GetConnection.GetConnection();
					Statement stmt = conn.prepareStatement(query);
					stmt.executeUpdate(query);
					System.out.println("inserted successfully");
					
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
	
	public void getBatches() {
		String query = "Select batchname FROM student where paymentstatus ='notpaid'";
	
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				String BatchName = res.getString("batchname");
				System.out.println(BatchName);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	}

