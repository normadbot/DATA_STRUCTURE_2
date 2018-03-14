import java.util.Deque;
import java.util.LinkedList;

class DequeExample{
public static void main(String[] args){
Deque deque=new LinkedList();


deque.add(44);
deque.offer("test");
deque.offerFirst("Hello");
deque.addLast("Roseindia");
deque.offer(11);

System.out.println("size of deque : "+deque.size());
System.out.println("Elements in deque: "+deque);


deque.remove();
deque.pollFirst();
System.out.println("size of deque : "+deque.size());
System.out.println("Elements in deque: "+deque);

System.out.println("Last element in deque: "+deque.peekLast());
System.out.println("Top element of deque : "+deque.element());

}
}