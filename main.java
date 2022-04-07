    import java.util.Scanner;

    public class main {

        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            int testNumber;
            System.out.print("Введите число: ");
            testNumber = num.nextInt();
            if (testNumber >= 7) {
                System.out.print("Привет");
            } else {
                System.out.print("Число меньше 7");
            }
            }
        }

