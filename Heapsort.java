import java.util.Random;
import java.util.Scanner;

public class Heapsort {

    public static void main(String[] args) {
        Random los = new Random();
        Scanner liczba = new Scanner(System.in);
        int i, n, x, j, k, m;

        int[] tab = new int[100];

        System.out.println("Heap sort");
        System.out.println("\n" +
                "How many numbers do you want to draw?");
        n = liczba.nextInt();

        System.out.println("Tab before sorting:");
        for (i = 1; i < n + 1; i++) {
            tab[i + 1] = los.nextInt(100);
            System.out.print(tab[i + 1] + " ");
        }

        for (i = 2; i <= n + 1; i++) {
            j = i;
            k = j / 2;
            x = tab[i];
            while ((k > 0) && (tab[k] < x)) {
                tab[j] = tab[k];
                j = k;
                k = j / 2;
            }
            tab[j] = x;
        }


        for (i = n + 1; i > 1; i--) {
            x = tab[1];
            tab[1] = tab[i];
            tab[i] = x;

            j = 1;
            k = 2;

            while (k < i)//2<6
            {
                if ((k + 1 < i) && (tab[k + 1] > tab[k]))
                    m = k + 1;//k=4
                else
                    m = k;
                if (tab[m] <= tab[j]) break;

                x = tab[j];
                tab[j] = tab[m];
                tab[m] = x;
                j = m;
                k = j + j;
            }
        }

        System.out.println("after sorting:");
        for (i = 1; i < n + 1; i++) {
            System.out.print(tab[i + 1] + " ");
        }

    }
}