package Linkedlist;

public class L151{
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        node head=null;
        node tail=null;
        void insertAtEnd(int val){
            node temp=new node(val);
            if(head==null){
                head=temp;
                
            }else{
                tail.next=temp;
            }
            tail=temp;

            
                }
                void display(){
                node temp=head;
                while(temp!=null){
                    System.out.println(temp.data);
                    temp=temp.next;
            }
        }
    }
    public static void main(String[] args){
        Linkedlist l1=new Linkedlist();
        l1.insertAtEnd(10);
        l1.insertAtEnd(5);
        l1.display();
    }
    

}