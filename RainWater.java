import java.lang.*;
import java.util.*;
public class RainWater{
		public static void main(String [] args ){
				int []a={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};;
				int zc=0;
				int c1=0;
				int c2=0;
				int d=0;
				int q1=0;
				int q2=0;
				int e=0;
				int t=0;
				int nzc=0;
				int sub=0;//
				int z=0;
				
				int x=0;
				for(int i=0;i<a.length;i++){
					if(a[i]!=0 && zc==0 &&  d==0){
						c1=a[i];
					}
					if(a[i]==0){
						zc++;nzc++;
						continue;
					}
					if(c1!=0 && zc!=0){
						c2=a[i];
						if(c1>c2){
							//System.out.println(c2*zc);
							z=c2*zc;
							if(c1>q1){
								q1=c1;
							}
							c1=c2;
							d++;
							zc=0;
						}else if(c1<c2){
							if(q1!=0 && q1>c1){
								if(q1>c2){
									x++;
								t+=(c2*nzc);
							//	System.out.println("1");
								}else{
									t+=(q1*nzc);
									t+=z;
									System.out.println("2h");
								//	System.out.println(q1*nzc);
								}
							}else if(c1>q1){
								t+=(c1*zc);
							//	System.out.println("3");
							}
							zc=0;
							d++;
							c1=c2;
							
						}						
					}
				}
				System.out.println(t+z);
				
		}
}

