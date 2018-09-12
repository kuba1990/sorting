import java.util.Random;
import java.util.Scanner;

public class ShellSorting {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner number = new Scanner(System.in);
        int i, n, x, j, h;

        int[] tab = new int[100];

        System.out.println("Shell sorting");
        System.out.println("\n" +
                "How many numbers do you want to draw?");
        n = number.nextInt();

        System.out.println("Tab before sorting :");
        for (i = 0; i < n; i++) {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }


        for (h = 1; h < n; h = 3 * h + 1) ;

        h = h / 9;

        if (h == 0) {
            h = h + 1;
        }

        System.out.println();
        System.out.println("shift = " + h);

        //sorting
        while (h > 0) {
            for (j = n - h - 1; j >= 0; j--) {
                x = tab[j];
                i = j + h;
                while ((i < n) && (x > tab[i])) {
                    tab[i - h] = tab[i];
                    i = i + h;
                }
                tab[i - h] = x;
            }
            h = h / 3;
        }

        System.out.println("Tab after sorting:");
        for (i = 0; i < n; i++)
            System.out.print(tab[i] + " ");
        System.out.println();

    }
}