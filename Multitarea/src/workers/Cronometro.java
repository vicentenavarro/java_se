package workers;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Cronometro extends Thread{
	private static char siguienteId='A';
	private char id;
	boolean seguir=true;
	
	public Cronometro(){
		id=siguienteId;
		siguienteId++;
	}

	public void run(){
		Random rnd=new Random();
		int s=rnd.nextInt(15);//Segundos que se esta ejecuantdo Thread
		System.out.println();
		long t0=System.currentTimeMillis();
		while(seguir){
			
			GregorianCalendar c=new GregorianCalendar();
			System.out.println("Reloj "+id+" -> "+
					c.get(Calendar.HOUR_OF_DAY)
			+":"+c.get(Calendar.MINUTE)
			+":"+c.get(Calendar.SECOND)
			+":"+c.get(Calendar.MILLISECOND));
			
			try{
				sleep(1000);}
			catch(InterruptedException ie){
					System.out.println("¿Me han despertadoa las malas!");
				}
			long t1=System.currentTimeMillis();
			if(t1-t0>=s*1000) seguir=false;
		}
	}
	public void para(){
		seguir=false;}
	}
