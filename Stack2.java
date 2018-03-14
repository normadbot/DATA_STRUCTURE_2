import java.lang.*;
import java.util.*;
public class Stack2{
		static	int top=-1;
		static int a[]=new int[5];
		public void push(int data){
			try{
			a[++top]=data;
			}catch(Exception e){
				System.out.println("Its an Overflow Condition");
			}
		}
		public void pop(){
			try{
				top--;
				if(top==-1){
					throw new Exception();
				}
				for(int i=0;i<=top;i++){
					System.out.print(" "+a[i]);
					}
					System.out.println();
			}catch(Exception e){
				System.out.println("This is  an UnderFlow Condition ");
			}
		}
		public static void main(String [] args){
			Stack2 stk = new Stack2();
			stk.push(10);
			stk.push(20);
			stk.push(30);
			stk.push(40);
			
			System.out.println(Arrays.toString(a));
			stk.pop();
			stk.pop();
			stk.pop();
			stk.pop();
			
			
			
			
		}
}