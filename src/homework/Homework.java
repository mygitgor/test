package homework;

import java.util.ArrayList;
import java.util.List;


public class Homework {
    public static void main(String[] args) {
        
        List<Integer> prostieChislo = prostieChislo(4);
        System.out.println(prostieChislo);

        List<Integer> diopasonChisel = diopasonChisel(-5, 7);
        System.out.println(diopasonChisel);

        int sumaChifer = sumaChifer(158);
        System.out.println(sumaChifer);
        
        System.out.println(aStepenB(3, 5));

        List<Integer> prostieChislondo1 = prostieChislo(4);
        System.out.println(prostieChislondo1);

        System.out.println(elenentCount(1,15));

        System.out.println(akerman(2, 3));

    }

   // Задача 63: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от 1 до N
    public static List<Integer> prostieChislo(int n){
        List<Integer> result = new ArrayList<>();
        if (n < 1) {
            System.out.println("N должно быть больше или равно 1.");
        } else {
            System.out.println("Натуральные числа от 1 до " + n + ":");
            for (int i = 1; i <= n; i++) {
                result.add(i);
            }
        }
        return result;
    }

    //Задача 65: Задайте значения M и N. Напишите программу, которая выведет все натуральные числа в промежутке от M до N.
    public static List<Integer> diopasonChisel(int m, int n){
        List<Integer> result = new ArrayList<>();
        for(int i = m; i <= n; i++){
            result.add(i);
        }
        return result;
    }

    //Задача 67: Напишите программу, которая будет принимать на вход число и возвращать сумму его цифр.
    public static int sumaChifer(int n){
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }

    //Задача 69: Напишите программу, которая на вход принимает два числа A и B, и возводит число А в целую степень B с помощью рекурсии.
    public static int aStepenB(int a, int b){
        if (b == 1) return a;
        {
            return a*aStepenB(a, b-1);
        }
    }

    //Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1.
    public static List<Integer> prostieChislon(int n){
        List<Integer> result = new ArrayList<>();
        System.out.println("Натуральные числа от 1 до " + n + ":");
        for (int i = n; i <= 1; i++) {
            result.add(i);
        }
        return result;
    }

    //Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.
    public static int elenentCount(int n, int m){
        int result = 0;
        System.out.println("сумму натуральных элементов " + n +" до "+ m +":");
        for (int i = n; i <= m; i++) {
            result += i;
        }
        return result;
    }

    //Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.
    public static int akerman(int n, int m){
        if (n == 0)
        return m + 1;
        else
      if ((n != 0) && (m == 0))
        return akerman(n - 1, 1);
        else
        return akerman(n - 1, akerman(n, m - 1));
    }
    

}
