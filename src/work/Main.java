package work;

import java.util.Scanner;

/**
 * Created by mfomi on 28.06.2017.
 */
public class Main {
    public static void main (String[] args){
        String name, city, hobby;
        int age;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите Ваше имя");
        name = scanner.nextLine();
        System.out.println("Введите Ваш город проживания");
        city = scanner.nextLine();
        System.out.println("Введите Ваш возраст");
        age = scanner.nextInt();
        System.out.println("Введите Ваше хобби");
        hobby = scanner.nextLine();

        


    }
}
