package by.homefolder.javabook1.lessons.beersong;

public class beersong {
    public static void main (String[] args){
        int beernum = 99;
        String word = "бутылок (бутылки)";
        while (beernum > 0){
            System.out.println(beernum + " " + word + " пива на стене");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beernum = beernum - 1;
            if (beernum == 1){
                word = "бутылка";
            }
        }
        if (beernum == 0){
            System.out.println("Нет бутылок пива на стене");
        }
    }
}
