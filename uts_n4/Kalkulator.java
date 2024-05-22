package uts_n4;
import java.util.Scanner;

public class Kalkulator {

    // Method overloading untuk menghitung luas segitiga dengan alas dan tinggi
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method overloading untuk menghitung waktu tempuh dari jarak, kecepatan, dan percepatan
    public double calculateTime(double distance, double initialVelocity, double acceleration) {
        return (-initialVelocity + Math.sqrt(Math.pow(initialVelocity, 2) + 2 * acceleration * distance)) / acceleration;
    }

    // Method overloading untuk menghitung energi kinetik dari massa dan kecepatan
    public double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // Method overloading untuk menghitung gaya gravitasi antara dua objek
    public double calculateGravitationalForce(double mass1, double mass2, double distance) {
        final double G = 6.674 * Math.pow(10, -11); // Konstanta gravitasi universal
        return (G * mass1 * mass2) / Math.pow(distance, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Kalkulator
        Kalkulator formulaCalculator = new Kalkulator();

        // Meminta pengguna untuk memilih rumus yang ingin dihitung
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Waktu Tempuh (dari jarak, kecepatan, dan percepatan)");
        System.out.println("3. Energi Kinetik");
        System.out.println("4. Gaya Gravitasi");
        System.out.println("5. Keluar dari program");
        System.out.print("Pilih rumus yang ingin anda gunakan: ");
        int choice = scanner.nextInt();

        // Variabel untuk menyimpan hasil perhitungan
        double result = 0.0;

        // Meminta input yang diperlukan berdasarkan pilihan pengguna dan melakukan perhitungan
        switch (choice) {
            case 1:
                // Meminta input alas dan tinggi segitiga
                System.out.print("Masukkan alas segitiga: ");
                double base = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double height = scanner.nextDouble();

                // Menghitung luas segitiga
                result = formulaCalculator.calculateArea(base, height);
                System.out.println("Luas segitiga adalah: " + result);
                break;
            case 2:
                // Meminta input jarak, kecepatan awal, dan percepatan
                System.out.print("Masukkan jarak (meter): ");
                double distance = scanner.nextDouble();
                System.out.print("Masukkan kecepatan awal (m/s): ");
                double initialVelocity = scanner.nextDouble();
                System.out.print("Masukkan percepatan (m/s^2): ");
                double acceleration = scanner.nextDouble();

                // Menghitung waktu tempuh
                result = formulaCalculator.calculateTime(distance, initialVelocity, acceleration);
                System.out.println("Waktu tempuh adalah: " + result + " detik");
                break;
            case 3:
                // Meminta input massa dan kecepatan
                System.out.print("Masukkan massa (kg): ");
                double mass = scanner.nextDouble();
                System.out.print("Masukkan kecepatan (m/s): ");
                double velocity = scanner.nextDouble();

                // Menghitung energi kinetik
                result = formulaCalculator.calculateKineticEnergy(mass, velocity);
                System.out.println("Energi kinetik adalah: " + result + " joule");
                break;
            case 4:
                // Meminta input massa objek pertama, massa objek kedua, dan jarak di antara keduanya
                System.out.print("Masukkan massa objek pertama (kg): ");
                double mass1 = scanner.nextDouble();
                System.out.print("Masukkan massa objek kedua (kg): ");
                double mass2 = scanner.nextDouble();
                System.out.print("Masukkan jarak antara keduanya (meter): ");
                double distanceBetweenObjects = scanner.nextDouble();

                // Menghitung gaya gravitasi
                result = formulaCalculator.calculateGravitationalForce(mass1, mass2, distanceBetweenObjects);
                System.out.println("Gaya gravitasi antara kedua objek adalah: " + result + " N ");
                break;
            case 5:
                System.out.println("Terimakasih sampai jumpa kembali.");
                break;
            default:
                System.out.println("Pilihan anda tidak ada.");
        }
        
        scanner.close();
    }
}
