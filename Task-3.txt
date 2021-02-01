
import java.util.Arrays;
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
public class str {

    public static void main(String[] args) {
//        char c=',';
        int k = 0;
        String revstr = "";
//        char[] arr = new char[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Enter the amount of digits to alternate:");
        int n=sc.nextInt();
        String str = "";
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i += n) {
            System.out.println("i--->" + i);
            if (i == s.length() - 1) {
                revstr += s.charAt(i);
            } else {
                for (int j = i; j < i+n; j++) {
                    str += s.charAt(j);
                }
                System.out.println(str);
                for (int x = str.length(); x > 0; x--) {
                    revstr += str.charAt(x-1);
                }
                str="";
            }
        }
        System.out.println(revstr);
    }
}
