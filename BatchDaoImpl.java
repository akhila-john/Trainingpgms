package daomodel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BatchDaoImpl implements BatchDao {

	public List<Batch>getAllBatches() {
		
		List<Batch>batch = new ArrayList<Batch>();
		String query ="SELECT * FROM batchdetails";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				Batch b = new Batch();
				b.setBatchid(res.getInt("batchid"));
				b.setBatchname(res.getString("batchname"));
				b.setFee(res.getInt("fee"));
				b.setTeacherid(res.getInt("teacherid"));
				batch.add(b);
			}
			}catch (SQLException e) {
			e.printStackTrace();
		}
		return batch;
	}
	
	
	public void addBatch(Batch batch) {
		String query ="INSERT INTO batchdetails VALUES("+batch.getBatchid()+","+"'"+batch.getBatchname()+"'"+","+"'"+
	      batch.getFee()+"'"+","+"'"+batch.getTeacherid()+"'"+")";
		try {
			Connection conn = GetConnection.GetConnection();
			Statement stmt = conn.prepareStatement(query);
			stmt.executeUpdate(query);
			System.out.println("inserted successfully");
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
