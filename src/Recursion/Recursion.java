package Recursion;

import java.util.Scanner;


/*


 Рекусрия для подсчета n-ого числа Фиббоначи


 Не подходит для работы с большими числами


*/


public class  Recursion{

    private static int fib(int n){
        if (n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }




    private void run(){
        Scanner sc = new Scanner(System.in);
         Integer n = sc.nextInt();
        System.out.println(fib(n));
    }




    public static void main(String[] args) {
        double time  = 0.001; // константа для перевода мс в сек
        double startTime = System.currentTimeMillis(); // начало работы алгаритма
        new Recursion().run();
        double finalTime = System.currentTimeMillis(); // конец работы алгоритма
        System.out.println((finalTime - startTime)*time + " - Время работы алгоритма в секундах");  // методы для просмотра времени работы алгоритма
    }
}




//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long n = sc.nextLong();
//        sc.skip("\\s*");
//        String str = sc.nextLine();
//        long m = Long.parseLong(str);
//        find(n, m);
//        System.out.println(find(n, m));
//    }

