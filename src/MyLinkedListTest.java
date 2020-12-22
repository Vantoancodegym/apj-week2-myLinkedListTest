import javax.xml.soap.Node;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList("t");
        myLinkedList.add(1,"o");
        myLinkedList.add(2,"a");
        myLinkedList.addFirst("H");
        MyLinkedList.Node node= myLinkedList.get(8);
        myLinkedList.printList();
        System.out.println(node.getData());

    }
}
