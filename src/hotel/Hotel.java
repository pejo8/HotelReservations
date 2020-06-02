package hotel;

import java.util.Arrays;

public class Hotel {
	
	private Room[] hotel;
	
	public Hotel(int size) {
		
		if(size<1 || size>1000) {
			System.err.println("Invalid size...");
			return;
		}
		
		this.hotel = new Room[size];
		for(int i=0; i<size; i++) {
			this.hotel[i] = new Room();
		}
	}
	
	public String reservation(int start,int end) {
		
		if(start < 0 || end>364 || start>end) {
			return "Decline";
		}
		
		Arrays.sort(this.hotel, (o1,o2) -> {
			return Math.abs((o1.first_left_end(start) - start)) - Math.abs((o2.first_left_end(start) - start));
		});
		
		for(int i=0; i<this.hotel.length; i++) {
			if(this.hotel[i].room_available(start,end)) {
				this.hotel[i].change_room_availability(start,end);
				return "Accept";
			}
		}
		
		return "Decline";
	}
}
