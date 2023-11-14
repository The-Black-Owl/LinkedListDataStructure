package LinkeListApplication;

import java.util.logging.Logger;

public class LinkedList {
    Logger LOGGER= Logger.getLogger(LinkedList.class.getName());
    public Node head;
    public Node tail;
    public int size;

    public void createLinkedlist(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size=1;
        LOGGER.info("created Linked list");
    }

    public void insertNode(int nodeValue){
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
        LOGGER.info("inserted value: "+nodeValue);
    }

    public void traverseLinkedList(){
        Node tempNode=head;
        StringBuilder linkedList= new StringBuilder();
        for(int i=0;i<size;i++){
            linkedList.append(tempNode.value);
            if(i!=size-1){
                linkedList.append("->");
            }
            tempNode=tempNode.next;
        }
        LOGGER.info(linkedList.toString());
    }

}
