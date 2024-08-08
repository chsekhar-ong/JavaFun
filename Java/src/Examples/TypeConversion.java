package Examples;

public class TypeConversion {

	static int a=256;
	static byte b=(byte)a;
	public static void main(String[] args) {
		int a=257;
		byte b=(byte)a;
		System.out.println(b);

	}

}
