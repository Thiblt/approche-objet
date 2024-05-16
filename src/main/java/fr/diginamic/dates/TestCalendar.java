package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.set(2016,4,19,23,59,30);
		Date date= cal.getTime();
		Date date2= cal2.getTime();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dateS= format.format(date);
		System.out.println(dateS);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateS2= format2.format(date2);
		System.out.println(dateS2);
		
		SimpleDateFormat formatRusse = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
		SimpleDateFormat formatChinois = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
		SimpleDateFormat formatAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
		SimpleDateFormat formatFrançais = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
		String dateChinese= formatChinois.format(date2);
		System.out.println(dateChinese);
		String dateRusse= formatRusse.format(date2);
		System.out.println(dateRusse);
		String dateAll= formatAllemand.format(date2);
		System.out.println(dateAll);
		String dateFr= formatFrançais.format(date2);
		System.out.println(dateFr);
		
		
		

	}

}
