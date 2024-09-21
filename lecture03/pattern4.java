package lecture03;

public class pattern4 {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; n>=i; i++) {  
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing stars
        }
     
    }
}
     
    
    
