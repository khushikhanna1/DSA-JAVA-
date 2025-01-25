package lecture08;

public class binarysearch {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,6,7,8,9,10};
        int num  =3;
        boolean found =  binarysearch(arr,num);
        System.out.println("Number Found "+ found);
    }
    static boolean binarysearch(int[] arr , int num){
    int low = 0 ;
    int high = arr.length-1;
    while(low<=high){
        int mid = (high+low)/2;
        if(arr[mid]==num)
        return true;
        else if (arr[mid]<num)
        low = mid+1;
        else 
        high=mid-1;
    }
    return false;

        }
    }


    
