package com.cp.onlinemovieticketsystem.service;
import com.cp.onlinemovieticketsystem.dto.Seat;
import com.cp.onlinemovieticketsystem.dto.Show;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsystem.dto.Seat.seatStatusEnum;

import java.util.List;

import com.cp.onlinemovieticketsystem.Exception.MovieException;
import com.cp.onlinemovieticketsystem.dao.SeatDao;


public interface SeatServiInterface {
	
	public List<Seat> DisplaySeat();
	public Seat bookseat(int book)throws MovieException;
	public Seat blockseat(int block)throws MovieException;
	public Seat cancelseat(int cancel)throws MovieException;
	public List<Ticket> display();
	public List<Show> displayList();
	public 	List<Show> getShowService();
	public Show searchMovie(String sear)throws MovieException;
	public  Show chooseSeats(int choose)throws MovieException;
	public boolean initiateBooking();



}
