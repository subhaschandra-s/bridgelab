package DS;

import DS.singlylinkedlist.Node;

public class mainrunner 
{
public static void main(String[] args) 
{
	singlylinkedlist sl=new singlylinkedlist();
	sl.add("xyz");
	sl.add("abc");
	sl.add("mno");
	sl.add("jsp");
	System.out.println(sl);
	//sl.Dispreverse(sl.head);
	
     sl.reverse(sl.head);
	System.out.println(sl);
	sl.add("abc",2);
	
//	sl.addFirst("rst");
//	System.out.println(sl);
//	System.out.println(sl.getFirst()); 
//	System.out.println(sl.getLast());
//	System.out.println(sl);
//	System.out.println(sl.deleteLast());
//	System.out.println(sl);
//	System.out.println(sl.deleteFirst());
//	System.out.println(sl);
//	sl.add("sub",2);
//	System.out.println(sl);
//	sl.add("cahnna", 0);
//	System.out.println(sl);
//	sl.add("mannu", 5);
//	System.out.println(sl);
//	sl.delete(3);
//	System.out.println(sl);
//	sl.delete(0);
//	System.out.println(sl);
	
	
	
}
}
