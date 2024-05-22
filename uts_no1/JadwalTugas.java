package UTS_NO1;
import java.util.ArrayList;
import java.util.Scanner;

class Tugas {
    private String nama;
    private String deskripsi;
    private String deadline;

    public Tugas(String nama, String deskripsi, String deadline) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.deadline = deadline;
    }

    // Override method toString() untuk mendapatkan representasi string dari objek Tugas
    @Override
    public String toString() {
        return "Nama Tugas: " + nama + "\nDeskripsi: " + deskripsi + "\nDeadline: " + deadline;
    }
}

1public class JadwalTugas {
    private ArrayList<Tugas> daftarTugas;

    public JadwalTugas() {
        this.daftarTugas = new ArrayList<>();
    }

    // Overload method tambahTugas() untuk fleksibilitas penambahan tugas
    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
    }

    public void tampilkanSemuaTugas() {
        if (daftarTugas.isEmpty()) {
            System.out.println("Jadwal tugas kosong.");
            return;
        }
        System.out.println("Jadwal Tugas:");
        for (Tugas tugas : daftarTugas) {
            System.out.println(tugas); // Memanggil method toString() yang sudah di-override
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JadwalTugas jadwal = new JadwalTugas();

        // Menu utama
        int pilihan = 0;
        while (pilihan != 3) {
            System.out.println("\nPilihan:");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Jadwal Tugas");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("\nTambah Tugas:");
                    System.out.print("Nama Tugas: ");
                    String namaTugas = scanner.nextLine();
                    System.out.print("Deskripsi: ");
                    String deskripsi = scanner.nextLine();
                    System.out.print("Deadline (tgl/bulan/tahun): ");
                    String deadline = scanner.nextLine();
                    jadwal.tambahTugas(new Tugas(namaTugas, deskripsi, deadline));
                    System.out.println("Tugas berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\nJadwal Tugas:");
                    jadwal.tampilkanSemuaTugas();
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak ada. Silakan pilih ulang 1-3.");
            }
        }

        scanner.close();
    }
}
