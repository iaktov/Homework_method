import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        int enterYear = 2000;
        leapYear(enterYear);

        //Задание 2
        int yearOfPhone = 2015;
        int typeOS = 0;
        applicationVersion(yearOfPhone, typeOS);

        //Задание 3
        int distance = 90;
        System.out.println("Колличество дней на доставку - " + timeOfDelivery(distance));

        //Задаине 4
        String text = "aabccddefgghiijjkk";
        doubleCheck(text);

        //Задание 5
        int[] array = {3, 2, 1, 6, 5};
        sortArray(array);

    }

    //Реализованный метод задания 1
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
    }


    //Реализованный метод задания 2
    public static void applicationVersion(int year, int type) {
        if (type == 0 && year >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (type == 0 && year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year >= LocalDate.now().getYear()) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    //Реализованный метод задания 3
    public static int timeOfDelivery(int distance) {
        int time = 0;
        if (distance < 20) {
            time += 1;
        } else if (distance >= 20 && distance < 60) {
            time += 2;
        } else if (distance >= 60 && distance < 100) {
            time += 3;
        }
        return time;
    }


    //Реализованный метод задания 4
    public static void doubleCheck(String text) {
        boolean repeat = false;
        for (int i = 0; i < text.length() - 1; ) {
            if (text.charAt(i) != text.charAt(i + 1)) {
                i++;
                repeat = true;
            } else {
                System.out.println("Данный элемент повторяется - " + text.charAt(i));
                repeat = false;
                break;
            }
        }
        if (repeat) {
            System.out.println("Дублей нет");
        }
    }


    //Реализованный метод задания 4
    public static void sortArray(int[] array) {
        int elementOfArray;
        for (int i = 0; i < array.length / 2; i++) {
            elementOfArray = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = elementOfArray;
        }
        System.out.println(Arrays.toString(array));
    }


}