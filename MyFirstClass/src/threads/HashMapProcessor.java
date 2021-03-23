package threads;

 class HashMapProcessor implements Runnable {

	 private String[] strArr = null;
	 
	 public HashMapProcessor(String[] m) {
		 this.strArr = m;
	 }
	 
	 public String[] getMap() {
		 return strArr;
	 }
	 
	 public void run() {
		 processArr(Thread.currentThread().getName());
	 }
	 
	 private void processArr(String thrdName) {
		 for(int incr =0;incr<strArr.length; incr++)  {
			 //process data and append thread name
			 processSomething(incr);
			 addThreadName(incr, thrdName);
		 }
	 }
	 
	 private void addThreadName (int i, String thrdName) {
		 synchronized (this) { //synchronization block
		 strArr[i] = strArr[i] +":" + thrdName;
		 }
	 }
	 
	 private void processSomething(int index) {
		 //processing some job
		 try {
			 Thread.sleep(index * 1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	
}
