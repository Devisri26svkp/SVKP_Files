package scannerclass_bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
public class BufferedReader1 {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\karum\\OneDrive\\Desktop\\Java Notes\\demo.txt"));
		String data="";
		while((data=br.readLine())!=null) {
			System.out.println(data);
		}
		br.close();
	}

}