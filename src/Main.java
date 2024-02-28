public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS==0) {
            System.out.println("Скачайте приложение для iOS");
        } else if (clientOS==1) {
            System.out.println("Скачайте приложение для Android");
        } else {
            System.out.println("Неизвестная ОС");
        }

        //task2
        System.out.println("Задача 2");
        clientOS = 1;
        int clientDeviceYear = 2008;
        if (clientOS==0 && clientDeviceYear <2015 ) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==0 && clientDeviceYear > 2015) {
            System.out.println("Скачайте приложение для iOS");
        }
        if (clientOS==1 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==1) {
            System.out.println("Скачайте приложение для Android");
        }
        //task3
        System.out.println("Задача 3");
        int year = 1684;
        if ((year-1584)%4 == 0 && (year-1584)%400 == 0)
        {
            System.out.println(year + " год является високосным");
        } else if ((year-1584)%100 == 0) {
            System.out.println(year + " год не является високосным"); //этот вывод схож с
            // выводом ниже. Как объеденить? Live не смотрю, что бы не повторить чужие решения
        }else {
            System.out.println(year + "год не является високосным");
        }
        //task4
        System.out.println("Задача 4");
        int deliveryDistance = 105;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет"); //Слишком просто, возможно не верное поняла условие задачи
        }
        //task5
        System.out.println("Задача 5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 12,1,2:
                System.out.println("Это зимний месяц");
                break;
            case 3,4,5:
                System.out.println("Это весенний месяц");
                break;
            case 6,7,8:
                System.out.println("Это летний месяц");
                break;
            case 9,10,11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("В Григорианском календаре такого месяца не сущетвует");
        }

    }
}