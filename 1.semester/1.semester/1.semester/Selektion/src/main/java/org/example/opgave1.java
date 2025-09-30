package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class opgave1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int z = 3;

        // x er under eller lig med 5 og z er ikke y. Det giver true.
        boolean resultA = x <= 5 && z != y;

        // x er 5 eller x er 8 og z = 3. Første statement giver true, andet giver false og tredje giver true.
        // OR (||) kan ikke give false ved mindre begge eller alle 3 er false. Derfor er det true.
        boolean resultB = x == 5 || x == y && z == 3;
        boolean resultC = x / y > z / x; // 0 er ikke større end 0 = false

        // !(5 != 8 - 3) == false;
        // !(5 != 5) == false;
        // !false == false;
        // true == false;
        boolean resultD = !( x != y - z ) == false;

        // De her 2 er tautologier da de altid vil være true
        boolean resultE = 2 * x != x || x == 0; // Kan knu give hvis begge operander var false.
        boolean resultF = ! true || ! false; // Kan kun give false hvis begge operander var false

        System.out.println("A = " + resultA);
        System.out.println("B = " + resultB);
        System.out.println("C = " + resultC);
        System.out.println("D = " + resultD);
        System.out.println("E = " + resultE);
        System.out.println("F = " + resultF);



    }
}