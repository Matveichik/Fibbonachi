package Recursion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*


 Рекусрия для подсчета n-ого числа Фиббоначи

  Добавил контейнер для того чтобы уменьшить кол-во рекурсивных вызовов


*/


public class RecursionUpdate{

    static Map<Integer, BigInteger> cache = new HashMap<>();

    private BigInteger fib(int n){
        if (n<2){
            return BigInteger.valueOf(n);
        }
        if (cache.containsKey(n)){
            return cache.get(n);
        }else {
            BigInteger res = fib(n-1).add(fib(n-2));
            cache.put(n,res);
        }
        return cache.get(n);
    }


    private void run(){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(fib(n));
    }


    public static void main(String[] args) {
        double time  = 0.001; // константа для перевода мс в сек
        double startTime = System.currentTimeMillis(); // начало работы алгаритма
        new RecursionUpdate().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы для просмотра времени работы алгоритма
    }


}




