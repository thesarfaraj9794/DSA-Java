/*L51 ka 3 get element method 
to return the element of any given index of the linked list */

import java.util.LinkedList;

/*L51 ka 1 ka again understanding insert at the  position in linked list*/


public class L351 {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public static class Linkedlist {
        node head = null;
        node tail = null;

        void insertAtEnd(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
                tail = temp; // Set tail when inserting the first element
            } else {
                tail.next = temp;
                tail = temp; // Update tail to the new last element
            }
        }
        void insertAt(int idx,int val){
            node t=new node(val);
            node temp=head;
            if(idx==size()){
                insertAtEnd(val);
                return;

            }
            else if(idx==0){
                insertAtEnd(val);
                return;

            }else if(idx<0||idx>size()){
                System.out.println("wrong input");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;

            }
            t.next=temp.next;
            temp.next=t;
        }
        int getAt(int idx){
            node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void display() {
            node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("");
        }
        int size(){
            node  temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.insertAtEnd(2);
        l1.insertAtEnd(5);
        l1.insertAtEnd(8);
        l1.insertAtEnd(10);
        l1.insertAtEnd(12);
        l1.display();
        l1.insertAt(3,6);
        l1.display();
        System.out.println(l1.getAt(3));
    }
}