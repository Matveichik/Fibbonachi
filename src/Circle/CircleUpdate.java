package Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;



/*


 Цикл для подсчета n-ого числа Фиббоначи


//todo: Сделать так чтобы была возможность вводить n числа из 18 нулей и больше


*/

public class CircleUpdate {

    private static final int MOD = (int) (1e9+7);


    private int fib(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i<n; i++){
            int c =(a+b)  %  MOD;
             a = b;
             b = c;
        }
        return b+a;
    }


    private void run() throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
    }


    public static void main(String[] args) throws IOException {
        double time  = 0.001; // константа для перевода мс в сек
        double startTime = System.currentTimeMillis(); // начало работы алгаритма
        new CircleUpdate().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы для просмотра времени работы алгоритма
    }
}