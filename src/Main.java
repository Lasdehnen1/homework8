import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] digits = new int[3];
        for (int index = 0; index < digits.length; index++) {
            digits[index] = index + 1;

        }


        double[] numbers = {1.57, 7.654, 9.986};

        int[] massive = {9, 7, 8, 3, 5};


    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] digits = new int[3];
        for (int index = 0; index < digits.length; index++) {
            digits[index] = index + 1;
            if (index == digits.length - 1) {
                System.out.print(digits[index]);

            }
            else {
                System.out.print(digits[index] + ", ");
            }
        }
        System.out.println();



        double[] numbers = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numbers));

        int[] massive = {9, 7, 8, 3, 5};

        for (int index = 0; index < massive.length; index++) {
            if (index == massive.length - 1) {
                System.out.println(massive[index]);
                break;
            }
            System.out.print(massive[index] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] digits = new int[3];
        for (int index = 0; index < digits.length; index++) {
            digits[index] = index + 1;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i] + (i != 0 ? ", " : ""));
        }
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + (i != 0 ? ", " : ""));
        }
        System.out.println();

        int[] massive = {9, 7, 8, 3, 5};
        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.print(massive[i] + (i != 0 ? ", " : ""));
        }
        System.out.println();

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] digits = new int[7];
        for (int index = 0; index < digits.length; index++) {
            digits[index] = index + 1;
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 != 0) {
                digits[i] = digits[i] + 1;

            }
            System.out.print(digits[i] + (i != (digits.length -1) ? ", " : ""));
        }
    }

    
}
