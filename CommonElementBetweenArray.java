import java.util.HashSet;

public class CommonElementBetweenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1= {"A","B","C","D","E"};
	    String[] s2= {"B","D","F","G","E"};
	    
	    HashSet<String> set= new HashSet<String>();	
	    for(int i=0; i<s1.length;i++)
	    {
	    	for(int j=0;j<s2.length; j++)
	    	{
	    		if(s1[i].equals(s2[j]))
	    		{
	    			set.add(s1[i]);
	    		}
	    	}
	    }
		System.out.println("The common elements between 2 arrays is :" +set);
	}

}
