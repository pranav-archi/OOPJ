package p1;
import java.util.ArrayList;
import java.util.List;
class Perm{
	public static List<String> perm3(String s3) {
		List<String>list3=new ArrayList<>();
		String c1=s3.substring(0,1);
		String c2=s3.substring(1,2);
		String c3=s3.substring(2,3);
		list3.add(c1+c2+c3);
		list3.add(c1+c3+c2);
		list3.add(c2+c1+c3);
		list3.add(c2+c3+c1);
		list3.add(c3+c1+c2);
		list3.add(c3+c2+c1);
		return list3;
	}
	
}
public class Pranav2{
	public static void main(String[] args) {
		String s4="FAST";
		List<String>list4=new ArrayList<>();
		List<String>temp1=new ArrayList<>();
		String part1="";
		String part2="";
		String c1=s4.substring(0,1);
		String c2=s4.substring(1,2);
		String c3=s4.substring(2,3);
		String c4=s4.substring(3,4);
		
		part1=c1;
		part2=c2+c3+c4;
		temp1=Perm.perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+temp1.get(i));
		}
		part1=c2;
		part2=c1+c3+c4;
		temp1=Perm.perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+temp1.get(i));
		}
		
		part1=c3;
		part2=c1+c2+c4;
		temp1=Perm.perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+temp1.get(i));
		}
		
		part1=c4;
		part2=c1+c2+c3;
		temp1=Perm.perm3(part2);
		for(int i=0;i<6;i++) {
			list4.add(part1+temp1.get(i));
		}
		System.out.println(list4);
	}
}
