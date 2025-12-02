import java.io.*;

public class opgave4 {
    public static void main(String[]args) throws IOException {

    BufferedReader indlæser =
            new BufferedReader(
                    new InputStreamReader(System.in));

    System.out.println("Indtast et tal?");
    int tal = Integer.parseInt(indlæser.readLine());

    System.out.println("Det bliver: " + (tal + 7) * 2);


    }

}


