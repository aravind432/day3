package week1.day3;

public class Primenumber {
	public static void main(String[] args) {
		int n=13;
		boolean prime=false;
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				prime=true;
				break;
			}
		}
		if(prime) {
			System.out.println(n+"is a prime number");
		}
		else {
			System.out.println(n+"is not a prime number");
		}

	}

}
