
package uts_no2;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    // Method untuk memeriksa apakah dua string adalah anagram
    public static boolean isAnagram(String str1, String str2) {
        // Menghilangkan semua spasi dan mengubah string menjadi huruf kecil
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Memeriksa jika panjang kedua string berbeda
        if (str1.length() != str2.length()) {
            return false;
        }

        // Mengubah string menjadi array karakter dan mengurutkannya
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Membandingkan array karakter yang telah diurutkan
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input dari pengguna
        System.out.println("Masukkan kata pertama:");
        String string1 = scanner.nextLine();
        System.out.println("Masukkan kata kedua:");
        String string2 = scanner.nextLine();

        // Memeriksa apakah kedua kata adalah anagram
        boolean result = isAnagram(string1, string2);

        // Menampilkan hasil
        if (result) {
            System.out.println("Kedua kata adalah anagram.");
        } else 
        { System.out.println("Kedua kata bukan anagram.");
        }
        scanner.close();
    }
}

