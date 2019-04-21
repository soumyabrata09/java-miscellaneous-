/**
 * 
 */
package com.CollectionFramework.Implementation.Resource.mainMethods;

import com.CollectionFramework.Implementation.Resource.Theatre;

/**
 * @author Sam
 *
 */
public class theatreSeatBooking {

	public static void main(String args[]) {
		Theatre theatre = new Theatre("Xion Hinjewadi" , 10, 12);
		theatre.getSeats();
		theatre.reserveSeat("D02");
	}
}
