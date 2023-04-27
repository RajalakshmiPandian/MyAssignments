package week1.day1;

public class Bike {

 public void applyBreak() {
 System.out.println("Bike Break is applied");
 }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car Car = new car();
       Car.applyBreak();
       Car.SoundHorn();
       Bike.bike=new Bike();
       Bike.applyBreak();
	}

}