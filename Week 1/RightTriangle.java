/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isPositive;
        isPositive = (a > 0) && (b > 0) && (c >= 0);
        boolean correct;
        correct = isPositive && (a * a + b * b == c * c
                || a * a + c * c == b * b
                || a * a == b * b + c * c);
        System.out.println(correct);
    }
}
