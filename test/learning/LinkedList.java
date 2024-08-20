package test.learning;


public class LinkedList {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int d){
            this.data = d;
            this.next = null;
        }

    }
    public static LinkedList insertElement(LinkedList list,int d){
        Node newNode = new Node(d);
        if(list.head == null){
            list.head = newNode;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node curNode = list.head;
        System.out.print("Linked List : ");
        while(curNode !=null){
            System.out.print(curNode.data +" ");
            curNode = curNode.next;
        }
    }
        public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.insertElement(list,1);
        list.insertElement(list,5);
        list.insertElement(list,9);
        list.insertElement(list,3);
        list.insertElement(list,7);
        printList(list);
//        list = reverseLinkedList(list);
        System.out.println();
         list.head = recursiveLinkedList(list.head);
            printList(list);
           list =  deleteByKey(list,1);
            printList(list);
    }

    private static LinkedList deleteByKey(LinkedList list,int i) {
        Node prev = null;
        Node curr = list.head;
        if(curr != null && curr.data ==i){
            list.head = curr.next;
            return list;
        }
        while(curr !=null && curr.data !=i){
            prev = curr;
            curr = curr.next;
        }
        if(curr !=null){
            prev.next = curr.next;
        }
        if(curr == null){
            System.out.println("Key Not found...!!!");
        }
        return list;
    }

    private static Node recursiveLinkedList(Node head) {
        if(head == null || head.next ==null){
            return head;
        }
        Node newHead = recursiveLinkedList(head.next);
        head.next.next =head;
        head.next =null;
        return newHead;
    }

    private static LinkedList reverseLinkedList(LinkedList list) {
        if(list.head == null || list.head.next ==null){
            return list;
        }
        Node prev = list.head;
        Node curNode = list.head.next;
        Node next = null;

        while(curNode !=null){
            next = curNode.next;
            curNode.next = prev;

            prev = curNode;
            curNode = next;
        }
        list.head.next = null;
        list.head = prev;
        return list;
    }
}
