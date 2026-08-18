package useful.ch08;

public class MainTest2 {
    public static void main(String[] args) {
        String str1 = "10A"; // 숫자가 아닌 문자포함
        String str2 = "20.5"; // 실수형태 문자열
        String str3 = "true"; // boolean형태 문자열
        int n1;

        try {
            n1 = Integer.parseInt(str1);
            System.out.println(n1 + 100);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 값");
        }

        double d = Double.parseDouble(str2);
        System.out.println(d + 0.5);

        boolean b = Boolean.parseBoolean(str3);
        System.out.println(!b);
    }
}
