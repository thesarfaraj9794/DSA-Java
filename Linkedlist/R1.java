public  class R1{
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head=null;
        Node tail=null;
        void insertelement(int val){
            Node temp =new Node(val);
            if (head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }

        }
        void deleteAtin(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Invalid index");
                return;
            }

            if (idx == 0) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
                return;
            }

            Node t = head;
            for (int i = 0; i < idx - 1; i++) {
                t = t.next;
            }

            t.next = t.next.next;

            if (t.next == null) {
                tail = t;  // update tail if last node is deleted
            }
        }
        void display(){
            Node temp=head;
            
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
        
        
        
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;


            }
            return count;
        }
    }
    public static void main(String[] args) {
        Linkedlist l1=new Linkedlist();
        l1.insertelement(2);
        l1.insertelement(3);
        l1.insertelement(4);
        l1.insertelement(5);
        l1.insertelement(6);
        l1.display();
        System.out.println(l1.size());
        l1.deleteAtin(3);
        l1.display();
    }
}