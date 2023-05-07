package Entidade01;

public class Triangulo02 {
    public double ladoA;
    public double ladoB;
    public double ladoC;
    public double areay;
    public void calculo_2 (){
        double p =(ladoA + ladoB + ladoC )/2;
        this.areay = Math.sqrt(p*(p - ladoA) *(p - ladoB) * (p - ladoC) );
    }

}
