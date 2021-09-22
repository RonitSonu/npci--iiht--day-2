import java.util.*;

class Grandfather{
	void House(){
		System.out.println("Created house for all");
	}
}

class Father extends Grandfather{
	void car(){
		System.out.println("Created cars for all");
	}
}

class Son extends Father{
	void Technology(){
		System.out.println("Technology provided for all");
	}

}

class main{
	public static void main(String[] args) {
		Son s=new Son();

		s.House();
		s.Car();
		s.Technology();
	}
}