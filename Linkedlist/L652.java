/*L 52 ka 6 number question ,Cycle in a linkedlist */
public class L652{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean hasCycle(Node head){
        if(head.next==null) return  false;
        if (head==null) return  false;
        Node slow=head;
        Node fast=head;
        while(fast!=null){
            if(slow==null) return false;
            slow =slow.next;
            if(fast.next==null) return false;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;

    }
}