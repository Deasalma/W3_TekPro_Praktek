package gajiAgen;
import java.util.Scanner;
/**
 * <h1> Soal 4 </h1>
 * <h2> Gaji Agen </h2>
 * <p>Dalam sebuah agent penjualan. 
 * Agent akan menerima gaji pokok sebesar Rp.500.000,00 perbulan. 
 * Agent akan menerima bonus penjualan sebesar 25% dari total penjualan item jika berhasil menjual minimal 40 item. 
 * Agent akan menerima bonus penjualan 35% dari total penjualan jika berhasil menjual diatas 80 item. 
 * Namun, Jika Agent menjual dibawah 15 item akan menerima denda pemotongan gajih pokok sebesar 15% dari total minus penjualan ke 15 item. 
 * Selain itu agenhanya menerima bonus 10% setiap itemnya. 
 * Harga setiap item adalah Rp.50.000,00
 * </p>
 * @author Dea
 * @version 1.0
 * @since 18-02-2022
 *
 */

public class GajiAgen {
	public static final int gajiPokok = 500000;
	public static final int hargaItem = 50000;
	public static void main(String[] args) {
		int gaji;
		Scanner keyboard = new Scanner (System.in);
			short penjualan = keyboard.nextShort();
			keyboard.close();
			if (penjualan > 80) {
				gaji = (int)(0.35*(hargaItem*penjualan) + gajiPokok);
			}else if(penjualan > 40) {
				gaji = (int)(0.25*(hargaItem*penjualan) + gajiPokok);
			}else if (penjualan < 15) {
				gaji =(int)( gajiPokok - (0.15*((15-penjualan)*hargaItem)));
			}else {
				gaji = (int)(0.1*(hargaItem*penjualan)+gajiPokok);
			}
		System.out.println(gaji);
	}
}
