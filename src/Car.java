public class Car extends Vehicle{
	private int speed;
	private String CarName;
	private String color;
	
	public Car(){   //constructor
		System.out.println("The car is starting.");
	}
	public Car(String CarName, String color){    //overloaded constructor
		System.out.println("The "+ color + " "+ CarName+ " is starting.");
		this.CarName = CarName; //can also be written as: this.setCarName(CarName);
		this.color = color; //this.setcolor(color);
		
		
	}
	public void setSpeed(int speed){ //the speed has been set
		this.speed = speed;          // setter
	}
	public void setCarName(String CarName){
		this.CarName = CarName;
	}
    public void setcolor(String color){
    this.color = color;
      
   }
    public int getspeed(){ //getter
    	return speed;
    
    }
    public String getCarName(){
    	return CarName;
    	
    }public String getcolor(){
    	return color;
    }
    @Override
   
    public String accelerate(){ //methods
    	this.speed = 400;
        return "The "+ color +" "+ CarName + " is accelerating at the speed of "+ speed +" miles per hour."; 
    }
    public String sound(){
        return "The "+ color+ " "+ CarName+ " is making a lot of sound.";
    }
    public String brake(){
    	return "The "+ color + " "+ CarName+" is slowing down.";
    		
    }
    @Override
    public String stop(){
    	return "The "+ color + "  "+ CarName+" stopped.";
    }
   }