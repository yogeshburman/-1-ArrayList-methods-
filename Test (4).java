// Array list 
import java.util.Collections;
import java.util.ArrayList;
class Test {
  public static void main (String[]args){
    
  ArrayList<String> name = new ArrayList<String>();
  // add 
  name.add("yogesh");
  name.add("sourabh");
  name.add("bharat");
  name.add("Sanjay");
  
    // remove , delete element 
  name.remove(0);
  
  // adding element in between 
   
          // (index , value)
   name.add(1,"Yogesh");
   
   // set value on existing value
   
           // (index , value)
   name.set(2,"Bharat tiwari");
   
   
   // sorting list 
   Collections.sort(name);
   
   
   // printing  
    for(String s : name){
    System.out.println(s + " ");
  }
   System.out.println();
  // size
   System.out.println("Size of list " + name.size());
  }
}