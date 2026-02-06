public class Main {
    public static void main(String[] args) {
        Lab1 lab = new Lab1();

        // create array
        int[] array = {5, 9, 3, 12, 7, 3, 11, 5};

        // Print array in order
        int i = 0;
        System.out.print("Array in order: ");
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        // Print array in reverse
        System.out.print("Array in reverse: ");
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        System.out.println();

        // First and last values
        System.out.println("First value: " + array[0]);
        System.out.println("Last value: " + array[array.length - 1]);

        // Call Lab1 methods
        System.out.println("Max of 5 and 9: " + lab.max(5, 9));
        System.out.println("Min of 5 and 9: " + lab.min(5, 9));
        System.out.println("Sum of array: " + lab.sum(array));
        System.out.println("Average of array: " + lab.average(array));
        System.out.println("Max of array: " + lab.max(array));
        System.out.println("Min of array: " + lab.min(array));
    }
}