package com.cp.onlinemovieticketsystem.dao;
import com.cp.onlinemovieticketsystem.dto.Seat;
import com.cp.onlinemovieticketsystem.dto.Show;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsystem.dto.Seat.seatStatusEnum;

import java.util.List;

import com.cp.onlinemovieticketsysstem.util.SeatRepository;
import com.cp.onlinemovieticketsysstem.util.ShowRepository;

public interface SeatDaoInterface {
	public 	List<Seat> getSeat();
	public List<Seat> DisplaySeat();
	public Seat blockseat(int block);
	public List<Ticket> display();
	public Seat bookseat(int book);
	public Seat cancelseat(int cancel);
	public boolean addShowDao(Show show);
	public List<Show> displayList();
	public Show searchMovie(String sear);
	public Show chooseSeats(int choose);
	public boolean  initiateBooking();







}
