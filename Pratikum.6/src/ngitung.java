public class ngitung {

    public void itungPrima() {
        /*Bilangan Prima*/
        System.out.println("===============================================");
        System.out.println("A. Deret bilangan prima dan bukan dari 0 - 20");
        System.out.println("===============================================");
        for (int num = 0; num <= 20; num++) {
            boolean isPrime = true;
            
            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.println(num + " adalah bilangan prima.");
            } else {
                System.out.println(num + " bukan bilangan prima.");
            }
        }
        System.out.println("===============================================");
    }
    
    /*Bilangan Ganjil Genap*/
    public void deretGanjilGenap() {
        System.out.println("\n=================================================");
        System.out.println("B. Deret bilangan ganjil dan genap dari 0 - 20");
        System.out.println("=================================================");
        int num = 0;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num + " adalah bilangan genap.");
            } else {
                System.out.println(num + " adalah bilangan ganjil.");
            }
            num++;
        }
        System.out.println("===================================================");
    }

    /*Huruf Z-A*/
    public void deretHurufZA() {
        System.out.println("\n===================================================");
        System.out.println("C. Deret huruf Z - A");
        System.out.println("===================================================");
        char letter = 'Z';
        do {
            System.out.print(letter + " ");
            letter--;
        } while (letter >= 'A');
        System.out.println();
        System.out.println("===================================================");
    }
    
    /*Anak Ayam*/
    public void laguAnakAyam() {
        System.out.println("\n===================================================");
        System.out.println("D. Lagu \"Anak Ayam Turun N\"");
        System.out.println("===================================================");
        for (int n = 10; n > 0; n--) {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            System.out.println("Prekotek kotek kotek");
        }
        System.out.println("===================================================");
    }
}
