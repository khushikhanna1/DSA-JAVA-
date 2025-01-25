package lecture16;

public class printperm {
    static void printPerm(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            char a= ques.charAt(i);
            String s1= ques.substring(0, i);
            String s2= ques.substring(i+1);
            printPerm(s1+s2, ans+a);
        }
    }

    //22
    public static void main(String[] args) {
        String s= "car";
        // printSubSeq(s, "");
        // coinToss(3, "");
        // System.out.println(countSubSeq(s, ""));
        // generateParanthesis(3, 0, 0, "");
        printPerm("abc", "");
    }
}
    
