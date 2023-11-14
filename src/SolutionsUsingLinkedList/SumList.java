package SolutionsUsingLinkedList;

import LinkeListApplication.LinkedList;
import LinkeListApplication.Node;

public class SumList {
    public LinkedList sumOfList(LinkedList linkedList1,LinkedList linkedList2){
        LinkedList summedLinkedList=new LinkedList();
        int leftDigitCarryOver=0;
        Node currentNode1=linkedList1.head;
        Node currentNode2=linkedList2.head;
        while(currentNode2!=null||currentNode1!=null){
            int result=leftDigitCarryOver;
            if(currentNode1!=null){
                result+=currentNode1.value;
                currentNode1=currentNode1.next;
            }
            if(currentNode2!=null){
                result+=currentNode2.value;
                currentNode2=currentNode2.next;
            }
            summedLinkedList.insertNode(result%10);
            leftDigitCarryOver=leftDigitCarryOver/10;
        }
        return summedLinkedList;
    }
}
