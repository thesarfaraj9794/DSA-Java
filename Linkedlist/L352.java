public  class   L352{
    
    public static Node nthNode2(Node head,int n){   //second fattu method 
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow =slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void deletenthElement(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return;
        }
        while(fast.next!=null){
            slow= slow.next;
            fast=fast.next;
        }
        slow=slow.next.next;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(100);
        Node b=new Node(13);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(12);
        Node f=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        deletenthElement(a, 2);
    }
}