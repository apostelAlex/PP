public class TestPolygon {
    public static void main(String[] args){
        
	DrawingPane dp = new DrawingPane(); // Zeichenflaeche generieren

        /* *** Aufgabenteil (d) *** */

        // Muster-Rechteck, welches der Zeichenflaeche hinzugefuegt wird
        Rechteck r = new Rechteck(Farbe.BLAU,-25,-25,50,50);
        dp.addShape(r);
        for(int i=0; i<5; i++){
            Polygon temp = r.clone();
            r.scale(1.5, 1.25);
            dp.addShape(temp);
        }
        
        // Muster-Rechtecke, die selbst nicht der DrawingPanel
        // hinzugefuegt werden
        Rechteck r1 = new Rechteck(Farbe.ROT, -205,150,25,25);
        Rechteck r2 = new Rechteck(Farbe.ROT, -205,-175,25,25);

        for(int i=1; i<=10; i++){
            r1.move(35, 0);
            r2.move(35, 0);
            Polygon temp1 = r1.clone();
            Polygon temp2 = r2.clone();
            
            dp.addShape(temp1);
            dp.addShape(temp2);

        }
        
        
        /* *********************** */
        
        dp.setVisible(true);  // Zeichenflaeche mit Objekten anzeigen
    }
}
