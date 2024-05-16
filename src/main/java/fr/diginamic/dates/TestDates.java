package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date= new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateS= format.format(date);
		System.out.println(dateS);
		
		Date date2= new Date(116,4,19,23,59,30);
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateS2= format2.format(date2);
		System.out.println(dateS2);
		String dateS3= format2.format(date);
		System.out.println(dateS3);
		
	}

}
