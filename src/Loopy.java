public class Loopy {
    public static void main (String[] args) {
        int x = 1;
        System.out.println ("Цикл начался");
        while (x < 4){
            System.out.println ("Цикл выполняется пока Х меньше четырёх. Х увеличивается на единицу");
            System.out.println ("Значение x равно" + x);
            x = x + 1;
        }
        System.out.println ("Цикл прекратился, т.к. условие x < 4 не выполняется") ;
    }

}
