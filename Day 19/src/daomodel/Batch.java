package daomodel;

public class Batch {

	private int batchid;
	private String batchname;
	private int fee;
	private int teacherid;
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	
	public String toString() {
		return this.getBatchid()+" "+this.getBatchname()+" "+this.getFee()+" "+this.getTeacherid();
	}
}
