package DS;

public class mainrunner2 
{
	public static void main(String[] args) 
	{
		queue q=new queue(5);
		q.enQue(28);
		q.enQue(35);
		q.enQue(56);
		System.out.println(q);
		System.out.println(q.deque());
		System.out.println(q);
		System.out.println(q.deque());
		System.out.println(q);
		
		
		
	}

}
