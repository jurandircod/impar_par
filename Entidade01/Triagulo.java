package Entidade01;

public class Triagulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;
    public double areax;
    public void calculo (){
        double p =(ladoA + ladoB + ladoC )/2;
        this.areax = Math.sqrt(p*(p - ladoA) *(p - ladoB) * (p - ladoC) );
    }

}
