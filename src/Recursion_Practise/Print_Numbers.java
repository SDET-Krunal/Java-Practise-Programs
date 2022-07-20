package Recursion_Practise;

public class Print_Numbers {

    public static void print_numbers(int number, boolean reverse) {

        if (reverse && number == 0) {
            return;
        } else if (number == 6) {
            return;
        }

        System.out.println(number);

        if (reverse) {
            print_numbers(number - 1, true);
        } else {
            print_numbers(number + 1, false);
        }
    }

    public static void main(String[] args) {
        System.out.println("Print numbers from 5 to 1 in Descending order");
        print_numbers(5, true);

        System.out.println();

        System.out.println("Print numbers from 1 to 5 in Ascending order");
        print_numbers(1, false);
    }
}
