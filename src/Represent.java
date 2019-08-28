import java.io.DataInputStream;
import java.io.IOException;

public class Represent {
    public static void main(String args[]) throws IOException {
        DataInputStream br = new DataInputStream(System.in);
        int k = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        System.out.println("enter first two digit of year");
        int y = Integer.parseInt(br.readLine());
        System.out.println("enter last two digit of year");
        int z = Integer.parseInt(br.readLine());

        int f = (k + ((13 * m - 1) / 5) + z + ((z / 4) + (y / 4) - (2 * y)));
        int s = f % 7;
        if (s == 1)
            System.out.println(" 15th August 2019 was a Monday!");
        else if (s == 2)
            System.out.println("15th August 2019 was a Tuesday!");
        else if (s == 3)
            System.out.println("15th August 2019 was a Wednesday!");
        else if (s == 4)
            System.out.println("15th August 2019 was a Thursday!");
        else if (s == 5)
            System.out.println("15th August 2019 was a Friday!");
        else if (s == 6)

            System.out.println("15th August 2019 was a Saturday!");
        else if (s == 7)

            System.out.println("15th August 2019 was a Sunday!");

    }
}
