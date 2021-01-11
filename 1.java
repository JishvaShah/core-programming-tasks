
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JISHWA
 */
public class max {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input to find the largest number:");
        int[] arr=new int[6];
        for(int i=0; i<6; i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int x=0;
       for(int i=1;i<arr.length;i++){
           if(max<arr[i]){
               max=arr[i];
               x=i;
           }
       }
        System.out.println("Largest no.:"+max);
    }

}
