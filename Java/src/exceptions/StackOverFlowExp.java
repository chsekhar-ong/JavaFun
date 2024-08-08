package exceptions;
//Exception in thread "main" java.lang.StackOverflowError

public class StackOverFlowExp {
	
	public static void main(String[] args) {
		StackOverFlowExp soe=new StackOverFlowExp();
		soe.stack(1);

		
	}
	
	public void stack(int i) {
		System.out.println(i);
		i++;
		stack(i);
	}

}
