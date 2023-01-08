import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите своё ФИО: ");
        String input = scan.nextLine();
        Instant start = Instant.now();
        String[] Human = input.split(" ");
        for (String word: Human) {
            System.out.print(word + " ");
        }
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        System.out.println();
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}