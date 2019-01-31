package by.homefolder.mysecond.test;

public class test {
    public static void main(String[] args) {
        int massiv1[] = new int[10];
        int max, k;
        max = 0;
        k = 0;
        for (int i = 0; i < massiv1.length; i++) {
            massiv1[i] = ((int) (Math.random() * 6) - 5);
            System.out.println(massiv1[i]);
            if(i==9){
                for (i = 0; i < massiv1.length; i++) {
                    if (massiv1[i] == 0) {
                        max = i;
                        System.out.println("нулевой элемент стоит на месте № " + max);
                    }
                }
            }

        }
    }
}
