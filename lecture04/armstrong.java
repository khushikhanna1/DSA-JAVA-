package lecture04;

public class armstrong {
  
static boolean armstrong(int n){
    int len=0;
    int temp=n;
    while(temp!=0){
        temp/=10;
        len++;
        
    }
    int sum=0;
    temp=n;
    while(temp!=0){
        sum+=(int)Math.pow(temp%10, len);
        temp/=10;
    }
    return(sum==n);

}


public static void main(String[] args){
    
    System.out.println(armstrong(371));
}
}


