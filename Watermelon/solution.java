import java.util.Scanner; 
public class watermelon{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt(); 
        if(w % 2 == 0 && w > 2){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}