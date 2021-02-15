package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class FeeDaoImpl implements FeeDao {
	
	
public List<Fee>getAllFees(){
		
	Connection conn = GetConnection.GetConnection();
	
		List<Fee>fee = new ArrayList<Fee>();
		String query ="SELECT * FROM fee_details";
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				Fee f = new Fee();
				f.setPayment_id(res.getInt("payment_id"));
				f.setStudent_id(res.getInt("student_id"));
				f.setPayment_amount(res.getInt("payment_amount"));
				f.setPayment_status(res.getString("payment_status"));
				
                fee.add(f);
                conn.commit();
			}
			}catch (SQLException e) {
			e.printStackTrace();
		}
		return fee;
	}
	

	
}
	
	
