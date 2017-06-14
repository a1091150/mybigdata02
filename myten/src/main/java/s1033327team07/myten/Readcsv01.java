package s1033327team07.myten;

import java.util.*;
import java.io.FileReader;

import com.opencsv.*;

public class Readcsv01 {
	List<String []> mytestdata;
	List<String []> mytraindata;
	public Readcsv01() {
		mytestdata= new ArrayList<String[]>();
		mytraindata= new ArrayList<String[]>();
	}
	public void test01(String path) {
		try {
			CSVReader reader = new CSVReader(new FileReader(path));
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				mytestdata.add(nextLine);
				//System.out.print("\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void train01(String path) {
		try {
			CSVReader reader = new CSVReader(new FileReader(path));
			String[] nextLine;
			while ((nextLine = reader.readNext()) != null) {
				// nextLine[] is an array of values from the line
				mytraindata.add(nextLine);
				//System.out.print("\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
