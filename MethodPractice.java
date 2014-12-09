
public class MethodPractice {
	int height;
	String st;
	MethodPractice(){
		System.out.println("Bricks");
		height = 0;
	}
	MethodPractice(int i){
		height = i;
		System.out.println("Building new House that is "+ i+" feet tall");
	}
	void info(){
		System.out.println("House is "+ height+ "feet tall");
	}
	void info(String st){
		System.out.println(st + ": House is " + height + "feet tall");
		}
	public static class MethodForPractice{
		public static void main(String[] args){
			MethodPractice mpc = new MethodPractice();
			mpc.info();
			mpc.info("Overloaded method");
			// Overloaded constructor:
			new MethodPractice();
		}	
}
}
