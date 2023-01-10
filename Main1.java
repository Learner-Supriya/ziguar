/***1st Question */
import java.util.*;
public class Main1
{
    public int Position(Queue<Character> q,char look){
        

    int counter = 0;
    for (Character character : q) {
        if (character == look) {
            counter++;
            break;
        }
        else counter++;
    }
    return counter;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Queue<Character> q=new LinkedList();
		
		//Adding persons to the queue here
		q.add('A');q.add('B');q.add('C');q.add('D');
		q.add('E');q.add('F');q.add('A');q.add('B');
		q.add('C');q.add('D');q.add('A');q.add('B');
		q.add('C');q.add('A');q.add('B');q.add('A');
		
		//object is created to access the position method which is used to find the index of first occurrence of element in the queue
		Main1 m=new Main1();

        //taking index and inactive persons data from (user)standard input
        
	    int currentIndex;
	    System.out.print("Enter index position: ");
	    currentIndex=sc.nextInt();
	    int nextIndex=currentIndex+1;
	    
	    System.out.print("Enter the inactive elements seperated by space: ");
	    String temp=sc.nextLine();
	    char[] inactive=new char[temp.length()/2+1];int index=0;
	    for (int i=0;i<temp.length() ;i=i+2 ) {
	        inactive[index]=temp.charAt(i);
	        index++;
	    }
	    
	    // find the position of inactive member and remove them from the queue. If member is before the index member, then only next index member position changes.
	    for(int i=0;i<inactive.length;i++){

	    while(q.contains(inactive[i])){
	        
	        if(m.Position(q,inactive[i])<=currentIndex){
	            nextIndex--;
	            currentIndex--;
	        }
	        q.remove(inactive[i]);
	    }
	    }
	    currentIndex=nextIndex;
	    
	    
	System.out.println("The new current index="+currentIndex);

	}
}
