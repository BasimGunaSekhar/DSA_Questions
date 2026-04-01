package prac;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int n=1010;
		int i=1;
		int sum=0;
		while(n>0) {
			int b=n%10;
			sum+=b*i;
			i*=2;
			n/=10;
		}
		System.out.println(sum);
	}
}
