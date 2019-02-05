package by.homefolder.javabook1.lessons.SeaBattleTest;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public String checkYourself(String stringGuess) {
        String result = "Мимо";
        try {
            int guess = Integer.parseInt(stringGuess);
            for (int cell : locationCells) {
                if (guess == cell) {
                    result = "Попал";
                    numOfHits++;
                    break;
                }
            }
            if (numOfHits == locationCells.length) {
                result = "Потопил";
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Долбаёб, вводи числа, а не буквы!!!");
        }

        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locs) {
        locationCells = locs;

    }
}