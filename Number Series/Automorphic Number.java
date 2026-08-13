//Automorphic Number

import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int square=original*original;
        
        int digits=0;
        int temp=original;
        while(temp>0){
            digits=digits+1;
            temp=temp/10;
        }
        int divisior=1;
        for (int i=0;i<digits;i++){
            divisior=divisior*10;
        }
        int last=square%divisior;
        if(last==original){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not Automorphic Number");
        }
    }
}