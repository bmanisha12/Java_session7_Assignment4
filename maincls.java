
public class maincls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	

		String str = "I am Proud to de an INDIAN CODER";
		
		System.out.println("Sentence : "+str);
		System.out.println("\n length of above given Sentence is  "+str.length());
		System.out.println("\n Character at 50th position is  "+str.charAt(50));
	}catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("\n  StringIndexOutOfBoundsException Caught ");
	}
}
	

}
