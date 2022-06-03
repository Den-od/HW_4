public class BearSong {
    public static void main(String[] args) {
        int beerNum =5;
        String word = "bottle (bottles)";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println (beerNum + " " + word + " of beer on the wall");
            System.out.println (beerNum + " " + word + " of beer");
            System.out.println ("Take one");
            System.out.println ("Start in a circle");
            beerNum = beerNum - 1;
            if (beerNum == 0) {
                System.out.println ("No any bottles of beer");
            }
        }
    }
}
