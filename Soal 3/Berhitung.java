package berhitung;
import java.util.Scanner;
/**
 * <h1> Soal 3 </h1>
 * <h2> Berhitung  </h2>
 * <h3> Terdapat 5 buah operator matematika:</h3>
 * <ul> 
 * <li> Penjumlahan, direpresentasikan dengan '+'. </li>
 * <li> Pengurangan, direpresentasikan dengan '-'. </li>
 * <li> Perkalian, direpresentasikan dengan '*'. </li>
 * <li> Pembagian, direpresentasikan dengan '/'. </li>
 * <li> Sisa hasil bagi, direpresentasikan dengan '%'. </li>
 * </ul>
 * @author Dea
 * @version 1.0
 * @since 17-02-2022
 *
 */

public class Berhitung {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Selamat Datang di Kalkulator D4 Teknik Informatika");
		System.out.println("================================================");
		int A = keyboard.nextInt();
		char operators = keyboard.next().charAt(0);
		int B = keyboard.nextInt();
		keyboard.close();
		
		switch(operators) {
		case '+': System.out.printf("Hasil   :  %d", A+B);break;
		case '*': System.out.printf("Hasil   :  %d", A*B);break;
		case '-': System.out.printf("Hasil   :  %d", A-B);break;
		case '/': System.out.printf("Hasil   :  %d", A/B);break;
		case '%': System.out.printf("Hasil   :  %d", A%B);break;
		default:System.out.println("tidak dapat melakukan operasi");
		}
	}

}
