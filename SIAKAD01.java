import java.util.*;

public class SIAKAD01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int siswa, matkul;
        System.out.print("Masukkan jumlah Siswa: ");
        siswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah: ");
        matkul = sc.nextInt();
        sc.nextLine();  

        int[][] nilai = new int[siswa][matkul];  
        int totalPerSiswa = 0;

        for (int i = 0; i < siswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            totalPerSiswa = 0;  

            for (int j = 0; j < matkul; j++) {
                System.out.print("Nilai Mata Kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];  
            }

            double rataRataSiswa = (double) totalPerSiswa / matkul;
            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + rataRataSiswa);
        }

        System.out.println("\n=====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j = 0; j < matkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < siswa; i++) {
                totalPerMatkul += nilai[i][j];  
            }

            double rataRataMatkul = totalPerMatkul / siswa;
            System.out.println("Mata Kuliah " + (j + 1) + ": " + rataRataMatkul);
        }
    }
}
