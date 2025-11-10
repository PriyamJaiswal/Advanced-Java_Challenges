package in.kgcoding.Challenge83;

public class Circle extends Shape{

    private final double radiusInCms;

    public double getRadiusInCms() {
        return radiusInCms;
    }

    public Circle(double radiusInCms) {
        this.radiusInCms = radiusInCms;
    }
     @Override
    public double calculateArea(){
     return Math.PI * Math.pow(radiusInCms,2);
    }


}
