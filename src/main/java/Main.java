import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Double t = scanner.nextDouble();
        t = t % 5;

        if (t >= 4)
            System.out.println("красный");
        else if (t >= 3)
            System.out.println("желтый");
        else
            System.out.println("зелёный");
    }
}
