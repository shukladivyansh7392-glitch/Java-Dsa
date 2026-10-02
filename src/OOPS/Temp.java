package OOPS;

public class Temp {
    public int add(int a, int b){
       return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public float add(int a, float b){
        return a+b;
    }
    public long add(long a, long b){
        return a+b;
    }
    public int add(int a){
        return a;
    }

    static void main(String[] args) {
        Temp obj = new Temp();
        obj.add(12, 20);
        obj.add(73,77.3);

    }


}
