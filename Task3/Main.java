package by.epam.Kovalenko.Task3;


public class Main {
    public static  void main(String[] args) {
        double result;
        String string;
        Input input = new Input();



        LogicJar logic= new LogicJar();
        Output output= new Output();

        string=input.initData("Введите выражение для подсчета, натуральные цифры, +,-,*,/");
        result= logic.calcString(string);
        output.showResult(string,result);
    }
}
