import java.util.Scanner;

public class siakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom,menu;

        while(true) {
            System.out.println("-------------");
            System.out.println("PILIHAN MENU ");
            System.out.println("1. input data");
            System.out.println("2. output");
            System.out.println("3. exit");
            System.out.print("Masukkan pilihan menu : ");
            menu = sc.nextInt();

            if (menu == 1) {
                while (true) {
                System.out.print("Masukkan Nama : ");
                nama = sc.next();
                System.out.print("Masukkan Baris : ");
                baris = sc.nextInt();
                System.out.print("Masukkan Kolom : ");
                kolom = sc.nextInt();
                sc.nextLine();
    
                penonton[baris-1][kolom-1] = nama;
    
                System.out.print("Input penonton lainnya? (y/n) : ");
                next = sc.nextLine();
    
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
                }
            }
            else if (menu == 2) {
            System.out.println("daftar penonton");
            for (int i = 0; i < penonton.length; i++) {
                for(int j = 0; j < penonton[i].length; j++) {
                    System.out.println(penonton[i][j]);
                }
            }
            }
            else if (menu == 3) {
            break;
            }
        }
    }
}

