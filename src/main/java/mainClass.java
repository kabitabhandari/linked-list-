public class mainClass {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtFront(1);
//        list.insertAtFront(2);
//        list.insertAtFront(3);
//        list.insertAtFront(4);
//        list.insertAtFront(5);
//        list.insertAtFront(6);
//        list.insertAtLast(55);
//        list.insertAtLast(56);
//        list.insertAtLast(57);
        list.insertBeforeGivenLocation(1, 10000,  list);
        //list.deleteLastNode();
        //list.deleteFirstNode();
        list.print(list);
        list.count(list);
    }
}
