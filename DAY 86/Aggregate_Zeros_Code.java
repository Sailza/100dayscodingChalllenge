PROBLEM : To aggregate all the Zeros in left hand side and One on Right hand Side 
SAMPLE INPUT 
1,0,1,0,1
SAMPLE OUTPUT 
0,0,1,1,1
  
SOLUTION 
CODE 
public class AggZero {
    public static void main(String args[]){
        int[] arr = {0,1,0,0,0};
        int i=0, j=arr.length-1;
        while(true){
            if(i>=j)
            break;
        if(arr[i]==0){
            i++;
        }
        else if(arr[j]==1){
            j--;
        }
        else{
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;
        }

        }
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k]);
        }


        }
        

        }
      OUTPUT 
      00001
