package model;

import java.util.List;



public interface BatchDao {

	List<Batch>getAllBatches();
	public void addBatch(Batch batch);
}
