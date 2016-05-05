package br.edu.fjn.ws.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static String saveDate(){
		
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(data);
	}
	
	public static long compareDate(String dataFinal) throws ParseException{
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");	
		Date date = dateFormat.parse(dataFinal);
		long result = (data.getTime() - date.getTime()) + 3600000;
		return result / 86400000L;	
	}
	
	public static void main(String[] args) throws ParseException {
		
		/*Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.print(formatarDate.format(data));
		
		Date date = formatarDate.parse("20/04/2016");
		System.out.println();
		System.out.println(formatarDate.format(date));
		
		long dt = (data.getTime() - date.getTime())  + 3600000;
		System.out.println(dt / 86400000L);*/

		System.out.println(saveDate().toString());
		
		System.out.println(compareDate("20/04/2016"));
		
	}
}
