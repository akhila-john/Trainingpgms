package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BatchDaoImpl implements BatchDao {

	Connection conn = GetConnection.GetConnection();
	
public List<Batch>getAllBatches() {
		
		List<Batch>batch = new ArrayList<Batch>();
		String query ="SELECT * FROM batch_details";
		try {
			
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				Batch b = new Batch();
				b.setBatch_id(res.getInt("batch_id"));
				b.setBatch_name(res.getString("batch_name"));
				b.setFee(res.getInt("fee"));
				
				batch.add(b);
				conn.commit();
			}
			}catch (SQLException e) {
			e.printStackTrace();
		}
		return batch;
	}

public void addBatch(Batch batch) {
	String query ="INSERT INTO batch_details VALUES("+batch.getBatch_id()+","+"'"+batch.getBatch_name()+"'"+","+"'"+
      batch.getFee()+"'"+")";
	try {
		
		Statement stmt = conn.prepareStatement(query);
		stmt.executeUpdate(query);
		System.out.println("inserted successfully");
		conn.commit();
	}catch (SQLException e) {
		e.printStackTrace();
	}
}
	
}
