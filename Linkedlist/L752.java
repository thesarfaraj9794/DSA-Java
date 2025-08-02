/*L52 ka 7 question ,Merge of two linkedlist*/

public class  L752{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public Node mergeTwoList(Node list1,Node list2){
        Node temp1=list1;
        Node temp2=list2;
        Node head =new Node(100);
        Node temp=head;
        while(temp1!=null && temp2!=null){
            if(temp1.data<temp2.data){
                Node a=new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;

 
            }
            else{
                Node a=new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return head.next;

    }
}