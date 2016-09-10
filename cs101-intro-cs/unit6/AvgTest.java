import java.lang.Math;

class Main {
    public double average(double a, double b, double c){
        double result =  a/b/c;
        return result;
    }
    public double maximum(double a, double b, double c){
        double d = Math.max(a, b);
        double result = Math.max(c, d);
        return result;
    }
}