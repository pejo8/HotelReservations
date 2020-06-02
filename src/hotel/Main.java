package hotel;

public class Main {

	public static void main(String[] args) {
		
		int size1 = 1;
		int size2 = 2;
		int size3 = 3;
		int[] test1a = {-4,2};
		int[] test1b = {200,400};
		int[] test2 = {0,5,7,13,3,9,5,7,6,6,0,4};
		int[] test3 = {1,3,2,5,1,9,0,15};
		int[] test4 = {1,3,0,15,1,9,2,5,4,9};
		int[] test5 = {1,3,0,4,2,3,5,5,4,10,10,10,6,7,8,10,8,9};
		
		System.out.println("Test 1a:\n		StartDate	EndDate		Result");
		Hotel hotel1a = new Hotel(size1);
		System.out.println("Booking 1	" + test1a[0] + "		" + test1a[1] + "		" + hotel1a.reservation(test1a[0],test1a[1]));
		
		System.out.println("\n------------------------------------------------------------\n");
		
		System.out.println("Test 1b:\n		StartDate	EndDate		Result");
		Hotel hotel1b = new Hotel(size1);
		System.out.println("Booking 1	" + test1b[0] + "		" + test1b[1] + "		" + hotel1b.reservation(test1b[0],test1b[1]));
		
		System.out.println("\n------------------------------------------------------------\n");
		
		System.out.println("Test 2:\n		StartDate	EndDate		Result");
		Hotel hotel2 = new Hotel(size3);
		for(int i=0; i<test2.length; i+=2)
			System.out.println("Booking " + (i/2+1) + "	" + test2[i] + "		" + test2[i+1] + "		" + hotel2.reservation(test2[i],test2[i+1]));
		
		System.out.println("\n------------------------------------------------------------\n");
		
		System.out.println("Test 3:\n		StartDate	EndDate		Result");
		Hotel hotel3 = new Hotel(size3);
		for(int i=0; i<test3.length; i+=2)
			System.out.println("Booking " + (i/2+1) + "	" + test3[i] + "		" + test3[i+1] + "		" + hotel3.reservation(test3[i],test3[i+1]));
		
		System.out.println("\n------------------------------------------------------------\n");
		
		System.out.println("Test 4:\n		StartDate	EndDate		Result");
		Hotel hotel4 = new Hotel(size3);
		for(int i=0; i<test4.length; i+=2)
			System.out.println("Booking " + (i/2+1) + "	" + test4[i] + "		" + test4[i+1] + "		" + hotel4.reservation(test4[i],test4[i+1]));
		
		System.out.println("\n------------------------------------------------------------\n");
		
		System.out.println("Test 5:\n		StartDate	EndDate		Result");
		Hotel hotel5 = new Hotel(size2);
		for(int i=0; i<test5.length; i+=2)
			System.out.println("Booking " + (i/2+1) + "	" + test5[i] + "		" + test5[i+1] + "		" + hotel5.reservation(test5[i],test5[i+1]));
		
	}

}
