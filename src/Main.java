import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача1.");
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке...");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке...");
        }
        //задача 2
        System.out.println("Задача 2.");
        int clientOs1 = 0;
        int agePhone = 2015;
        if (clientOs1 == 0) {
            if (agePhone > 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке...");
            } else {
                System.out.println("Установите облегчённую версию приложения для IOS по ссылке...");
            }
        } else if (clientOs1 == 1) ;
        {
            if (agePhone > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке...");
            } else {
                System.out.println("Установите облегчённую версию приложения для Android по ссылке...");
            }
            //Задача 3.
            System.out.println("Задача 3");
            int year = 2016;
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " является високосным");
            } else {
                System.out.println(year + " не является високосным");
            }
            //задача 4.
            System.out.println("Задача 4.");
            int way = 110;
            int deliveryDays=0;
            if (way<20) {
                deliveryDays = 1;
            }else if (way<60) {
                deliveryDays = 2;
            }else if(way<100) {
                deliveryDays = 3;
            }
            if (deliveryDays==0){
                System.out.println("Доставка не осуществляется");
            }else {
                System.out.println("Потребуется дней " +deliveryDays);
            }
            //задача 5.
            System.out.println("Задача 5.");
            int month=12;
            switch (month) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень.");
                    break;
                default:
                    System.out.println("Нет такого месяца.");
            }
        }
    }
}
