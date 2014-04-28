package core;

import java.math.BigInteger;

/*
 * A program that allows you to encrypt and decrypt messages with RSA.
 * 
 * By Tylor Lake and Aaron Cohn
 */

public class RSATest {

	public static void main(String[] args) {
		RSAKeyPair keys = Cryptography.generateRSAKeys();
		
		String plainText = "Hello, world!";
		System.out.println("Message: " + plainText);
		
		BigInteger cipherText = Cryptography.encrypt(plainText, keys.getPublicKey());
		System.out.println("Cipher: " + cipherText);
		
		String decodedText = Cryptography.decrypt(cipherText, keys.getPrivateKey());
		System.out.println("Original text: " + decodedText);
	}
}
