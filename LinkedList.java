public class LinkedList<T  extends Comparable<T>> {
    Node<T> head;
    Node<T> temp;

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

    public int size(){
        temp=head;
        int length=0;
        while(temp!=null){
          length++;
          temp=temp.next;
        }
        return length;
    }

     public void insertAt(int position, T data) {
       if(!valid(position)) return ;
        Node<T> newNode = new Node<>(data);
        if(position == 0){
            newNode.next = head;
            head = newNode;
        } else {
            temp = head;
            for(int i = 0; i < position - 1; i++){
                    temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    } 

    public boolean valid(int position){
         if(position < 0 || position > size()){
            System.out.println("Invalid Position !!!");
            return false;
        }
        return true;
    }


    public boolean isEmpty(){
        return head==null;
    }

    public void deleteFrom(int position) {
        if(isEmpty() || !valid(position)){
            System.out.println("Invalid Position !!!");
            return;
        }
        if(position == 0 ){
            head = head.next;
        } else {
            temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public int Search(T value) {
        temp = head;
        int position = 0;
        while(temp != null){
            if(temp.data==value){
                return position;
            }
            temp = temp.next;
            position++;
        }
        return -1;
    }

    public void addSorted(T data){
        Node<T> newNode=new Node<>(data);
        if (head == null || data instanceof Comparable && ((Comparable<T>) data).compareTo(head.data) < 0) {
            
            newNode.next=head;
            head=newNode;
            return;
        }
        temp=head;
        Node<T> prevNode=null;
        while(temp!=null && ((Comparable<T>) data).compareTo(temp.data) >0){
            prevNode=temp;
            temp=temp.next;
        }
        if (prevNode != null) {
            prevNode.next = newNode;
        } else {
            head = newNode;
        }
        newNode.next=temp;
        return;

    }
    
}

