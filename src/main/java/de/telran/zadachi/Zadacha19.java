package de.telran.zadachi;
//Преобразуйте строку “After my birthday”  к верхнему регистру. Вывод в консоль
public class Zadacha19 {
    public static void main(String[] args) {
        String originalString = "After my birthday";
        String uppercaseString = originalString.toUpperCase();

        System.out.println(uppercaseString);
    }
}
//метод toUpperCase() для преобразования каждого символа строки к верхнему регистру
