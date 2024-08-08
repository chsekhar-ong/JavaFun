package exceptions;

public class HeapExp {

	public static void main(String[] args) {
		HeapExp he=new HeapExp();
		he.heapsize();
	}
	public void heapsize() {
		int size=10;
		for(int i=0;i<=Integer.MAX_VALUE;i++) {
			int[] arr=new int[size];
			size=size*2;
			System.out.println(size);
			
		}
	}
}
	
