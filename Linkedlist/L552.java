


/*L52 ka 5 question ,Find the middle elememnt of the linkedlist  */
public  class  L552{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    // when element is even then right middle
    // 2 -> 5 -> 1->3 -> 8 -> 20 -> null
    public Node rightmiddle(Node head){
        Node slow=head;
        Node fast=head;

     while(fast!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    
} 
    //when element is even and find left middle
    public Node lefttmiddle(Node head){
        Node slow=head;
        Node fast=head;

     while(fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    
}
     //when element is odd then middle 
     // 5 -> 1->3 -> 8 -> 20 -> null
    public Node middle(Node head){
        Node slow=head;
        Node fast=head;

     while(fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
    
}



}