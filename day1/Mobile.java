package week1.day1;

public class Mobile {

	public void make call() {
    String MobileModel = "Redmi10";
    float MobileWeight = 1.8f;
    System.out.println("Mobile model is"+ mobileModel+" Weight is" + MobileWeight);
	}
	
	public void SendSms() {
		boolean isFullCharged = true;
		int mobileCost = 17000;
		System.out.println("Mobile fully charged or not"+ is fully charged+" MobileCost is"+mobilecost);
	}
	public static void main(String[] args) {
		Mobile1 mob = new Mobile();
		mob.makecall();
		mob.SendSms();
		
	}

}
