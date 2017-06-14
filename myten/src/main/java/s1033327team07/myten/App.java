package s1033327team07.myten;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		try {
			mytentest01.test();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Readcsv01 myReadcsv01 = new Readcsv01();
		myReadcsv01.test01("./mycsv/test.csv");
		myReadcsv01.test01("./mycsv/train.csv");
	}
}