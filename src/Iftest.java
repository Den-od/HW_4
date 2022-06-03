public class Iftest {
    public static void main(String[] args) {
        int x = 7;
        while (x > 3) {
            System.out.println("Начало цикла while. х уменьшается на единицу.");
            x = x - 1;
            System.out.println("Значение х равно " + x);
        }
        if (x == 3) {
            System.out.println("Это сообщение выводится если х равен трём");
        }
    }
}
