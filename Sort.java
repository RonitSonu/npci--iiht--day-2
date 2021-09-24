import java.util.*;

public class Sort{  
      public static void main(String args[]){  
  
          HashMap<Integer, String> data=new HashMap<Integer, String>();  
  
			data.put(35, "Ronit");  
			data.put(18, "Vikash");  
			data.put(13, "Shubham");  
			data.put(7, "Suraj");

			Iterator <Integer> it = data.keySet().iterator();         
			System.out.println("Before Sorting");  

			while(it.hasNext())  
			{  
				int key=(int)it.next();  
				System.out.println("Roll no:  "+key+"     name:   "+data.get(key));  
			} 

			System.out.println("\n");  
			Map<Integer, String> map=new HashMap<Integer, String>();  
			System.out.println("After Sorting");  

  
			TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (data);  
			Iterator itr=tm.keySet().iterator();               
			while(itr.hasNext())    
			{	    
				int key=(int)itr.next();  
				System.out.println("Roll no:  "+key+"     name:   "+data.get(key));  
			}    
	}  
}  