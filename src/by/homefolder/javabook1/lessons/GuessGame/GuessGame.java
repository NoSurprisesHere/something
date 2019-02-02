package by.homefolder.javabook1.lessons.GuessGame;

import javax.xml.bind.SchemaOutputResolver;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 1 до 9 кек)");

        while (true) {
            System.out.println("Число которое нужно угадать: " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает что это число: " + guessp1);
            guessp2 = p2.number;
            System.out.println("Первый игрок думает что это число: " + guessp2);
            guessp3 = p3.number;
            System.out.println("Первый игрок думает что это число: " + guessp3);

            if (guessp1 == targetNumber) {
                p1isright = true;
            }
            if (guessp2 == targetNumber) {
                p2isright = true;
            }
            if (guessp3 == targetNumber) {
                p3isright = true;
            }
            if (p1isright || p2isright || p3isright) {
                System.out.println("У нас есть победитель!");
                if (p1isright) {
                    System.out.println("Первый игрок угадал! Загаданное число:" + targetNumber);
                }
                if (p2isright) {
                    System.out.println("Второй игрок угадал! Загаданное число:" + targetNumber);
                }
                if (p3isright) {
                    System.out.println("Третий игрок угадал! Загаданное число:" + targetNumber);
                }
                System.out.println("Конец игры!");
                break;
            } else {
                System.out.println("Игроки должны попробовать ещё раз.");
            }

        }

    }
}
