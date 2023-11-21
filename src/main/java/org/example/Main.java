package org.example;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class Main {
            public static void main(String[] args) throws Exception {
         /*       System.out.println("Задание 1. Посмотрим и узнаем как можно написать программу проверки \n" +
                        "чисел гораздо меньше.");
                System.out.println("Введите два числа");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int max = (x > y) ? x : y;
                System.out.println("Max is " + max);

                ////////////////////////

                System.out.println("Задание 2. Вернемся к первоначальному виду (рис. 1). И изменим его, \n" +
                        "сделаем как на рисунке 3");
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();
                if(x2 > y2){
                    System.out.println("икс > игрик");
                }else
                    System.out.println("игрик > икс");

                /////////////////////////

                System.out.println("Задание 3.Сделаем поиск максимального числа из 3 введенных, используя \n" +
                        "тернарный оператор (рис.5).");
                System.out.println("Введите три числа ");
                int x3 = scanner.nextInt();
                int y3 = scanner.nextInt();
                int z3 = scanner.nextInt();
                int max3 = (x3 >= y3 && x3 >= z3) ? x3 : (y3 >= z3 && y3 > x3) ? y3 : z3;
                System.out.println(max3);

                ////////////////////////

                System.out.println("Задание 4. Научимся получать случайную цитату из сериала в java");
                String page = downloadWEbPage("https://api.breakingbadquotes.xyz/v1/quotes");
                int quote4 = page.lastIndexOf("quote");
                int author4 = page.indexOf("author");
                int author_4 = page.indexOf("\"}]");
                String strQuote = page.substring(quote4 + 7, author4 - 2);
                String strAuthor = page.substring(author4 + 9, author_4);
                String strShortQuote = page.substring(quote4 + 7, quote4 + 50);
                System.out.println(strQuote + "\n");

                /////////////////////////////////

                System.out.println("Задание 5. Возьмем код с 4 задания и добавим определение длины цитаты.");
                String page5 = downloadWEbPage("https://api.breakingbadquotes.xyz/v1/quotes");
                int quote5 = page5.lastIndexOf("quote");
                int author5 = page5.indexOf("author");
                int author_5 = page5.indexOf("\"}]");
                String strQuote5 = page5.substring(quote5 + 7, author5 - 2);
                         if(strQuote5.length() < 50){
                            System.out.println(strQuote5);
                        }else {
                            System.out.println(strQuote5.substring(0, 50) + "...");
                        }
                ////////////////////////////////
*/
               System.out.println("Задание 6. Самостоятельно перепишите данный код используя тернарные операторы.");
                String page = downloadWEbPage("https://api.breakingbadquotes.xyz/v1/quotes");
                int quote6 = page.lastIndexOf("quote");
                int author6 = page.indexOf("author");
                String strQuote6 = page.substring(quote6 + 7, author6 - 2);
                String text_50 = (strQuote6.length() < 50) ?strQuote6 : strQuote6.substring(0, 50) + "...";
                System.out.println(text_50 + " \n") ;

                /////////////////////////////

                System.out.println("Задание 7. Добавим вывод автора цитаты.\n");

                ////////////////////////////

                System.out.println("Задание 8. Самостоятельно добавьте вывод цитат только Walter White, \n" +
                        "используя тернарные операторы.");

                ///////////////////////////
            }

























    private static String downloadWEbPage(String url) throws IOException {
                StringBuilder result = new StringBuilder();
                String line;
                URLConnection urlConnection = new URL(url).openConnection();
                try (InputStream is = urlConnection.getInputStream();
                     BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
                    while ((line = br.readLine()) != null) {
                        result.append(line);
                    }
                }
                return result.toString();
            }


}
