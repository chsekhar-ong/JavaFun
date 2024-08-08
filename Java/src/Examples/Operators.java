package Examples;

public class Operators {


	public static void main(String[] args) {

		Operators op=new Operators();
		op.arithematic(10, 20);
		op.unary(2, 3);
		op.relational(7, 5);
		op.condition(15, 13);
		op.Assignment(11);
	}
	public void arithematic(int i,int j) {

		System.out.println("Two components are added :"+(i+j));
		System.out.println("Two components are seggregated:"+(i-j));
		System.out.println("Two components are compounded:"+(i*j));
		System.out.println("Two components are divided and coefficient:"+((double)i/j));
		System.out.println("Two components are divided and reminder : "+(i%j));



	}
	public void unary(int i,int j) {

		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(--i);
		System.out.println(i);
		System.out.println(i--);
		System.out.println(i);
	}
	public void relational(int i,int j) {

		System.out.println("check the relation equal:"+ " "+(i==j));
		System.out.println("check the relation not equal:"+" "+(i!=j));
		System.out.println("check the relation greater valaue:"+" "+(i<j));
		System.out.println("check the relation lesser than value:"+" "+(i>j));
		System.out.println("check the relation greater than equal:"+" "+(i>=j));
		System.out.println("check the relation less than or equal:"+" "+(i<=j));

	}

	public void condition(int i,int j) {
		System.out.println("check expression:"+" "+(i>=j || i<=j));
		System.out.println("check expression:"+" "+(i==j || i>=j));
		System.out.println("check expression:"+" "+(i<=j || i==j));
		System.out.println("check expression:"+" "+(i<=j && i!=j));
		System.out.println("check expression:"+" "+(i>=j && i==j));
		System.out.println("check expression:"+" "+(i>=j && i!=j));
	}
	public void Assignment(int i) {
System.out.println("Add the new value to i:"+ " "+(i+=5));
System.out.println("Remove the from the value of i :"+ " "+(i-=3));
System.out.println("multiply with new value: "+" "+(i*=4));
System.out.println("Divide and coeffieient:"+" "+(i/=3));
System.out.println("Reminder of the division:"+" "+(i%=12));
	}



}
