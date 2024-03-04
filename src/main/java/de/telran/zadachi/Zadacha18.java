package de.telran.zadachi;
//Проверить, заканчивается ли строка  “first meaning in the row” подстрокой “!!!”.
// Вывести yes/no
public class Zadacha18 {
        public static void main(String[] args) {
            String originalString = "first meaning in the row";
            String substringToCheck = "!!!";
            boolean endsWithSubstring = originalString.endsWith(substringToCheck);

            if (endsWithSubstring) {
                System.out.println("answer: yes");
            } else {
                System.out.println("answer: no");
            }
        }

}

//метод endsWith проверяет, заканчивается ли исходная строка подстрокой "!!!".
