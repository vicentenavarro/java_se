package workers;

public class T2 extends Thread{//Cualquier clase que extienda Tread se puede utilizar para implementar

	@Override
	public void run(){
		for(int i=70000;i<1500000;i++){
			System.out.println(i);
			try{
				sleep(1000);}
				catch(InterruptedException ie){
					System.out.println("¿Me han despertadoa las malas!");
				}
		}
	}
}
