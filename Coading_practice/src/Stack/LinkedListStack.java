package Stack;

/**
 * Created by Mathurs on 9/15/16.
 */
public class LinkedListStack {

    ListNode head;

    public LinkedListStack(){
        this.head .next = null;
    }

    public void push(int data){
        ListNode node =  new ListNode(data);
        node.setNext(head.getNext());
        head.setNext(node);
    }

    public int pop(){
        ListNode node = head.next;
        head.setNext(node.getNext());
        return node.getData();
    }

    public int peek(){
        return head.getNext().getData();
    }
}

class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
        this.next = null;
    }

    public void setNext(ListNode node){
        this.next = node;
    }

    public ListNode getNext(){
        return this.next;
    }

    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }
}
