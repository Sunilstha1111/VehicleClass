
public class CarApp {
	public static void main (String[] args){
		
		String car1 = "Lamborghini";
		String car2 = "Bugati Veyron";
		
		String color1 = "blue";
		String color2 = "black";
		
		Car a = new Car (car1, color1);
		Car b = new Car (car2, color2);
		print(a.accelerate());
		print(b.accelerate());
		print(a.sound());
		print(b.sound());
		print(a.brake());
		print(a.stop());
			
		
		print(b.brake());
		print(b.stop());
	}
		public static void print(String s){
			System.out.println(s);
		}
			
	}


