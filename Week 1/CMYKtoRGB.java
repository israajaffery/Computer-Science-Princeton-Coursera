/* *****************************************************************************
 *  Name:             Israa Jaffery
 *  Last modified:     November 16, 2021
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        // Calculating the colours
        int white = (int) Math.round(1 - black);
        int red = (int) Math.round(255 * white * (1 - cyan));
        int green = (int) Math.round(255 * white * (1 - magenta));
        int blue = (int) Math.round(255 * white * (1 - yellow));
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);

    }
}
