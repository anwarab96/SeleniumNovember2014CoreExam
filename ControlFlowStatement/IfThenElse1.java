package ControlFlowStatement;

public class IfThenElse1 {

	public static void main(String[] args) {
		int user = 78;
		if (user<=18){
			System.out.println("User is just 18 or still younger ");
		}else if (user>18 && user <=40){
			System.out.println("User is old enough to driver car");
		}else if (user==45 || user==50){
			System.out.println("User is either 40 or 50");
		}
		
		else{
			System.out.println("User is older than 40  ");
		}

	}

}
