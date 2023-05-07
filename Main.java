import java.util.Scanner;

import Entidade01.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Triagulo obj = new Triagulo();
        Triangulo02 obj2 = new Triangulo02();


        System.out.println("digite o valor do lado 1 x");
        obj.ladoA = ler.nextDouble();

        System.out.println("digite o valor do lado 2 x");
        obj.ladoB = ler.nextDouble();

        System.out.println("digite o valor do lado 3 x");
        obj.ladoC = ler.nextDouble();

        System.out.println("digite o valor do lado 1 y");
        obj2.ladoA = ler.nextDouble();

        System.out.println("digite o valor do lado 2 y");
        obj2.ladoB = ler.nextDouble();

        System.out.println("digite o valor do lado 3 y");
        obj2.ladoC = ler.nextDouble();

        obj.calculo();
        System.out.println(obj.areax + "a area do triangulo x");

        obj2.calculo_2();
        System.out.println(obj2.areay + "a area do triangulo y");

        if (obj.areax > obj2.areay) {
            System.out.println("area x é maior");
        } else if (obj2.areay > obj.areax) {
            System.out.println("area y é maior");
        }else {
            System.out.println("os dois são iguais");
        }
    }


}