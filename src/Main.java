package src;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 3);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);

        int d = calc.devide2.apply(a, b);

        //вызов этого метода с переменной c приведёт к ошибке, т.к. делить на ноль нельзя
        //calc.println.accept(с);

        // в этом случае ошибки не будет
        calc.println.accept(d);

        System.out.println(calc.isNull.test(b) ? "На ноль делить нельзя" : "");
    }
}