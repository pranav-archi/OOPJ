package Kuthyar2;

import java.util.ArrayList;
import java.util.List;



class Flowers{
	private String flowerId;
	private String name;
	private String desc;
	private double price;
	int qtyAvailable;
	public Flowers(String flowerId,String name,String desc,double price,int qtyAvailable) {
		this.flowerId=flowerId;
		this.name=name;
		this.desc=desc;
		this.price=price;
		this.qtyAvailable=qtyAvailable;
	}
	public void displayDetails() {
		System.out.println("Flower id:"+flowerId);
		System.out.println("Name:"+name);
		System.out.println("Description:"+desc);
		System.out.println("Price:$"+price);
		System.out.println("Quantity Available:"+qtyAvailable);
	}
	public int updateQty(int newQty){
		qtyAvailable=newQty;
		System.out.println("Quantity updated successfully");
		return qtyAvailable;
		
	}
	public double calctotalCost(int qty) {
		double amt=price*qty;
		System.out.println(amt);
		return amt;
		
	}
	
}
	class ShoppingCart{
		private List<Flowers> flowers;
		private double totalPrice;
		private int totalQty;
		private static int cartIdcount=1;
		private int cartId;
		
	
		public ShoppingCart(){
		flowers=new ArrayList<>();
		totalPrice=0.0;
		totalQty=0;
		cartId=cartIdcount++;
	} 
		public void addToCart(Flowers flowers,int qty) {
			if(flowers.qtyAvailable>=qty) {
				flowers.add(flowers);
				totalPrice+=flowers.calctotalCost(9);
				totalQty+=qty;
			}
		}
		
	
		
	
	
	}
public class Test2{
	public static void main(String[] args) {
		Flowers fl1=new Flowers("2A","Rose","WhiteRose",50.0,80);
		fl1.displayDetails();
		fl1.updateQty(5);
		fl1.calctotalCost(8);
		fl1.addToCart(["Lily"],4);
		
	}
	
	

}

