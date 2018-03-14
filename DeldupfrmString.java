import java.lang.*;
import java.util.*;
public class DeldupfrmString{
		static void method1(String str){
			String s="";
			for(int i=0;i<str.length();i++){
				if(!s.contains(String.valueOf(str.charAt(i)))){
					s+=String.valueOf(str.charAt(i));
				}
			}
			System.out.println(s);
		}
		public static void main(String [] argsa){
			String str="abcdabbdefgc";
			String str2="12324444432271";
			String str1="111222333444555";
			char a[]= str.toCharArray();
			System.out.println(str);
			System.out.println();
		//	method1(str);
		//	method2(a);	
		///	method3(a);
			method4(a);
		}
		static void method3(char a[]){
			int len=a.length;
			if(len<2)return;
			int tail =1;
			for(int i=1;i<len;++i){
				int j;
				for(j=0;j<tail;++j){
					if(a[i]==a[j])break;
				}
				//System.out.println(j);
				if(j==tail){
					a[tail]=a[i];
					++tail;
				}
			}
			a[tail]='\0';//to give space
			for(int i=0;i<len;i++){
				System.out.print(" "+a[i]);
			}
		}
		static void method2(char a[]){
			int size=a.length;
			int t=0;
			for(int i=0;i<size;i++){
				for(int j=i+1;j<size;){
					if(a[i]==a[j] ){
						t=a[i];
						for(int k=j;k<size-1;k++){
							a[k]=a[k+1];
						}	
						if(t==a[j]);
							else j++;
					}else{
					j++;	
					}
					
				}
			}
			for(int i=0;i<t;i++){
				System.out.print(" "+a[i]);
			}
		}
		static void method4(char a[]){
			int tail=1;
			if(a.length<2)return;
			for(int i=1;i<a.length;++i){
				int j;
				for( j=0;j<tail;++j){
					if(a[j]==a[i])break;
				}
				if(tail==j){
					a[tail]=a[i];
					++tail;
				}
			}
			a[tail]='\0';
			for(int i=0;i<a.length;i++){
				System.out.print(" "+a[i]);
			}
		}
	}	
	

