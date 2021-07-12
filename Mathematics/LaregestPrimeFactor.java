

public class LaregestPrimeFactor{

	static long maxPrimeFactors(long n)
	{
		long maxPrime = -1;

		while (n % 2 == 0) {
			maxPrime = 2;

      n = n/2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				maxPrime = i;
				n = n / i;
			}
		}

		if (n > 2)
			maxPrime = n;

		return maxPrime;
	}

	public static void main(String[] args)
	{
		long n = 151;
		System.out.println(maxPrimeFactors(n));

		n = 25698751364526l;
		System.out.println(maxPrimeFactors(n));
	}
}


