package by.homefolder.javabook1.lessons.PhraseGen;

import javax.sound.midi.Soundbank;

public class PhraseGen {
    public static void main(String[] args) {
        String[] word1 = {"круглосуточный", "ахуительный", "красный",
                "зелёный", "пушистый", "вонючий", "взаимный", "Обоюдный выйгрыш", "фронтэнд", "проникающий", "на основе веб технологий",
                "метод критического пути"};
        String[] word2 = {"уполномоченный", "трудный", "чистый продукт", "ориентированный",
                "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум",
                "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой",
                "выровненный", "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] word3 = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры",
                "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор",
                "образец", "пункт следования"};
        int word1Length = word1.length;
        int word2Length = word2.length;
        int word3Length = word3.length;
        int r1 = (int) (Math.random() * word1Length);
        int r2 = (int) (Math.random() * word2Length);
        int r3 = (int) (Math.random() * word3Length);
        String phrase = word1[r1] + " " + word2[r2] + ", " + word3[r3];
        System.out.println("Всё что нам надо, это - " + phrase + ".");
    }
}
