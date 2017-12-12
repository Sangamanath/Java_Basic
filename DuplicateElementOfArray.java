
public class DuplicateElementOfArray {

	public static void main(String args[])
	{
		String[] str1={"A","B","C","D","D","A","F","C"};
		for(int i=0; i<str1.length-1;i++)
		{
			for(int j=i+1; j<str1.length; j++)
			{
				
			if(str1[i].equals(str1[j]))
			{
				System.out.println("Duplicate elements is :" +str1[j]);
				
			}
			
			}
			
		}
	}
}
