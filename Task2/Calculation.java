package by.epam.Kovalenko.Task2;

public class Calculation {
    private double max,min,sum;

    // Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
    //двух катетов.
    public  double calculPerim (double a, double b) {
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2))+b+a;

    }

    public  double calculSquare (double a, double b){
    return (a*b)/2;
    }

//Даны три действительных числа. Возвести в квадрат те из них, значения
//которых неотрицательны, и в четвертую степень — отрицательные.

    public double powCalc(double a) {
        if (a>=0) {a=Math.pow(a,2);} else {a=Math.pow(a,4);}
        return a;
    }
//Написать программу нахождения суммы большего и меньшего из трех чисел.
    public double sumMaxMin (double a, double b, double c){
        max=Math.max(Math.max(a,b),c);
        min=Math.min(Math.min(a,b),c);
        return sum=min+max;

    }


}
