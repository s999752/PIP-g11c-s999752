import java.util.Scanner;
import java.util.Random;

public class s999752_cw_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int n = scanner.nextInt();
        int[] tab = gen_tab(n);
        //******************Zadanie 1
        //print_tab(tab);

        //******************Zadanie 2
        // print_tab(sort_tab(tab));

        //******************Zadanie 3
        // print_tab(rev_tab(tab));

        //******************Zadanie 4
        //equ_rev_tab(tab, rev_tab(tab));
    }

    public static int rnd() {
        Random random = new Random();
        int r = random.nextInt(101);
        return r;
    }

    public static int[] gen_tab(int a) {
        int[] tab = new int[a];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rnd();
        }
        return tab;
    }

    public static void print_tab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static int[] sort_tab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                int liczbaA = tab[i];
                int liczbaB = tab[j];
                if (liczbaA > liczbaB) {
                    tab[i] = liczbaB;
                    tab[j] = liczbaA;
                }
            }
        }
        return tab;
    }

    public static int[] rev_tab(int[] tab) {
        int temp;
        int j=tab.length-1;
        for(int i=0; i<tab.length/2;i++){
            temp=tab[i];
            tab[i]=tab[j-i];
            tab[j-i]=temp;
        }

        return tab;
    }

    public static void equ_rev_tab(int[] tab, int[] tab2) {
        while (tab.length != tab2.length) {
            break;
        }
        int j = tab.length - 1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != tab2[j - i]) {
            break;
            }
        }
        System.out.println("Tablice są odwrotnością");
    }

}
