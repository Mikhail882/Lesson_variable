package com.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        byte dog = 1;
        short cat = 32767;
        int dogAge = 10;
        long bird = 100L;
        float sugarWeight = 10.5f;
        double saltWeight =  5.5;
        boolean dogIsAdult = dogAge > 5;
        char exclamation = 33;
        System.out.println("Задача 1");
        System.out.println(exclamation);
        System.out.println(dogIsAdult);

        //Задача 2
        double boxerOneWeight = 78.2;
        double boxerTwoWeight = 82.7;
        double boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Задача 2");
        System.out.println("Общий вес двух бойцов " + boxersWeight + " кг");

        double boxersWeightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница между весами бойцов " + boxersWeightDifference + " кг");

        //Задача 3

        short banas = 5;
        short banasWeight = (short) (banas * 80);
        short milk = (short) 200;
        short milkWeight100ml = 105;
        short milkWeight = (short) (milk / 100 * milkWeight100ml);
        short icecream = 100;
        short icecreamWeight = (short) (icecream * 2);
        short eggs = 4;
        short eggWeight = 70;
        short eggsWeight = (short) (eggs * eggWeight);
        short productWeightGramms = (short) (banasWeight + milkWeight + icecreamWeight + eggsWeight);
        float productWeightKg = productWeightGramms / 1000f;
        System.out.println("Задача 3");
        System.out.println("Вес спорт-завтрака " + productWeightKg + " кг");

        //Задача 4

        short weightLessKg = 7;
        short weightLessMin = 250;
        short weightLessMax = 500;
        short weightLessGramms = (short) (weightLessKg * 1000);
        short dayMin = (short) (weightLessGramms / weightLessMin);
        short dayMax = (short) (weightLessGramms / weightLessMax);
        System.out.println("Задача 4");
        System.out.println("Дней необходимо на потерю по 250 грамм в день = " + dayMin);
        System.out.println("Дней необходимо на потерю по 500 грамм в день = " + dayMax);

        //Задача 5
        int mashaMonth = 67760;
        int denisMonth = 83690;
        int kristinaMonth = 76230;
        byte year = 12;
        float increase = (float) 0.1;
        int all = mashaMonth + denisMonth + kristinaMonth;
        int allYear = all * year;
        int mashaYear = mashaMonth * year;
        int denisYear = denisMonth * year;
        int kristinaYear = kristinaMonth * year;
        float mashaIncrease = mashaMonth * increase + mashaMonth;
        float denisIncrease = denisMonth * increase + denisMonth;
        float kristinaIncrease = kristinaMonth * increase + kristinaMonth;
        float increaseAll = mashaIncrease + denisIncrease + kristinaIncrease;
        float increaseAllYear = increaseAll * year;
        float differenceAllYear = increaseAllYear - allYear;
        float mashaIncreaseYear = mashaIncrease * year;
        float mashaDifferenceYear = mashaIncreaseYear - mashaYear;
        float denisIncreaseYear = denisIncrease * year;
        float denisDifferenceYear = denisIncreaseYear - denisYear;
        float kristinaIncreaseYear = kristinaIncrease * year;
        float kristinaDifferenceYear = kristinaIncreaseYear - kristinaYear;
        System.out.println("Задача 5");
        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. Годовой доход вырос на " + mashaDifferenceYear + " рублей.");
        System.out.println("Денис теперь получает " + denisIncrease + " рублей. Годовой доход вырос на " + denisDifferenceYear + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaIncrease + " рублей. Годовой доход вырос на " + kristinaDifferenceYear +" рублей.");




    }

}
