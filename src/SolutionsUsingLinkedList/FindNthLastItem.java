package SolutionsUsingLinkedList;

import LinkeListApplication.LinkedList;
import LinkeListApplication.Node;

public class FindNthLastItem {
    public int nthLastItem(LinkedList linkedList, int n){
        Node pointer1= linkedList.head;
        Node pointer2= linkedList.head;
        //move pointer2 n units forward;
        for(int i=0;i<n;i++){
            pointer2=pointer2.next;
        }

        while(pointer2!=null){
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        int nthValue= pointer1.value;
        return nthValue;
    }
}
