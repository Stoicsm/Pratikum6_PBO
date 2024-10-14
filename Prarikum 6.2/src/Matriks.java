public class Matriks {

    public void buatTabelPerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {   
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}