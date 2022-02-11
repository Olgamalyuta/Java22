package by.epam.Kovalenko.Task2;

public class Main {
    public static void main(String[] args) {
        double perim, square, katet1, katet2;

        InitData input= new InitData();
        katet1=input.initData();
        katet2= input.initData();

        perim=Calculation.calculPerim(katet1,  katet2);
        square=Calculation.calculSquare(katet1, katet2);
        ShowResult.showResult(perim, square);
    }
}
