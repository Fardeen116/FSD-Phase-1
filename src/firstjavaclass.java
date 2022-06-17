
public class firstjavaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(); //creating an object of type student
		std1.name = "Fardeen";
		System.out.println(std1.name);  // accessing properties
		
		Student std2 = new Student();
		std2.name = "Fajal";
		System.out.println(std2.name);
		std1.attendSession(); // calling the class method so () is required
		
		// here 2 and 4 are called as arguments
		std2.sumOfNumber(2, 4);
	}
}

class Student{
	String name;     //properties or data or instance variable
	int rollno;
	String course;
	
	// constructor - have the same name as class name and have no return type
	//not even void
	
	// this is a no argument constructor
	Student(){
		System.out.println("Constructor called");
	}
	
	// here int is a return type
	// here x and y are called as parameter
	int sumOfNumber(int x, int y) {
		/*int x =10;
		int y =20;*/
		
		int z = x + y;
		return z;
	}
	
	void attendSession(){    //Behavior or  instance method
		System.out.println("Attend session method called");
		//open webx
		//login to webex using your rollno
		//join the course you have enrolled
		
	}
	
	void leaveSession() {
		//leave the course sesion by clicking leave session
	}
	
	void askQuestion() {
		
	}
	
}