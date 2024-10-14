 import java.util.Scanner;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();
        if (n < 1 || n > 10) {
            System.out.println("Nilai harus 1-10 masbro.");
        } else {
            Matriks tabel = new Matriks();
            tabel.buatTabelPerkalian(n);
        }
        input.close();
    }