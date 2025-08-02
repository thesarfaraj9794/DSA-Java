/*L52 ka 4 question ,Findind intersection of two linkedlist  */
public class L452{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node getInsertionNode(Node head1,Node head2){
        Node tempA=head1;
        Node tempB=head2;
        int lengthA=0;
        while(tempA!=null){
            lengthA++;
            tempA=tempA.next;
        }
        int lengthB=0;
        while(tempB!=null){
            lengthB++;
            tempB=tempB.next;

    }
    tempA=head1;
    tempB=head2;
    if(lengthA>lengthB){
        int step=lengthA-lengthB;
        for(int i=0;i<=step;i++){
            tempA=tempA.next;
        }
    }
    else{
        int step=lengthB-lengthA;
        for(int i=0;i<=step;i++){
            tempB=tempB.next;
        }

    }
    while(tempA!=tempB){
        tempA=tempA.next;
        tempB=tempB.next;
    }
    return tempA;

}
}