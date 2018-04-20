import java.util.Scanner;

public class FindTheLargestValue {  //tim gia tri lon nhat trong mang khong vượt quá 20
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number;
        int[] array;
        do {
            number = scanner.nextInt();
            if (number > 20) {
                System.out.println("Not to exceed 20");
                System.out.println("please enter again");
            }
        } while (number > 20);

        array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("sequence number");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("the largest number is " + max + " in position " + index);
    }
}