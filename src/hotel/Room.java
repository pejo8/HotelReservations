package hotel;

import java.util.Arrays;

public class Room {
	
	private Boolean[] stay;

	public Room() {
		this.stay = new Boolean[365];
		Arrays.fill(this.stay, true);
	}
	
	public Boolean room_available(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(!this.stay[i])
				return false;
		}
		return true;
	}
	
	public void change_room_availability(int start, int end) {
		for(int i=start; i<=end; i++) {
			this.stay[i] = false;
		}
	}
	
	public int first_left_end(int new_start) {
		for(int i=new_start; i>=0; i--) {
			if(!this.stay[i])
				return i;
		}
		return 0;
	}
}
