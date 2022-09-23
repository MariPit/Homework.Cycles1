public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1
        System.out.println("Задание 1");
        for (int i=1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задание 2");
        for (int i=10; i >0; i--) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i=2; i<17; i+=2) {
            System.out.println(i);
        }

        System.out.println("Задание 4");
        for (int i=10; i >=-10; i--) {
            System.out.println(i);
        }

        //Домашнее задание 2
        System.out.println("Задание 1");
        for (int i=1904; i<=2096; i+=4) {
            System.out.println(i+" год является високосным");
        }

        System.out.println("Задание 2");
        for (int i=7; i<=98; i+=7) {
            System.out.println(i);
        }

        System.out.println("Задание 3");
        for (int i=1; i<=512; i*=2) {
            System.out.println(i);
        }

        //Домащнее задание 3
        System.out.println("Задача 1");
        int contribution=29000;
        int total=0;
        for (int i=1; i<=12; i++){
            total=total+contribution;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }

        System.out.println("Задача 2");
        double contribution2=29000;
        double total2=0;
        for (int i=1; i<=12; i++) {
            total2= total2+total2/100;
            total2 = total2 + contribution2;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + String.format("%.2f", total2)  + " рублей");
        }
    }
}