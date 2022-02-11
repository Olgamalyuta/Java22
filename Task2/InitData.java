package by.epam.Kovalenko.Task2;

import java.util.Scanner;

public class InitData {
    int x;
    public int initData() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите длину катета");
        while (!scanner.hasNextInt()){
        scanner.nextLine();
            System.out.println("Вы ввели не целое число");
            System.out.println("Введите длину катета");}

        x=scanner.nextInt();
       return x;
    }

}
