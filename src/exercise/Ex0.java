package exercise;

public class Ex0 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("==============================");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println("==============================");

        for(int i = 0; i < 4; i++) {
            for(int j = 7; j >= 2 * i + 1; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
