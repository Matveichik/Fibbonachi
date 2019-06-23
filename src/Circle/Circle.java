package Circle;

import java.util.Scanner;


/*


 Цикл для подсчета n-ого числа Фиббоначи


 Уже работает быстрее по сравнению с рекурсией, однако стоит добавить контейнер, уже для готовых подсчетов.



*/

public class Circle {
    private static int fib(int n){
        if (n<2){
            return n;
        }
        else{
            int x = 1;
            int y = 1;
            int result = 0;
            for (int i = 2; i<= n; i++){
                result = x+y;
                x = y;
                y = result;
            }
            return result;
        }
    }


    private void run(){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println(fib(n));
    }


    public static void main(String[] args) {
        double time  = 0.001; // константа для перевода мс в сек
        double startTime = System.currentTimeMillis(); // начало работы алгаритма
        new Circle().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы для просмотра времени работы алгоритма
    }
}