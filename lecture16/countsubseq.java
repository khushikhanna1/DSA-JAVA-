package lecture16;

public class countsubseq {
    static int countSubSeq(String ques, String ans){
        if(ques.length()==0){
            return 1;
        }
        char a = ques.charAt(0);
        // Include
        int inc= countSubSeq(ques.substring(1), ans+a);
        // Don't Include
        int Ninc= countSubSeq(ques.substring(1), ans);

        return inc+ Ninc;
    }
}