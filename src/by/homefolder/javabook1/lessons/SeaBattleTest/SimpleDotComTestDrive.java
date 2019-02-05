package by.homefolder.javabook1.lessons.SeaBattleTest;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        GameHelper enterGuess = new GameHelper();
        int x, y, z, numOfGuesses;
        numOfGuesses = 0;
        x = (int) (Math.random() * 11);
        y = x + 1;
        z = y + 1;
        int[] locations = {x, y, z};
        dot.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            String userGuess = enterGuess.getUserInput("Введите число от 0 до 10");
            String result = dot.checkYourself(userGuess);
            if (result.equals("Мимо")) {
                System.out.println("Жаль, пробуй ещё");
                numOfGuesses++;
            }
            if (result.equals("Попал")) {
                System.out.println("Попал, стреляй ещё!");
                numOfGuesses++;
            }
            if (result.equals("Потопил")) {
                numOfGuesses++;
                System.out.println("Ура ты потопил свой массив,1 WOOHOO");
                System.out.println("Конец игры :) количество попыток: " + numOfGuesses);
                isAlive = false;
            }
        }


    }
}