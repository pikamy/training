package pl.szkolenie.interfejsy;


public class Exercise1 implements Computation{
    public double result;
    public double compute(double argument1, double argument2){
        result = argument1 + argument2;
        return result;
    }

}
