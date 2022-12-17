public class s999752_cw_5 {

    //******************Zadanie 1
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = scanner.nextInt();
        wypis(n);
    }

    public static void wypis(int x) {
        if (x > 0) {
            for (int i = 0; i <= x; i++) {
                System.out.println(i + ", ");
            }
        } else {
            for (int i = 0; i >= x; i--) {
                System.out.println(i + ", ");
            }
        }
    }
    */

    //******************Zadanie 2
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int count = scanner.nextInt();
        System.out.println("Ciag Fibonacciego:");
        System.out.println(n1 + "\n" + n2);
        fib(count-2);
    }
    static int n1=0,n2=1,n3=0;
    static void fib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + "\n");
            fib(count - 1);
        }
    }
    */

    //******************Zadanie 3
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            n--;
        }
        wzorek(n);
    }

    public static void wzorek(int w){
        for (int i=1; i<=w; i++){
            int x=0;
            System.out.println("");
            while(x<i){
                System.out.print("*");
                x++;
            }
        }
    }
    */


    //******************Zadanie 4
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 3 liczby:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        rysowanie(x, y, z);
    }

    public static void rysowanie(int a, int b, int c) {
        int[] tab = {a, b, c};
        int max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
        }
        int max2 = max;
        for (int i = 0; i < max; i++) {
            max2 -= 1;
            for (int j = 0; j < tab.length; j++) {
                if (tab[j] > max2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    */
}



















