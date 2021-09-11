public class rectangle {
    private double length;
    private double width;
    public rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(){
        this.length = length;
    }
    public void setWidth(){
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}
