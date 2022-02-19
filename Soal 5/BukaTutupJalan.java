package bukaTutupJalan;
import java.util.*;
/**
 * <h1> Soal 5 </h1>
 * <h2> Buka Tutup Jalan  </h2>
 * <p> Buka tutup jalan merupakan hal yang lumrah ada di pengaturan jalan khususnya di Indonesia.
 * Buka tutup jalan kali ini memiliki aturan yang disempurnakan. 
 * Setiap empatmobil yang lewat digabung setiap angkanya. 
 * Jika (gabungan angka tersebut dikurangi 999999) hasilnya dibagi 5 sisa bagi hasilnya 0 maka 4 mobil tersebut harus berhenti,
 * dan memperbolehkan mobil lainnya dari arah bersebrangan untuk jalan. Begitu terus sebaliknya.
 * </p>
 * @author Dea
 * @version 1.0
 * @since 18-02-2022
 */


public class BukaTutupJalan {
	public static final int pengurang = 999999;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String plat= keyboard.nextLine();
		keyboard.close();
		String temp = plat.replaceAll("\\s","" );
		Long noKendaraan = Long.parseLong(temp);
		if((noKendaraan - pengurang )%5 == 0) {
			System.out.println("jalan");
		}else {
			System.out.println("berhenti");
		}
	}
}
