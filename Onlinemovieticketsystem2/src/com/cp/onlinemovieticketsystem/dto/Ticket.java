package com.cp.onlinemovieticketsystem.dto;



public class Ticket {
	
	private int ticketId;
	int noOfSeats;
	String SeatName;
	String BookingReference;
	boolean ticketstatus;
	String ScreenName;
	//public Ticket(int ticketId,int noOfSeats,String SeatName,String BookingReference,boolean ticketstatus,String ScreenName)
	//{
	//	
	//
	//}
	
	

//	public Ticket(int ticketId2, int noOfSeats2, String seatName2, String bookingReference2, boolean ticketstatus2,
	//		String screenName2) {
		// TODO Auto-generated constructor stub
	//}



	public int getTicketId() {
		return ticketId;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", noOfSeats=" + noOfSeats + ", SeatName=" + SeatName
				+ ", BookingReference=" + BookingReference + ", ticketstatus=" + ticketstatus + ", ScreenName="
				+ ScreenName + "]";
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getSeatName() {
		return SeatName;
	}
	public void setSeatName(String seatName) {
		SeatName = seatName;
	}
	public String getBookingReference() {
		return BookingReference;
	}
	public void setBookingReference(String bookingReference) {
		BookingReference = bookingReference;
	}
	public boolean isTicketstatus() {
		return ticketstatus;
	}
	public void setTicketstatus(boolean ticketstatus) {
		this.ticketstatus = ticketstatus;
	}
	public String getScreenName() {
		return ScreenName;
	}
	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}
	

}



