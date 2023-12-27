public class LinkedList<T> {
    Node<T> head,temp;

    public LinkedList() {
        this.head = null;
    }

    
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null){
            temp = head = newNode;
        } else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    
}
