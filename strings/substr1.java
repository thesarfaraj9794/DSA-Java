/*L49 ka 1 question ,Given a string s,print all the substrings of s,
  
  input=abcd
  output:-a ab abc abcd b bc bcd c cd d
 */
package strings;

public class substr1 {
    public static void main(String[] args) {
        String str="abcd";
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.println(str.substring(i,j)+" ");
            }
            
        }
    
    }
    
}
