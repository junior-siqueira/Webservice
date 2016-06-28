package br.edu.fjn.ws.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {

	public static String saveDate(){
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(data);
	}

	public static long compareDate(String dataFinal) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");	
		Date data = new Date(System.currentTimeMillis());
		
		Date date = dateFormat.parse(dataFinal);
		long result = (data.getTime() - date.getTime()) + 3600000;
		
		return result / 86400000L + 1;	
	}
	
}
