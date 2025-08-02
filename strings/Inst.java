/*how to insert delelte and change of index of string  */

public class inst{
    public static void main(String[]args){
        StringBuilder str=new StringBuilder("hello");
        System.out.println(sb);
        str.setCharAt(0,'m');
        System.out.perintln(str);
        str.append(10);
        System.out.println(str);
        str.insert(2,'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
    }

}