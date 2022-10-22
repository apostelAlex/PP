// 4
public class Punkt {
    private double x,y;

    public Punkt(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punkt clone(){
        return new Punkt(x,y); 
    }
    public double getY(){
        return y;
    }
    public double getX(){
        return x;        
    }
    public void setY(double value){
        y = value;
    }
    public void setX(double value ){
        x = value;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }
    public void scale(double factor_x, double factor_y){
        x *= factor_x;
        y *= factor_y;
    }
    
}
