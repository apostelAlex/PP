enum Farbe {SCHWARZ, ROT, GRUEN, BLAU};


// 5
public class Polygon {
    private Punkt[] ecken;
    private Farbe farbe = Farbe.SCHWARZ;

    public Polygon(Punkt... punkte){
        ecken = new Punkt[punkte.length];
        for(int i=0; i<punkte.length; i++){
            ecken[i] = punkte[i].clone();
        }
    }
    public Polygon(Farbe f, Punkt... punkte){
        this(punkte);
        farbe = f;
    }
    public Polygon clone(){
        return new Polygon(farbe, ecken);
    }
    public Punkt[] getEcken(){
        return ecken;
    }
    public Farbe getFarbe(){
        return farbe;
    }  
    public void setFarbe(Farbe f){
        farbe = f;
    }
    public void move(double x, double y){
        for(Punkt e : ecken){
            e.move(x,y);
        }
    }
    public void scale(double x, double y){
        for(Punkt e : ecken){
            e.scale(x,y);
        }
    }


}



