import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris , kolom, menu;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n==== MENU BIOSKOP ====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    
                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris atau kolom kursi tidak tersedia!");
                    } else if (penonton[baris - 1][kolom -1] != null) {
                        System.out.println("Peringatan: Kursi sudah terisi oleh penonton lain! Silahkan masukkan baris dan kolom kursi kembali");
                    } else {
                        penonton[baris - 1][kolom -1] = nama;
                        break;
                    }
                    penonton[baris-1][kolom-1] = nama;
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next=sc.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                
            } else if (menu == 2) {
                System.out.println("\n Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Baris ke-" + (i + 1) +   ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print("***");
                        } else {
                            System.out.print(penonton[i][j]);
                        }
                        if (j < penonton[i].length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Terima kasih");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}
