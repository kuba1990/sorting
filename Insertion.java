
public class Insertion {
    public static void insertionSort(int[] input) {

        for (int i = 1; i < input.length; i++) {

            int number = input[i];

            int j = i;

            while ((j > 0) && (input[j - 1] > number)) {
                input[j] = input[j - 1];
                j--;
            }

            input[j] = number;
        }
    }


    public static void showTable(int[] input) {

        for (int x : input) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] tab = {9, 8, 7,};


        showTable(tab);

        insertionSort(tab);

        showTable(tab);
    }
}