package src;

import java.util.function.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // если делитель(y) будет равен нулю, то это приведёт к возникновению
    // ошибки т.к. на ноль делить нельзя
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    // в этом случае ошибка не возникнет, т.к. выполняется проверка делителя(y)
    // и если делитель равен нулю, то возвращаемым значением будет делимое(x)
    BinaryOperator<Integer> devide2 = (x, y) -> y == 0 ? x : x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Predicate<Integer> isNull = x -> x == 0;

    Consumer<Integer> println = System.out::println;
}