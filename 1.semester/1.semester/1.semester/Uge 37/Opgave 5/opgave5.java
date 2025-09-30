import java.io.*;

public class opgave5 {
    public static void main(String[]args ) throws IOException {
    
    BufferedReader indlæser = 
        new BufferedReader(
            new InputStreamReader(System.in));

    System.out.println("Indtast det første tal?");
    int firstNumber = Integer.parseInt(indlæser.readLine());

    System.out.println("Indtast det andet tal?");
    int secondNumber = Integer.parseInt(indlæser.readLine());

    System.out.println("a + b = " + (firstNumber + secondNumber));
    System.out.println("a - b = " + (firstNumber - secondNumber));
    System.out.println("a * b = " + (firstNumber * secondNumber));
    System.out.println("a / b = " + (firstNumber / secondNumber));
    System.out.println("a % b = " + (firstNumber % secondNumber));



}

}


