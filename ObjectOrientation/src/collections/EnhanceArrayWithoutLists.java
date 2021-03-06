package collections;

public class EnhanceArrayWithoutLists {
	public static String[] add(String[] originalArray, String newItem)
	{
	    int currentSize = originalArray.length;
	    int newSize = currentSize + 1;
	    String[] tempArray = new String[ newSize ];
	    for (int i=0; i < currentSize; i++)
	    {
	        tempArray[i] = originalArray [i];
	    }
	    tempArray[newSize- 1] = newItem;
	    return tempArray;   
	}
	public static void main( String[] args )
	{
	    String[] thisIsAStringArray = {"Car", "Van", "Bike"};
	    thisIsAStringArray = add(thisIsAStringArray, "SUV");
	    for (String element:thisIsAStringArray) {
	        System.out.println( element );
	    }
	}
}
