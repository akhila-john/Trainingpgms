package daomodel;

public class Fee {

	private int paymentid;
	private int studentid;
	private String batchname;
	private String paymentstatus;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getBatchname() {
		return batchname;
	}
	public void setBatchname(String batchname) {
		this.batchname = batchname;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	
	
	public String toString() {
		return this.getPaymentid()+" "+this.getStudentid()+" "+this.getBatchname()+" "+this.getPaymentstatus();
	}
}
