package Huffman.net.snielsen.huffman;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sophianielsen on 12/10/16.
 */
public class Histogram {

	private ArrayList<Integer> count = new ArrayList<>();
	private ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p','q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z'));

	private String toString(String string) {
		System.out.println(string);
		return string;
	}

	private void count(char c) {
		if (count.size() == 0) {
			this.reset();
		}
		int index = alphabet.indexOf(c);
		int thisCount = count.get(index);
		thisCount++;
		count.set(index,thisCount);
	}

	private void count(String string) {
		string = string.toLowerCase();
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				this.count(string.charAt(i));
			}
		}
	}

	private void reset() {
		count.clear();
		for(int i = 0; i < 26; i++) {
			count.add(i, 0);
		}
	}

	private int freq(char c) {
		int index = alphabet.indexOf(c);
		return count.get(index);
	}


	public static void main(String [] args) {
		Histogram h = new Histogram();
		System.out.println(h);

		//Tests toString
		h.toString("Hello World");

		//Tests count character
		System.out.println(h.alphabet);
		System.out.println(h.count);
		h.count('c');
		System.out.println(h.alphabet);
		System.out.println(h.count);
		h.count('c');
		System.out.println(h.alphabet);
		System.out.println(h.count);
		h.count('x');
		System.out.println(h.alphabet);
		System.out.println(h.count);

		//Tests reset
		h.reset();
		System.out.println(h.count);

		//Tests count string

		//small string
		String string = "hello";
		h.toString(string);
		h.count(string);
		System.out.println(h.count);
		h.reset();

		//larger string
		string = "thequickbrownfoxjumpsoverthelazydog";
		h.toString(string);
		h.count(string);
		System.out.println(h.count);
		h.reset();

		//string with spaces
		string = "the quick brown fox jumps over the lazy dog";
		h.toString(string);
		h.count(string);
		System.out.println(h.count);
		h.reset();

		//string with spaces and capital letter
		string = "Hello from the other side";
		h.toString(string);
		h.count(string);
		System.out.println(h.alphabet);
		System.out.println(h.count);

		// Tests freq character
		int freqC = h.freq('c');
		System.out.println(freqC);
		int freqD = h.freq('d');
		System.out.println(freqD);
		int freqE = h.freq('e');
		System.out.println(freqE);
	}
}