import java.io.DataInputStream;
import java.io.IOException;

public class Lab {
    public static void main(String args[]) throws IOException {
        DataInputStream br = new DataInputStream(System.in);
        int n = Integer.parseInt(br.readLine());
        double s = 0;
        for (int i = 1; i <= n; i++) {
            double a = 1.0 / i;
            s = s + a;
        }
        System.out.println(s);

    }

}
