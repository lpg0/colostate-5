import java.util.Random;

public class Generator extends java.lang.Thread {
	//vars and object declaration
	Random randomWithSeed;
	//int sumOfPrimes;

	public Producer(Bdbuffer buff, int count, int id, int primeSeed) {
		//assign values to vars
		randomWithSeed = new Random(primeSeed);
		//when successful insert into buffer:
		//[Generator 1]: inserted 47 at index 0 at time 2022-03-09 23:48:09.09064
		//after the prime is inserted, prime should be added to sumOfPrimes (member of Generator)
		//getSumOfGeneratedPrimes() returns sumOfPrimes
	}

	@Override
	public void run() {
		//insert n-th prime to buffer as much as the count
		//random number n is from random generator in range [3, 31]
		//calculate the n-th prime number
		//use the the n-th number of primes to add into the buffer
		//you can generate a random number in the range [1, 10] as:
		//int randomN = randomWithSeed.nextInt(10-1+1) + 1;
	}

	/*public int getSumOfPrimes() {
		return this.sumOfPrimes;
	}*/
}
