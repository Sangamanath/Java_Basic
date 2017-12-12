
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Core java is jsp servelet";
		
		String whitespace=str.replaceAll("\\s","");
		
		System.out.println(" The removed string is : " +whitespace);
		
		char[] strArry= str.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<=str.length();i++)
		{
			if((strArry[i] !=' ') && (strArry[i]!='\t'))
				{
						sb.append(strArry[i]);
				}
		}
		System.out.println(sb);

	}
	
// String str =str.concat("Worlds super");
	
}
