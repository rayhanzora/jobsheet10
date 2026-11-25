import java.util.Scanner;

public class Tugas {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvei = new int[10][6];
        int i, j;
        double totalPerResponden, rataResponden;
        double totalPerPertanyaan, rataPertanyaan;

        //Bagian A
        System.out.println("=== INPUT HASIL SURVEI ===");
        for (i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (j = 0; j < 6; j++) {
                System.out.print(" Pertanyaan ke-" + (j + 1) + " (1-5): ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }

        //Bagian B
        System.out.println("\n=== RATA-RATA SETIAP RESPONDEN ===");
        for (i = 0; i < 10; i++) {
            totalPerResponden = 0;
            for (j = 0; j < 6; j++) {
                totalPerResponden += hasilSurvei[i][j];
            }
            rataResponden = totalPerResponden / 6;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataResponden);
        }

        //Bagian C
        System.out.println("\n=== RATA-RATA SETIAP PERTANYAAN ===");
        for (j = 0; j < 6; j++) {
            totalPerPertanyaan = 0;
            for (i = 0; i < 10; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }
            rataPertanyaan = totalPerPertanyaan / 10;
            System.out.println("Responden ke-" + (j + 1) + ": " + rataPertanyaan);
        }

        sc.close();
    }
}
