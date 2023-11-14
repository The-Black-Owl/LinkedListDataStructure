import LinkeListApplication.LinkedList;
import SolutionsUsingLinkedList.DeleteDuplicates;
import SolutionsUsingLinkedList.FindNthLastItem;
import SolutionsUsingLinkedList.PartitionAroundX;
import SolutionsUsingLinkedList.SumList;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();
        SumList sumList=new SumList();
        DeleteDuplicates deleteDuplicates=new DeleteDuplicates();
        linkedList1.createLinkedlist(1);
        linkedList1.insertNode(2);
        linkedList1.insertNode(1);
        linkedList2.insertNode(3);
        linkedList2.insertNode(4);
        linkedList2.insertNode(5);
        LinkedList linkedList=sumList.sumOfList(linkedList1,linkedList2);
        linkedList.traverseLinkedList();

//        linkedList.traverseLinkedList();
//        deleteDuplicates.deleteDuplicates(linkedList);
//        PartitionAroundX partitionAroundX=new PartitionAroundX();
//        partitionAroundX.partition(linkedList,2);
//        linkedList.traverseLinkedList();

//        FindNthLastItem nthLastItem=new FindNthLastItem();
//        System.out.println(nthLastItem.nthLastItem(linkedList,2));
    }
}
