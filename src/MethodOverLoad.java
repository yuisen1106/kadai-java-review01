
public class MethodOverLoad {

	public static void main(String[] args) {
		add(20,30);
		add(10,50,40);
		add(10.2,6.8);


	}

	public static void add(int num1, int num2) {
		System.out.println("int型2つの加算結果"+(num1+num2));

	}

	public static void add(int num1,int num2,int num3) {
		System.out.println("int型3つの加算結果"+(num1+num2+num3));

	}

	public static void add(double num1,double num2) {
		System.out.println("doubke型2つの加算結果"+(num1+num2));

	}

}
