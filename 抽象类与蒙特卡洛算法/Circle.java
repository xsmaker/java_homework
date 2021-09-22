package ta;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Circle extends Shape{
    private double radius;
    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public double getArea(){
        double sum=0;
        for (int i=0; i<100000; i++){
            double x = Math.random();
            double y = Math.random();
            if ((x*x+y*y) <= 1){
                sum ++;
            }
        }
        return 4*sum/100000*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(3);
        System.out.println("shape1.getArea()=" +shape1.getArea());
        System.out.println("shape1.getPerimeter()=" +shape1.getPerimeter());
    }
}
