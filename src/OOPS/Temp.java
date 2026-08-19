package OOPS;

public class Temp {
    public int add(int a, int b){
       return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public long add(long a, long b){
        return a+b;
    }

    static void main(String[] args) {
        Temp obj = new Temp();
        obj.add(12, 20);
    }


}
