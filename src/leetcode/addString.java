package leetcode;

public class addString {
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0; //计数位
        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            res.append(result % 10);
            add = result / 10;
            i--;
            j--;

        }
        res.reverse();
        return res.toString();
    }

    public static void main(String[] args) {
        String num1 = "1";
        String num2 = "9";
        System.out.println(addStrings(num1, num2));
    }
}
