import java.lang.*;
import java.util.*;
class fnode{
    fnode next;
    fnode bottom;
    int data;
    public fnode(int data){
        this.data=data;
        this.next=null;
        this.bottom=null;
    }
}
public class FlattenedList {
        fnode head;
        public FlattenedList(){
            this.head=null;
        }
        void display(){
               fnode c=head;
                fnode c1=head;
                while(c1!=null){
                    while(c!=null){
                        System.out.print(" "+c.data);
                        c=c.bottom; 
                    }
                    c1=c1.next;
                    c=c1;   
                }
        }
        public static void main(String[] args){
            FlattenedList fl =new FlattenedList();
            fl.head=new fnode(1);
            fl.head.next=new fnode(2);
            fl.head.bottom=new fnode(3);
            fl.head.next.bottom=new fnode(4);
            fl.head.bottom.bottom=new fnode(5);
            fl.head.next.next=new fnode(6);
            fl.head.next.next.bottom=new fnode(7);
            fl.display();
        }
}
