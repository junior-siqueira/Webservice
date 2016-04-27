package br.edu.fjn.ws.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		Date data = new Date(System.currentTimeMillis());  
		SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy"); 
		System.out.print(formatarDate.format(data));
		
		Date date = formatarDate.parse("30/04/2016");
		System.out.println();
		System.out.println(formatarDate.format(date));
		
		long dt = (date.getTime() - data.getTime())  + 3600000;
		System.out.println(dt / 86400000L);
		
		
	}
	
}
