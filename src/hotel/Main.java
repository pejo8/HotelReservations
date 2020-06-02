package hotel;

public class Main {

	public static void main(String[] args) {
		
		int size1 = 1;
		int size2 = 2;
		int size3 = 3;
		
		System.out.println("Test 1a:\n");
		Hotel hotel1a = new Hotel(size1);
		System.out.println(hotel1a.reservation(-4,2));
		
		System.out.println("\n--------------------\n");
		
		System.out.println("Test 1b:\n");
		Hotel hotel1b = new Hotel(size1);
		System.out.println(hotel1b.reservation(200,400));
		
		System.out.println("\n--------------------\n");
		
		System.out.println("Test 2:\n");
		Hotel hotel2 = new Hotel(size3);
		System.out.println(hotel2.reservation(0,5));
		System.out.println(hotel2.reservation(7,13));
		System.out.println(hotel2.reservation(3,9));
		System.out.println(hotel2.reservation(5,7));
		System.out.println(hotel2.reservation(6,6));
		System.out.println(hotel2.reservation(0,4));
		
		System.out.println("\n--------------------\n");
		
		System.out.println("Test 3:\n");
		Hotel hotel3 = new Hotel(size3);
		System.out.println(hotel3.reservation(1,3));
		System.out.println(hotel3.reservation(2,5));
		System.out.println(hotel3.reservation(1,9));
		System.out.println(hotel3.reservation(0,15));
		
		
		System.out.println("\n--------------------\n");
		
		System.out.println("Test 4:\n");
		Hotel hotel4 = new Hotel(size3);
		System.out.println(hotel4.reservation(1,3));
		System.out.println(hotel4.reservation(0,15));
		System.out.println(hotel4.reservation(1,9));
		System.out.println(hotel4.reservation(2,5));
		System.out.println(hotel4.reservation(4,9));
		
		System.out.println("\n--------------------\n");
		
		System.out.println("Test 5:\n");
		Hotel hotel5 = new Hotel(size2);
		System.out.println(hotel5.reservation(1,3));
		System.out.println(hotel5.reservation(0,4));
		System.out.println(hotel5.reservation(2,3));
		System.out.println(hotel5.reservation(5,5));
		System.out.println(hotel5.reservation(4,10));
		System.out.println(hotel5.reservation(10,10));
		System.out.println(hotel5.reservation(6,7));
		System.out.println(hotel5.reservation(8,10));
		System.out.println(hotel5.reservation(8,9));
	}

}
