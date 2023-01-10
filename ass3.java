/*****Find length of linkedlist */
import java.util.*;
public class ass3
{
	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    
    int len=0;
    Iterator<String> itr=list.iterator();
    while(itr.hasNext()){
      len++;
      itr.next();
      
	}
	System.out.print(len);

}
}
