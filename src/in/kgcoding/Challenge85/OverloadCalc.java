package in.kgcoding.Challenge85;

class OverloadCalc {
    public int add(int first, int second){
        return first + second;
    }

    public int add(int first, int second, int third) {
        return first + second + third;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public static void main(String[] args) {
        OverloadCalc calc = new OverloadCalc();
        System.out.println(calc.add(5, 6));
        System.out.println(calc.add(5, 6,  7));
        System.out.println(calc.add(5.3, 6.1));
    }
}
