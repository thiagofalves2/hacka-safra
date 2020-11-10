package br.com.hackathon.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static String getDataFormat(Date data, String format) {
		DateFormat dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(data);
	}

	public static String getDateFormat(String data, String newFormat, String oldFormat) throws ParseException {
		DateFormat formatter = new SimpleDateFormat(oldFormat);
		Date dateObj = (Date) formatter.parse(data);
		String dataNova = getDataFormat(dateObj, newFormat);
		return dataNova;
	}
	
	public static String getDataProximoAno(String format) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 1);
		return getDataFormat(c.getTime(), format);
	}
	
	public static Date getDateFormat(String data, String format) throws ParseException {
		DateFormat formatter = new SimpleDateFormat(format);
		Date dateObj = (Date) formatter.parse(data);
		return dateObj;
	}	

	public static String getDataProxPagto(Integer diaPagto) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, diaPagto);
		calendar.add(Calendar.MONTH, 1);
		return getDataFormat(calendar.getTime(), "yyyy-MM-dd");
	}
	
	public static Date getProximaData(Integer qtdeDias) {
		Date currentDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DAY_OF_MONTH, qtdeDias);
        return c.getTime();
	}
	
	public static Date getProximaData(String data, Integer qtdeDias) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(getDateFormat(data, "dd/MM/yyyy"));
        c.add(Calendar.DAY_OF_MONTH, qtdeDias);
        return c.getTime();
	}
	
	public static String getDataFinalAssinatura(Integer diaPagto, Integer qtdePagto) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, diaPagto);
		calendar.add(Calendar.MONTH, qtdePagto);
		return getDataFormat(calendar.getTime(), "yyyy-MM-dd");
	}
	
	public static void main(String[] args) {
		System.out.println(getProximaData(1));
	}
}
