package hello;
import java.util.*;
public class substring {
	static String plaindrome(String s) {
		String a=s;
		StringBuilder w=new StringBuilder(a);
		String v=String.valueOf(w.reverse());
		if(a.equals(v)) return a;
		else return "";
	}

	public static void main(String[] args) {
			 Scanner s=new Scanner(System.in);
			 String a=s.nextLine();
			 String b="";
			 String st[]=new String[a.length()];
			 for(int i=0;i<a.length();i++) {
				 st[i]=String.valueOf(a.charAt(i));
//				 System.out.println(st[i]);
			 }
			 for(int i=0;i<a.length()-1;i++) {
				 String g="";
				 String che="";
				 for(int j=i;j<a.length();j++) 
				 {
					  g+=String.valueOf(st[j]);
//					  System.out.println(g);a
					  if(g.length()>1)
					  {   
						   che=plaindrome(g); 
// 						   System.out.println(che);
						   if(b.length()<che.length()) b=che;
					  }
					  
				 }
				 if(b.length()==a.length())break;
				 
			 }
	 System.out.print(b);
	s.close();
	}

}

