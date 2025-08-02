/*concat of string + (char,int ,string) */

package strings;

import java.util.Scanner;

public class Strchar {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str="abc";
        str+="xyz";
        str+='r';
        str+=10;
        System.out.println(str);
    }
    
}
