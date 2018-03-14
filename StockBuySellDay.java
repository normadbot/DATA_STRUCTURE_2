import java.lang.*;
import java.util.*;
public class StockBuySellDay{
	public static void main(String [] args){
		int a[] ={100,180,260,310,40,535,695};
		int buy[]=new int[a.length];
		int sell[]=new int[a.length];
		int i=0;
		int b=0;
		int s=0;
		while(i!=a.length-1){
			while(i<a.length-1 && a[i+1]>a[i]){
				i++;
				if(i==a.length-1)break;
			}
			buy[b++]=i;
			while(i<a.length-1 && a[i+1]<a[i]){
				i++;
			}
			sell[s++]=i;
			if(i==a.length-1)break;	
		}
		for(int j=0;j<buy.length;j++){
			System.out.print(buy[j]);
		}
		System.out.println();
		for(int j=0;j<sell.length;j++){
			System.out.print(sell[j]);
		}
		
	}
}
