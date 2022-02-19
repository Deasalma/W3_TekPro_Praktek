package bigNumber;
import java.math.*;
/**
 * <h1> Soal 6 </h1>
 * <h2> Big Number </h2>
 * <p> Menjumlahkan dan mengalikan bilangan besar. Angka-angka ini sangat besar sehingga Anda tidak 
 * dapat memuatnya dalam tipe data biasa seperti integer maupun long.
 *  </p>
 *  @author Dea
 *  @version 1.0
 *  @since 18-02-2022
 */
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String bil1, bil2;
		bil1 = keyboard.nextLine();
		bil2 = keyboard.nextLine();
		keyboard.close();
		System.out.println(new BigInteger(bil1).add(new BigInteger(bil2)));
		System.out.println(new BigInteger(bil1).multiply(new BigInteger(bil2)));
	}

}
