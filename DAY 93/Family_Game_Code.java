PROBLEM : TO SOLVE THE FAMILY GAME PROBLEM WHERE X AND Y IS MUSIC TUNE IF X COMES THEN PASS THE CHANCE TO OTHER IF Y COMES THE PERSON ELIMINATES FROM THE GAME AND
AT LAST IT WILL PRINT WHICH PERSON FROM ALL THE GIVEN N VALUE IS THE WINNER 

SOLUTION

CODE 
import java.util.*;
public class familygame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,j=0;
        String a;
        System.out.println("enter the string");
        a=sc.nextLine();
        System.out.println("Enter Integer n");
        int n = sc.nextInt();
        char ar[]=a.toCharArray();
        boolean[] ar1=new boolean[n];
        for(i=0;i<ar1.length;i++){
            ar1[i]=true;
        }

        while(n!=1){
        for(i=0;i<ar.length;i++){
            if(ar1[i]==true){
                     if(ar[j]=='y'){
                          ar1[j]=false;
                          j++;
                          n--;
                     }
                     else{
                        j++;
                     }
            }
            i++;
            if(i>=ar1.length){
                i=0;
            }
            if(j>=ar.length){
                j=0;
            }
        }
    }
for(i=0;i<ar1.length;i++){
        if(ar1[i]==true){
            break;

        }
     } 
     System.out.println("the winner is  ="+(i+1));  

    }
}

OUTPUT 
enter the string 
xyx
Enter Integer n
7
the winner is  =1
