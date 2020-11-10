package br.com.hackathon.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.UUID;

public class HashUtil {

	public static String encryptPW(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger no = new BigInteger(1, messageDigest);
			String hashtext = no.toString(16);
			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	public static int getRandomNumberInRange(int minimo, int maximo) {
        Calendar lCDateTime = Calendar.getInstance();
        return (int)(lCDateTime.getTimeInMillis() % (maximo - minimo + 1) + minimo);
	}
	
}
