package ru.skryabinegor.homework;

import java.util.Scanner;

public class homework<printHello>
{
    public static void main(String[] args)
    {

        {
            // 2. Mission.
            byte by = 1;
            short sh = 2;
            int in = 4;
            long lo = 8l;

            float fl = 0.4f;
            double dou = 0.8;

            char ch = 'w';

            boolean bool = true;
            boolean bool1 = false;
        }
        {    // 3. Mission
            int a = 2;
            int b = 3;
            int c = 50;
            int d = 10;
            int sum = a * (b + (c / d));
            System.out.println(sum);
        }
        {       // 4. Mission
            int k = 5;
            int j = 7;
            boolean bool2 = ((j + k > 10.0) && (j + k <= 20.0));
            if (bool2)
            {
                System.out.println("True");
            }
            else
                {
                System.out.println("False");
        }
            }
                 // 5. Mission
            int number = 55;
        boolean bool3 = (number >= 0) && (number < 0);

       if (number >= 0)
        {
            System.out.println("Positive number");

        }

            else
                {
                System.out.println("Negative number");
        }
        {
            // 6. Mission (Задания вообще не понял, по - этому, списал всё с урока 0_0)
           int numb = 110;
            boolean bool4 = numb > 0;

            if (numb > 0)
            {
                System.out.println("Positive number");
            }
            else if (true)
            {

            }
            else;


        }
        {


        }

            // 7. Mission
            printHello("Egor");
            printHello("Pomidor");




        }


        static void printHello (String name)
        {
            System.out.println("Hello" + name);
        }
        // 8. Mission ( Метод нашёл в интернете, но не смог его преобразить в действующий.)
    static boolean isLeapYear (int year)
    {

        boolean g = true;
        if (((year % 4 == 0 && year % 400 == 0 && year % 100 != 0)))
        {
            System.out.println("Год " + year + " високосный: " + g);

            return g;
        }
        else
        {
            g = false;

            System.out.println("Год " + year + " високосный: " + g);

            return g;
        }
    }

    }

 /* Методы в первых 6 заданиях не проставил, потому, что не понял зачем они там нужны, если всё и так работает.
    До вебинаров не успел пройти Основы программирования, поэтому не судите строго.
  */



