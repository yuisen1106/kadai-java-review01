
public class Review01 {

	public static void main(String[] args) {
		int p=1500;
		double t=0.1;

		double taxTotal;
		taxTotal=tax(p,t);
		System.out.println(p+"円の商品の税込み価格は"+(p+(int)taxTotal));
		System.out.println("（消費税は"+(int)taxTotal+"円です。）");




	}

	public static double tax(double p,double t) {
		double result =p*t;
		return result;
	}
}
