/*All inter question in linkedlist
1 question Can we delelte a node given the node itself as paramater
Ye leetCode ka 237 no question h */
public class L152{
    public void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

