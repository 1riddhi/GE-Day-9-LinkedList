import java.util.Scanner;
public class Main{
    public static void main(String []args){
        LinkedList linkedList=new LinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        linkedList.display();
        
        System.out.println("Insert value=1 at 0th position");
        linkedList.insertAt(0,1);

        linkedList.display();

        System.out.println("Delete 1st two elements");

        linkedList.deleteFrom(0);
        linkedList.deleteFrom(0);

        linkedList.display();

        System.out.println("Before deleting last element");
        linkedList.display();

        int lastPosition=linkedList.size()-1;

        linkedList.deleteFrom(lastPosition);
        
        System.out.println("After deleting last element");
        linkedList.display();

        System.out.println("Position of element 30 :"+linkedList.Search(30));


        System.out.println("Insert 56,30,40,70 in sorted linkedlist");
        linkedList.head=null;
        linkedList.addSorted(56);
        linkedList.addSorted(30);
        linkedList.addSorted(40);
        linkedList.addSorted(70);

        linkedList.display();

    }
}