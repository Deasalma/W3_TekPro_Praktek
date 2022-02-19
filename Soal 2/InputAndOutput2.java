package inputAndOutput2;
import java.util.Scanner;
/**
 * <h1> Soal 2 </h1>
 * <h2> Input And Output(2) </h2>
 * <p> Fungsi System.out.printf pada Java dapat digunakan untuk mencetak output yang diformat.
 *  Tujuan latihan ini adalah untuk menguji pemahaman Anda tentang pemformatan output menggunakan printf.
 * </p>
 * @author Dea 
 * @version 1.0
 * @since 17-02-2022
 *
 */


public class InputAndOutput2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teks[] = new String[3];
		Short number[] = new Short[3];
		Scanner keyboard = new Scanner(System.in);

		//Mengambil input dari keyboard
		for (byte i = 0; i <3; i++) {
			teks[i]=keyboard.next();
			number[i] = keyboard.nextShort();
		}
		
		//Menampilkan output sesuai format
		System.out.println("==================================================");
		for (byte j = 0; j <3; j++) {
			System.out.printf("%-15s%03d %n",teks[j], number[j] );
		}
		keyboard.close();
		System.out.println("==================================================");
	}

}
