package Huffman.net.snielsen.huffman;
import java.io.*;

/**
 * Created by sophianielsen on 12/14/16.
 */
public class ReadFile {
	public static void main (String[] args) {
		try {
			File file = new File("text.txt");
			FileReader fileReader = new FileReader(file);

			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		}
		catch () {

		}
	}
}
