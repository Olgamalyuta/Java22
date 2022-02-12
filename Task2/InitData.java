package by.epam.Kovalenko.Task2;

import java.util.Scanner;

public class InitData {
   private int x;
    public int initData(String message) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(message);
        while (!scanner.hasNextInt()){
        scanner.nextLine();
            System.out.println("Вы ввели не целое число");
            System.out.println(message);}

        x=scanner.nextInt();
       return x;
    }

}
