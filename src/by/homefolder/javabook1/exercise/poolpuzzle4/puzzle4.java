package by.homefolder.javabook1.exercise.poolpuzzle4;

public class puzzle4 {
    public static void main(String[] args) {
        puzzle4b[] obs = new puzzle4b[6];
        int y = 1;
        int x = 0;
        int result = 0;
        while (x < 6) {
            obs[x] = new puzzle4b();
            obs[x].ivar = y;
            y = y * 10;
            x = x + 1;

        }
        x = 6;
        while (x > 0) {
            x = x - 1;
            result = result + obs[x].doStuff(x);
        }
        System.out.println("результат: " + result);
    }
}
