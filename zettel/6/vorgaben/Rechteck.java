/* ***    Aufgabenteil (c)    *** */

class Rechteck extends Polygon {
    // Variablen, um das Rechteck anders zu klonen. return (Rechteck) super.clone() wirft ClassCastException.
    Farbe f;
    double x,y,height,width;
    public Rechteck(Farbe f, double x, double y, double height, double width){
        super(f, new Punkt(x,y), new Punkt(x+width,y), new Punkt(x+width, y+height), new Punkt(x, y+height)); 
        this.f = f;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    public Rechteck(double x, double y, double height, double width){
       this(Farbe.SCHWARZ,x,y,height,width);
    }
    public Polygon clone(){
        return super.clone();
    }

}
