/* ***    Aufgabenteil (c)    *** */

class Rechteck extends Polygon {

    public Rechteck(Farbe f, double x, double y, double height, double width){
        super(f, new Punkt(x,y), new Punkt(x+width,y), new Punkt(x+width, y+height), new Punkt(x, y+height)); 
    }
    public Rechteck(double x, double y, double height, double width){
       this(Farbe.SCHWARZ,x,y,height,width);
    }
    public Rechteck clone(){
        return (Rechteck) super.clone();
    }

}
