/*
 * Program to substitute cipher, in which each letter in the plain text is 'shifted' a certain number of places up or down the alphabet.
 * Encrypt and decrypt login passwords.
 * File name : Encryptor.java
 */

package caesarCipher;

/**
 * @author Abhijeet
 */

// package for swing to startup GUI
import javax.swing.*;

public class Encryptor {

	// declare and initialize the global variables
	public static String plainText, cipherText;
	public static int shift;

	// encryptor method for initialization of plain text and shift
	public Encryptor() {
		plainText = null;
		shift = 0;
	}

	// main method
	public static void main(String args[]) {

		// encryption block
		Encryptor e = new Encryptor();
		String strCipherText = e.Encrypt();
		System.out.print("Encrypted text: ");
		System.out.println(strCipherText);

		// decryption block
		// cipher text becomes the input text to the Decrypt method
		Encryptor d = new Encryptor();
		String strPlainText = d.Decrypt();
		System.out.print("Decrypted text: ");
		System.out.println(strPlainText);
		System.exit(0);
	}

	// method for encryption of plain text
	public String Encrypt() {

		// JOptionPane pop up, enter plain text to encrypt (convert to lower
		// case and trim white space)
		plainText = ((String) JOptionPane.showInputDialog("Enter words to encrypt")).toLowerCase().trim();
		// change of string to integer type using parseINT
		shift = Integer.parseInt(JOptionPane.showInputDialog("Enter offset downward's"));

		// declare and initialize the local variable
		int offset = 0, newOffset = 0;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		// declare a variable of string buffer for storing values of the input
		StringBuffer sb = new StringBuffer();
		int index = plainText.length();

		// loop for checking the alphabets that has to be encrypted
		for (int i = 0; i < index; i++) {
			String temp = "" + plainText.charAt(i);
			offset = alphabet.indexOf(temp);
			offset += shift;
			// if condition to check if value is greater than 25(26 alphabets
			// then values will be form 0-25)
			if (offset > 25) {
				newOffset = offset % 26;
				sb.append(alphabet.charAt(newOffset));
			}
			// if not greater than 25 else print the encrypted word
			else {
				sb.append(alphabet.charAt(offset));
			}
		}
		return sb.toString();
	}

	// method for decryption of cipher text
	public String Decrypt() {

		// JOptionPane pop up, enter cipher text to decrypt (convert to lower
		// case and trim white space)
		cipherText = ((String) JOptionPane.showInputDialog("Enter words to decrypt")).toLowerCase().trim();
		// change of string to integer type using parseINT
		shift = Integer.parseInt(JOptionPane.showInputDialog("Enter offset upward's"));
		
		// declare and initialize the local variable
		int offset = 0, newOffset = 0;
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		// declare a variable of string buffer for storing values of the input
		StringBuffer sb = new StringBuffer();
		int index = cipherText.length();
		
		// loop for checking the alphabets that has to be decrypted
		for (int i = 0; i < index; i++) {
			String temp = "" + cipherText.charAt(i);
			offset = alphabet.indexOf(temp);
			offset -= shift;
			// if condition to check if vale is not negative
			if (offset < 0) {
				newOffset = 26 + offset;
				sb.append(alphabet.charAt(newOffset));
			}
			// if not negative else print the decrypted word
			else {
				sb.append(alphabet.charAt(offset));
			}
		}
		return sb.toString();
	}
}
