package by.epam.Kovalenko.Task2;

public class Main {
    public static void main(String[] args) {
         double perim, square, powResult1, powResult2, powResult3,sumMinMax  ;
         int katet1, katet2 , a1, a2, a3;


        InitData input= new InitData();
        Calculation calc=new Calculation();
        ShowResult resultCalc=new ShowResult();

        katet1=input.initData("Введите длину катета");
        katet2= input.initData("Введите длину катета");
        perim=calc.calculPerim(katet1,  katet2);
        square=calc.calculSquare(katet1, katet2);
        resultCalc.showResult("Длина периметра ", perim);
        resultCalc.showResult("Площадь треугольника ", square);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        a1=input.initData("Введите число 1 ");
        a2=input.initData("Введите число 2 ");
        a3=input.initData("Введите число 3 ");
        powResult1=calc.powCalc(a1);
        powResult2= calc.powCalc(a2);
        powResult3= calc.powCalc(a3);
        resultCalc.showResult("Число, возведенное в степень: ",powResult1);
        resultCalc.showResult("Число, возведенное в степень: ",powResult2);
        resultCalc.showResult("Число, возведенное в степень: ",powResult3);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        sumMinMax= calc.sumMaxMin(a1, a2, a3);
        resultCalc.showResult("Сумма минимального и максимального числа: ", sumMinMax);


    }
}
