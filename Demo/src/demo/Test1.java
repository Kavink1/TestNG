package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) 
		{
			ArrayList t=new ArrayList();
			Scanner sc=new Scanner(System.in);
			int no1=sc.nextInt();
			for(int i=1;i<=no1;i++)
			{
				int no=sc.nextInt();
				int[] a = new int[no];
				for (int i1 = 0; i1<a.length; i1++) 
				{
					a[i1]=sc.nextInt();
				}
				int sum=0;
				for (int i1 = 1; i1 < a.length; i1++) 
				{
					sum=sum+Math.abs(a[i1-1]-a[i1]);
					t.add(sum);
				}
				for(int i1 = 0; i1 < 1; i1++)
				{  
		            int j, first;
		            first = a[0];  
		            for(j = 0; j < a.length-1; j++)
		            {    
		                a[j] = a[j+1];  
		            }
		            a[j] = first;  
		        }  
				for (int i1 = 1; i1 < a.length; i1++) 
				{
					sum=sum+Math.abs(a[i1-1]-a[i1]);
				}
				
			}
			Collections.sort(t);
			for(int i=0;i<no1;i++)
			{
				System.out.println(t.get(i));
			}
			
		}
	}

