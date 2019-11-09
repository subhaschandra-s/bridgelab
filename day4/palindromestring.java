package day4;
import java.util.Scanner;

public class palindromestring
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String st=sc.nextLine();
String nstr="";
char ch[]=st.toCharArray();

for (int i=0 ;i<ch.length/2;i++)
{
char t=ch[i];
ch[i]=ch[ch.length-1-i];
ch[ch.length-1-i]=t;
}

nstr=new String (ch);
if(nstr.equalsIgnoreCase(st))
System.out.println( st+" string is palindrome ");
else
System.out.println(st+" string is not palindrome");
}
}