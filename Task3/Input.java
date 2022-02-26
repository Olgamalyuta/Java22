package by.epam.Kovalenko.Task3;
import java.util.Scanner;

public class Input {
    private String x;
    public String initData(String message) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(message);
        x=scanner.nextLine();
        return x;
    }

}