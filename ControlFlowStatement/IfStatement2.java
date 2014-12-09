package ControlFlowStatement;

public class IfStatement2 {

	public static void main(String[] args) {
		int temperature = 100;
		int freeze = 0;
		int score = 10;
		if(temperature>100)
		{
			
			System.out.println("Dang, It's Hotter!");
		}
		else if( temperature>80 && temperature<100)
		{
			System.out.println("Yes, its still Hot");
			
		}
		else if( temperature>60 && temperature<=80)
		{
			System.out.println("Hurray, its still Awesome");
	    }
		else if( temperature>=40 && temperature<=60)
		{
			System.out.println("Haahaaha, its  Fall");
	     }
		else if( freeze<temperature)
		{
			System.out.println("Yea...., its freezing");
		}
		
		else if( score==10 ||temperature==95)
	     {
			System.out.println("Its hot out, so am I ");	   
		}

		else
		{
			System.out.println("its cold");
			
		}

}
}
