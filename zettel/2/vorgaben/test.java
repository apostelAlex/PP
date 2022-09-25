public class test{
    public static void main(String[] args){
        int start = 4;
        System.out.print(start +" ");
        for(int i = 1; i<15; i++){
            switch(i%3){
                case 0:
                    start += 3;
                    System.out.print(start +" ");
                    break;
                case 1:
                    start +=1;
                    System.out.print(start + " ");
                    break;
                case 2:
                    start -= 2;
                    System.out.print(start +" "); 
                    break;
            }
        }
    }
}