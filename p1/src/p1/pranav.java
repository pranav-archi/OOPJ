package p1;
public class pranav {
	public void genOTP(int size,int qty) {
		for(int i=0;i<qty;i++) {
			double d1;
			d1=Math.random()*(Math.pow(10,size));
			int otp=(int) d1;
			System.out.println(otp);
		}
	}
	public static void main(String[] args) {
			pranav A=new pranav();
			A.genOTP(6,5);
	}
}
