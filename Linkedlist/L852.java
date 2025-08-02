/*L52 ka 8 question Remove duplicates from a sorted linked list , (remove adjsent duplicate)
1>1>3>3>3>4>4>5>6
1>3>4>5>6  output
 */
public  class L852{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        if(head==null) return ;
        display(head.next);
        System.out.println(head.data+"");

    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        
    }
}