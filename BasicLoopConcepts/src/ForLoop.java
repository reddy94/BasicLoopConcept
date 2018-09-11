// program to print even and odd  numbers from 1-50
public class ForLoop {
	public static void main(String[] args) 
	{
		System.out.println("even number are:");
		for(int i=1;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("odd number are:");
		
         for(int j=1;j<=50;j++)
           {
        	 if(j%2==1)
        	 {
        		 System.out.println(j);
        	 }		 
           }
	}

}
