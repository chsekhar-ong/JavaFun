package exceptions;

public class GarbageCollector {
	
	
	public void finalize(){
		
		System.out.println("Garbage Collector is on progress ......");
	}
	public static void main(String[] args) {
		
		GarbageCollector gc=new GarbageCollector();
		GarbageCollector gc1=new GarbageCollector();
		GarbageCollector gc2=new GarbageCollector();
		new GarbageCollector();
		gc=null;
		gc1=gc2;
		System.gc();
		Runtime.getRuntime().gc();
		
	}

}
