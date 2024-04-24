package week11;
import java.io.FileWriter;
import java.io.*;
public class MyFileWriter {
	public  static void main(String args[]) throws IOException{
		try {
			FileWriter fw = new FileWriter("TestFile.txt");
			String s="\n All the best for your exams dear students.\n";
			char ch[]=s.toCharArray();
			for (int i=0; i<ch.length; i++)
				fw.write(ch[i]);
			s="good Luck and Prepare well.";
			fw.write(s);
			fw.close();
			int i=0;
			FileReader fr=new FileReader("TestFile1.txt");
			while ((i=fr.read())!= -1)
				System.out.print((char)i);
			fr.close();
		}
		catch (FileNotFoundException nfe) {
			System.out.print("Invalid File Name \n File does not exists");
		}
	}
}
