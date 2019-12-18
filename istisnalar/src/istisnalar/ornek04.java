package istisnalar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException; 

public class ornek04 {

	public static void main(String[] args){
		// TODO Auto-generated method stub 
		try {
			File dosya = new File("C:\\Users\\Nano\\eclipse-workspace\\DosyalamaIslemleri\\deneme.txt");
			BufferedReader bf = new BufferedReader(new FileReader(dosya));
			System.out.println(bf.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
