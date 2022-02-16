 public class LinkedList {

     public class Node {
         int data;  // null
         Node next;  //null


         public Node(int data, Node next) {
             this.data = data;
             this.next = next;
         }

         public Node(int data) {
             this.data = data;
         }
     }
        Node head;

        public void insertAtFront(int data){
            if(head == null){
                head = new Node(data);
            }else {
                head = new Node(data, head);
            }
        }

        public void insertAtLast(int data){
            if(head == null){
                head = new Node(data);
            } else {
                Node current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = new Node(data);
            }
        }
        public void insertBeforeGivenLocation(int place , int newValue, LinkedList list){
            if(head == null){
                System.out.println("empty list can't enter");
            } else if (count(list) >1) {
                Node current = head;

               while(current.next.data != place) {
                   current = current.next;
               }
                Node temp = current.next;
                current.next = new Node(newValue);
                System.out.println(">>>temp.data  " + temp.data );
                current.next.next = temp;
            }
            else{
                insertAtFront(newValue);
            }
        }

     public int count(LinkedList list) {
            int counter = 0;
            Node current = head;
            while(current !=null){
                counter = counter +1;
                current = current.next;
            }
            return counter;
     }

     public void deleteLastNode(){
            if(head == null){
                System.out.println("list is empty");
            } else {
                Node current = head;
                while(current.next.next != null){
                    current = current.next;
                }
                current.next = null;
            }
        }
        public void deleteFirstNode(){
            if(head == null){
                System.out.println("list is empty");
            } else {
                head = head.next;
            }
        }

        public void print(LinkedList list) {
            Node copyFirstNode = head;
            while(copyFirstNode != null){
                System.out.print(copyFirstNode.data + "-->" + copyFirstNode.next + "     ");
                copyFirstNode = copyFirstNode.next;
            }
        }
}
