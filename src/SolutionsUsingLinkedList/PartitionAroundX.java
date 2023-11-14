package SolutionsUsingLinkedList;

import LinkeListApplication.LinkedList;
import LinkeListApplication.Node;

public class PartitionAroundX {
    public LinkedList partition(LinkedList linkedList,int x){
        Node currentNode= linkedList.head;
        linkedList.tail=linkedList.head;
        while(currentNode!=null){
            Node next=currentNode.next;
            if(currentNode.value<x){
                currentNode.next=linkedList.head;
                linkedList.head=currentNode;
            }
            else {
                linkedList.tail.next=currentNode;
                linkedList.tail=currentNode;
            }
            currentNode=next;
        }
        linkedList.tail.next=null;
        return linkedList;
    }
}
