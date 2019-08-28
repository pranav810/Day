import java.io.DataInputStream;
import java.io.IOException;

public class Labbb {
    public static void main(String args[]) throws IOException {
        DataInputStream br = new DataInputStream(System.in);
        double t = Double.parseDouble(br.readLine());
        double c = (t - 32) / 1.8;
        System.out.println(c);
    }
}
