package com.cp.onlinemovieticketsystem.service;
import com.cp.onlinemovieticketsystem.dto.Seat;
import com.cp.onlinemovieticketsystem.dto.Show;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsystem.dto.Seat.seatStatusEnum;
import com.cp.onlinemovieticketsystem.Exception.MovieException;
import com.cp.onlinemovieticketsystem.dao.SeatDao;


import java.util.*;
public class SeatService implements SeatServiInterface {
	SeatDao showimpl = new SeatDao();
   public List<Seat> DisplaySeat()
   {
	   List<Seat> list = showimpl.DisplaySeat();
	   return list;
   }
	public Seat blockseat(int block)throws MovieException
	{
		Seat blockseat = showimpl.blockseat(block);
		if(blockseat!=null)
		{
			return blockseat;
		}
		else
		{
			throw new MovieException("wrong input from u");
		}
	}

	
	
	
	public Seat bookseat(int book)throws MovieException
	{
		Seat bookseat = showimpl.bookseat(book);
		if(bookseat!=null)
		{
			return bookseat;
		}
		else
		{
			throw new MovieException("wrong input from User");
		}
	}
	public Seat cancelseat(int cancel)throws MovieException
	{
		Seat cancelseat = showimpl.cancelseat(cancel);
		if(cancelseat!=null)
		{
			return cancelseat;
		}
		else
		{
			throw new MovieException("wrong Id from user");
		}
	}

	
		public List<Ticket> display()
		{
			List<Ticket> showticket = showimpl.display();
			return showticket;
		}
		SeatDao show = new SeatDao();
		public boolean addShowService(Show user)
		{
			SeatDao show = new SeatDao();
		return (show.addShowDao(user));
		}
		
		
		
	public 	List<Show> getShowService()
		{
		return (show.getshow());
		}
	public List<Show> displayList()
	{
		List<Show> showdisplay = show.displayList();
		return showdisplay;
	}
	//public boolean validation(int id)throws MovieException
	//{
//		boolean valid1 = show.validation(id);
		//if(valid1.equals(id)
		//return true;
	//}
	public Show searchMovie(String sear)throws MovieException
	{
		
		Show movie=show.searchMovie(sear);
		if (movie!=null) {
			return movie;
		}
		else {
		 throw new MovieException("No Movie Found");

		}
		
	}
	/*public Enum update()
	{
		Enum s = show.update();
		if(s!=null)
		{
		return s;
		}
		else
		{
			return null;
		}
	}
	*/
	public  Show chooseSeats(int choose)throws MovieException
	{
		Show find1 = show.chooseSeats(choose);
		if(find1!=null)
		{
		return find1;
	}
		
		else
		{
			throw new MovieException("No seats are available to choose your requirement");
		}

	}
	public boolean initiateBooking()
	{
	        //  show.initiateBooking();
		return show.initiateBooking();
	}

	}

