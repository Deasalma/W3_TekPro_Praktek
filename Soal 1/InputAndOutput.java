package inputAndOutput;
import java.util.Scanner;
/**
 *<h1> Soal 1</h1>
 *<h2> Input And Output </h2>
 *<p>Given a string,s, matching the regular expression [A-Za-z !,?._'@]+
 * split the string into tokens. We define a token to be one or more consecutive Englishalphabetic letters. 
 * Then, print the number of tokens, followed by each token on a new line.</p>
 *<b>Constrain:</b>
 *<ul>
 *<li>panjang s lebih dari 1 dan kurang dari 4 kali 10 pangkat 5</li>
 *<li>s is composed of any of the following:
 *<ol>
 *<li>English alphabetic letters</li>
 *<li>blank space </li>
 *<li>exclamation points</li>
 *<li>commas
 *<li>question marks </li>
 *<li>periods </li>
 *<li>underscores</li>
 *<li>apostrophes</li>
 *<li>at symbols</li>
 *</ol>
 *</ul>
 * 
 * @author Dea
 * @version 0.1
 * @since 17-02-2022
 *
 */

public class InputAndOutput {
	public static void main(String[] args) {
		
		//Mengambil input dari keyboard
		Scanner keyboard = new Scanner(System.in);
		String s = keyboard.nextLine();
		keyboard.close();
		
		//Memisahkan String berdasar karakter tertentu
		//s.trim() berguna menghapus spasi di bagian awal dan akhir 
		String[] token = s.trim().split("[!,?._'@\\ ]");
		
		//Menghitung panjang dari string yang telah dipisahkan
		int length = token.length;
		
		//Menampilkan panjang dari string yang telah dipisahkan
		System.out.println(length);
		
		//Menampilkan setiap kata dari string yang telah dipisahkan
		for(int i = 0; i < length; i++) {
			System.out.println(token[i]);
		}
		
	}

}
