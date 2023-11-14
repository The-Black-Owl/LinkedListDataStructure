package SolutionsUsingLinkedList;

import LinkeListApplication.LinkedList;
import LinkeListApplication.Node;

import java.util.HashSet;

public class DeleteDuplicates {
    public void deleteDuplicates(LinkedList linkedList){
        HashSet<Integer> integerHashSet=new HashSet<>();
        Node current=linkedList.head;
        Node prev=null;
        while(current!=null){
            int currentValue= current.value;
            if(integerHashSet.contains(currentValue)){
                //delete the current value
                prev.next=current.next;
                linkedList.size--;
            }
            else{
                integerHashSet.add(currentValue);
                prev=current;
            }
            current=current.next;
        }
//        linkedList.traverseLinkedList();
    }
}
