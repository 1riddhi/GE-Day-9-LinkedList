import java.util.Scanner;
public class Main{
    public static void main(String []args){
        LinkedList linkedList=new LinkedList();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        linkedList.display();

        linkedList.insertAt(0,1);

        linkedList.display();

        linkedList.deleteFrom(0);
        linkedList.deleteFrom(0);

        linkedList.display();
    }
}