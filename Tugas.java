import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] a = new int[6][10];
        double[] rataResponden = new double[a[0].length];
        double[] rataPertanyaan = new double[a.length];
        double rataKeseluruhan = 0.0;
        int totalNilai = 0;

        System.out.println("Masukkan hasil survei untuk 10 responden (nilai 1-5 untuk setiap pertanyaan):");
        for (int j = 0; j < a[0].length; j++) {
            System.out.println("Responden " + (j + 1) + ":");
            for (int i = 0; i < a.length; i++) {
                System.out.print("  Pertanyaan " + (i + 1) + ": ");
                a[i][j] = input.nextInt();
                totalNilai += a[i][j]; 
            }
        }

        for (int j = 0; j < a[0].length; j++) {
            int sumResponden = 0;
            for (int i = 0; i < a.length; i++) {
                sumResponden += a[i][j];
            }
            rataResponden[j] = (double) sumResponden / a.length;
        }

        for (int i = 0; i < a.length; i++) {
            int sumPertanyaan = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumPertanyaan += a[i][j];
            }
            rataPertanyaan[i] = (double) sumPertanyaan / a[i].length;
        }

        rataKeseluruhan = (double) totalNilai / (a.length * a[0].length);

        System.out.println("\nRata-rata nilai untuk setiap responden:");
        for (int j = 0; j < rataResponden.length; j++) {
            System.out.println("Responden " + (j + 1) + ": " + rataResponden[j]);
        }

        System.out.println("\nRata-rata nilai untuk setiap pertanyaan:");
        for (int i = 0; i < rataPertanyaan.length; i++) {
            System.out.println("Pertanyaan " + (i + 1) + ": " + rataPertanyaan[i]);
        }

        System.out.println("\nRata-rata nilai keseluruhan: " + rataKeseluruhan);
    }
}
