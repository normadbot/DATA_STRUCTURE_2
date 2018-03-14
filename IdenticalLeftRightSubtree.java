import java.lang.*;
import java.util.*;
class tnode{
    tnode left;
    tnode right;
    int data;
    public tnode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class IdenticalLeftRightSubtree {
    tnode root;
    public  IdenticalLeftRightSubtree(){
        this.root=null;
    }
    public static void main(String [] args){
        IdenticalLeftRightSubtree ilr=new IdenticalLeftRightSubtree();
        ilr.root=new tnode(50);
        ilr.root.left=new tnode(10);
        ilr.root.right=new tnode(60);
        ilr.root.left.left=new tnode(5);
        ilr.root.left.right=new tnode(20);
        ilr.root.right.right=new tnode(70);
        ilr.root.right.left=new tnode(70);
        ilr.root.right.left.left=new tnode(65);
        ilr.root.right.left.right=new tnode(80);
        ilr.root.right.right.right=new tnode(80);
        ilr.root.right.right.left=new tnode(65);
        
    }
}
