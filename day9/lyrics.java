package day9;
import java.util.Scanner;

public class lyrics
{
     public static void main(String args[])
     {
    	 
    	Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter the Animal name");
    	 String str = sc.nextLine();
    	 
    	
    	 String sound;
    	 switch (str)
    	 { 
         case "chicks": 
             sound = "chick"; 
             break; 
         case "Duck": 
             sound = "quack"; 
             break; 
         case "turkey": 
             sound = "gobble"; 
             break; 
         case "cat": 
             sound = "meow-meow"; 
             break; 
         case "mule": 
             sound = "Heehaw"; 
             break; 
         case "urkey": 
             sound = "gobble"; 
             break; 
         case "dog": 
             sound = "bow-wow"; 
             break; 
         case "pig": 
             sound = "oink-oink"; 
             break;
         case "turtle": 
             sound = "nerp-nerp"; 
             break;
         case "cow": 
             sound = "moo-moo"; 
             break;
         default: 
             sound = "Animal not in list"; 
             break; 
         } 
    	 
    	 String s1="Old MacDonald had a farm,\r\n" + 
     	 		"E-I-E-I-O.\r\n" + 
     	 		"And on his farm he had some %ANIMAL%,\r\n" + 
     	 		"E-I-E-I-O.\r\n" + 
     	 		"With a %SOUND%, %SOUND% here,\r\n" + 
     	 		"And a %SOUND%, %SOUND% there,\r\n" + 
     	 		"Here a %SOUND%, there a %SOUND%,\r\n" + 
     	 		"Everywhere a %SOUND%, %SOUND%,";
    	 
    	 System.out.println(s1.replace("ANIMAL", "cat"));
    	 System.out.println(s1.replace("SOUND", "meow meow"));
     }
}
