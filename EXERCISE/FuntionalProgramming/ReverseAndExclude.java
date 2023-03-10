package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        //1. reverse on list
        Collections.reverse(numbers);

        //2. премахваме всички ел, които се делят на n
        //число -> дели ли се или не се дели на n (true/false)
        Predicate<Integer> checkDivision = number -> number % n == 0;
        //връща true -> n е делител на числото
        //връща false -> n не е делител на числото
        numbers.removeIf(checkDivision);
        //премахни елементите, за които checkDivision връща резултат true

        //3.отпечатваме крайния списък
        numbers.forEach(number -> System.out.print(number + " "));

    }
}
