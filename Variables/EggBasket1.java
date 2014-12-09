package Variables;

public class EggBasket1 {

	public static void main(String[] args) {
		//variable declaration
		int numberOfBaskets, eggsPerBasket, totalEggs;
		//assignment statement means value assign to varialbe
		numberOfBaskets= 10;
		eggsPerBasket = 6;
		
		totalEggs = numberOfBaskets*eggsPerBasket;
		System.out.println("If you have ");
		System.out.println(eggsPerBasket + "eggs per basket and ");
		System.out.println(numberOfBaskets +  " baskets , then ");
		System.out.println("the total number of eggs is " + totalEggs);

	}

}
