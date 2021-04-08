package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeatTest {

	@Test
	public void testSeat() {
		Seat testSeat1 = new Seat();
		assertEquals(10,testSeat1.getSeatNumber());
	}
	
	public void testSetSeatNumber() {
		Seat testSeat2 = new Seat();
		testSeat2.setSeatNumber(2);
		assertEquals(2,testSeat2.getSeatNumber());
	}

}
