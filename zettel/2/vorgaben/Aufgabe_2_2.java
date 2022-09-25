//Name: Alexandros Apostolidis
public class Aufgabe_2_2 {

    
    public static void main(String[] args){
        long input = IOTools.readInteger();
        while(input<10)
            input = IOTools.readInteger(); 
        long temp = input;
        boolean result = true;
        long last=-1, pre_last=-1;
        while(temp>0){
            if(temp>10){
                last = temp%10;
                temp=temp/10;
                pre_last = temp%10;
            }
            else{
                break;
            }
            if(last>=pre_last){
                continue;
            }
            else{
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("Die Ziffern in der Zahl " + input + " steigen monoton.");
        }
        else{
            System.out.println("Die Ziffern in der Zahl " + input + " steigen nicht monoton.");
        }
    }
    
}
