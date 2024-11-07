import java.util.*;

public class BioskopWithScanner01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                do {
                    System.out.print("Masukkan Nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan Baris (1-4): ");
                        baris = sc.nextInt();
                        if (baris >= 1 && baris <= penonton.length) {
                            break;
                        } else {
                            System.out.println("Nomor baris tidak tersedia. Silakan coba lagi.");
                        }
                    }

                    while (true) {
                        System.out.print("Masukkan Kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        if (kolom >= 1 && kolom <= penonton[0].length) {
                            break;
                        } else {
                            System.out.println("Nomor kolom tidak tersedia. Silakan coba lagi.");
                        }
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                } while (next.equalsIgnoreCase("y"));
            }
            System.out.println();
            if (menu == 2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
                }

            }

            if (menu == 3) {
                break;
            }
        }
        sc.close();
    }
}
