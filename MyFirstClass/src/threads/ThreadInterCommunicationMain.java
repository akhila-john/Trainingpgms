package threads;

public class ThreadInterCommunicationMain {

	public static void main(String[] args) {
		//Book object on which wait and notify method will be called
		Book book = new Book("My first book");
		BookReader infyReader = new BookReader(book);
		BookReader ustReader = new BookReader(book);
		BookReader ibmReader = new BookReader(book);
		
		//book reader threads which will wait for completion for the book
		Thread infyThread = new Thread(infyReader, "Infosys");
		Thread ustThread = new Thread(ustReader, "ust");
		Thread ibmThread = new Thread(ibmReader, "ibm");
		
		infyThread.start();
		ustThread.start();
		ibmThread.start();
		
		//to ensure both readers started waiting for the book
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//BookWriter thread which will notify once book get completed
		BookWriter bookWriter = new BookWriter(book);
		Thread bookWriterThread = new Thread(bookWriter);
		bookWriterThread.start();
	}

}
