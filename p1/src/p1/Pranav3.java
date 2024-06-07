package p1;
import java.util.ArrayList;
public class Pranav3 {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<>();
		ArrayList<String>list2=new ArrayList<>();
		int n1=0;
		char c1;
		String s1="";
		for(int i=65;i<91;i++) {
			list1.add(i);
		}
		int len1=list1.size();
		for(int i=0;i<len1;i++) {
			n1=(int)list1.get(i);
			c1=(char)n1;
			s1=String.valueOf(c1);
			list2.add(s1);
		}
		System.out.println(list1);
		System.out.println(list2);
		
		ArrayList<Integer>list3=new ArrayList<>();
		ArrayList<String>list4=new ArrayList<>();
		for(int i=97;i<123;i++) {
			list3.add(i);
		}
		int len2=list3.size();
		for(int i=0;i<len2;i++) {
			n1=(int)list3.get(i);
			c1=(char)n1;
			s1=String.valueOf(c1);
			list4.add(s1);
		}
		System.out.println(list3);
		System.out.println(list4);
	}
	

}
