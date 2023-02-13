package lesson2;

public class HomeWorkAppTwo {
    public static void main(String[] args) {
        limitEntryCheck(10, 5);
        checkNumberIsPositiveAndPrint(10);
        checkNumberIsPositive(10);
        printCountLines("Здравствуйте", 10);
        checkLeapYears(2070);
    }

    public static void limitEntryCheck(int a, int b) {
        if ((a + b) >=10 && (a + b) <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void checkNumberIsPositiveAndPrint(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void checkNumberIsPositive(int a) {
        if (a >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    public static void printCountLines(String line, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }

    public static void checkLeapYears(int year) {
        if ((year % 4) == 0 || (year % 400) == 0 && (year % 100) != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
