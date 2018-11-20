import java.util.*;
public class StreetParadeProblems{
public static void main(String[] args) {

	Stack<Integer> b=new Stack<Integer>();
	Scanner s=new Scanner(System.in);
int t=s.nextInt();

	
while(t-->0){	
	int n=s.nextInt();
	
	int[]  a2=new int[n];
	int[]  a1=new int[n];
	int[]  c=new int[n];
		int j=0,k=0;
			for(int i=0;i<n;i++)
		{
		     a1[i]=s.nextInt();	
		}
		for(int i=0;i<n;i++)
		{                                                    
			a2[j]=a1[i];
			j++;
		}
		int z=0;
		Arrays.sort(a2);
		int i=0;
		while(i<n)
		{
			if((a1[i]==a2[z]))
			{
				c[k]=a1[i];
				i++;
				k++;
				z++;
			}
			else
			{
				b.add(a1[i]);
				i++;
			}
			while((b.empty()==false)&&(b.peek()==a2[z]))
			{
				c[k]=b.pop();
				k++;
				z++;
			}
		}
		int flag=0;
		
			for(int l=0;l<c.length;l++)
			{
			              if(c[l]==0)
			              {
			            	  flag=1;
			              }
			}
			if(flag==1)
			{
				System.out.println("No");
				
			}
			else
			{
				System.out.println("Yes");
			}
	b.clear();
			
		
}


}
}
