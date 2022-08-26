import java.util.Scanner;
public class solution{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int x,y,z; 
        int sumx = 0;
        int sumy = 0;
        int sumz = 0; 
        
        for(int i = 0; i < n; i++){
            x= scn.nextInt();
            y= scn.nextInt();
            z= scn.nextInt();
            
            sumx += x;
            sumy += y;
            sumz += z;
        }
        
        if(sumx == 0 && sumy == 0 && sumz == 0){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
            
        }
    }
}