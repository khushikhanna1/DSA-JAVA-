package lecture26;
import java.util.Scanner;

public class insertatbottom {
    public static void insertatbottom(Stack<Ineger> s , int val) {
        Stack<Integer> extraStack ;
        while(s.size()>0){
            int data = s.pop();
            extraStack.push(data);
            }
            s.push(val);
            while(extraStack.size()>0){
                int data = extraStack.pop();
                s.push(data);
            
        }
        pulblic static void main (String[] args) {
            Stack<Integer> s = new Stack<Integer>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            
        }
          


}
