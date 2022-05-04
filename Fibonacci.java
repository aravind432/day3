package week1.day3;

public class Fibonacci {

	public static void main(String[] args) {
		int n=7,firstnum=0,secondnum=1;
		for(int i = 0;i<=n;i++) {
			System.out.println(firstnum+"");
			int nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
		}
	}
}
