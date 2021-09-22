import java.util.*;

class Vehicle{
	void base_specs(){
		System.out.println("Can be used to travel from one place to other");
	}
}

class Car extends Vehicle{
	void car(){
		//int wheels=4;
		System.out.println("This is a car");
	}
}

class Bike extends Vehicle{
	void bike(){
		//int wheels=2;
		System.out.println("This is a bike");
	}

}

class Harley extends Bike{
	void harley(){
		
		System.out.println("This is a superbike");
	}

}

class Maruti extends Car{
	void maruti(){
		
		System.out.println("This is an affordable car");
	}

}




class main{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur choice 'H' for Harley & 'M' for maruti");

        char ch=sc.next().charAt(0);
		if(ch=='M')
		{
            Maruti m = new Maruti();
            m.base_specs();
           // System.out.println("Maruti has "+m.wheels+" wheels");
            m.car();
            m.maruti();

		}
		else if(ch=='H')
		{
			Harley h = new Harley();
            h.base_specs();
           // System.out.println("Harley has "+h.wheels+" wheels");
            h.bike();
            h.harley();

		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}