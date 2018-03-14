import java.lang.*;
import java.util.*;
public class SumOfNodeAtKLevelrepByString{
		Node root;
		public SumOfNodeAtKLevelrepByString(){
			this.root=null;
		}
		void sumAtLevel(String t,int k){
			int level=-1;
			int sum=0;
			for(int i=0;i<t.length();i++){
				if(t.charAt(i)=='('){
					level++;
				}else if(t.charAt(i)==')'){
					level--;
				}else {
					if(level==k){
						sum+=Character.getNumericValue(t.charAt(i));
					}
				}
			}
			System.out.println(sum);
		}
		public static void main(String [] args){
			SumOfNodeAtKLevelrepByString a= new SumOfNodeAtKLevelrepByString();
			String t1="(0(5(6()())(4()(9()())))(7(1()())(3()())))";
			String t2="(8(3(2()())(6(5()())()))(5(10()())(7(13()())())))";// use char array instead for using 2 digit values//
			int k=2;
			a.sumAtLevel(t1,k);
		}
}