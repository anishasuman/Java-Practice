public class Main{
    public static void main(String[] args){
        //true=infinite times run
        int i = 0;
        while(true){
            if((i == 3) || (i == 8)){
                i = i + 1;
              continue;
            }
            System.out.println(i);
            i = i + 1;
            if(i > 10){
                break;
            }
        }
    }
}
