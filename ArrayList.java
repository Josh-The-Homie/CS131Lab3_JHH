import java.util.Arrays;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 
  
  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	      
    }//end preferred constructor
  /**
   * creates stop variable that is false by default
   * goes through the list to find an empty slot
   * Sets stop to true if so.
   * keeps going if it is not
   * returns stop
   * 
   */
  public boolean addItem(T item) { 
	  boolean stop=false;
while(currentItem<arList.length) {
	if(arList[currentItem]==null) {
		arList[currentItem]=item;
		stop=true;
		break;
	}
	else {
		currentItem++;
	}
}
return stop;
  }
  
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder("ArrayList [DEFAULT_SIZE=" + DEFAULT_SIZE );
		for(int i=0;i<arList.length;i++) {
			sb.append("\n currentItem=" +i+", "+arList[i]);
		}
		return sb.toString();

	}
	
	
}//end class 