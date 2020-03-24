package com.cp.onlinemovieticketsystem.dao;
import com.cp.onlinemovieticketsystem.dto.Seat;
import com.cp.onlinemovieticketsystem.dto.Show;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsystem.dto.Seat.seatStatusEnum;
import com.cp.onlinemovieticketsysstem.util.SeatRepository;
import com.cp.onlinemovieticketsysstem.util.ShowRepository;

import com.cp.onlinemovieticketsystem.dto.Ticket;

import java.util.List;
import java.util.ArrayList;


import java.util.List;
import java.util.ArrayList;
public class SeatDao implements SeatDaoInterface {
	SeatRepository seatRepo = new SeatRepository();
	
	public 	List<Seat> getSeat()
	{
		
		return seatRepo.getSeat();
	}
	public List<Seat> DisplaySeat()
	{
		List<Seat>seatList = seatRepo.getSeat();
		
		return seatList;
	}
	public Seat blockseat(int block)
	{
		List<Seat>seatList = seatRepo.getSeat();
		for(Seat seatblock:seatList)
		{
			//Enum seatStatusEnum;
			if(seatblock.getSeatId()==block)
			{
				//List<Seat> seatList=seatRepo.getSeat();
				//return s;
				
				
		 	//s.setSeatStatus(seatStatusEnum.valueOf("Available"));
		 	seatblock.setSeatStatus(seatStatusEnum.valueOf("Blocked"));
		 	return seatblock;
			}
		}return null;
	}

	
	
	
	
	public Seat bookseat(int book)
	{
		List<Seat>seatList = seatRepo.getSeat();
		for(Seat bookseat:seatList)
		if(bookseat.getSeatId()==book)
		{
			//return  k;
			bookseat.setSeatStatus(seatStatusEnum.valueOf("Blocked"));
return bookseat;
			
		}
		return null;
	}
	
	
	public Seat cancelseat(int cancel)
	{
		List<Seat>seatList = seatRepo.getSeat();
		for(Seat cancelseat:seatList)
		{
			if(cancelseat.getSeatId()==cancel)
			{
				cancelseat.setSeatStatus(seatStatusEnum.valueOf("Available"));
				return cancelseat;
			}
			
		}
		return null;
	}
	 public SeatRepository ticket = new SeatRepository();

		public SeatRepository getTicket() {
			return ticket;
		}

		public void setTicket(SeatRepository ticket) {
			this.ticket = ticket;
		}
		public List<Ticket> display()
		{
			List<Ticket>listTicket = ticket.getTicket();
			return listTicket;
		}
		ShowRepository showRepo = new ShowRepository();
		//SeatRepository seatRepo = new SeatRepository();
		//ShowRepository obj=new ShowRepository();
			
			
		public boolean addShowDao(Show show)
			{
				 showRepo.getShow().add(show);
				return true;
			}

			public 	List<Show> getshow()
			{
				return showRepo.getShow();
				
			}

			public List<Show> displayList()
			{
				
				List<Show>showList = showRepo.getShow();
				return showList;
				
			}
			
			public Show searchMovie(String sear)
			
			{	
				List<Show> showList=showRepo.getShow();
				//<Show> sq=showList.stream().filter(s->s.getMovie().equalsIgnoreCase(sd));
				for(Show showsearch:showList)
				{
					
					
					
					if(showsearch.getMovie().contentEquals(sear))
					{
						return showsearch;
						
					}
				}
				return null;
			}
//			public Enum update()
			//{
			//	List<Show>List3 = showRepo.getShow();
			//	for(Show u:List3)
				//{
			//Enum sd = u.getSeats().getSeatStatus();
				//	return sd;
				//}
				//return null;
			//}
			public Show chooseSeats(int choose)
			{
				List<Show>showList4 = showRepo.getShow();
				for(Show find:showList4)
				{
					if(find.getSeats().getSeatId()==choose)
					{
						return find;
					}
				}
				return null;
			}
			
			public boolean  initiateBooking()
			{
				showRepo.getShow();
				return true;
			}
				
		}

	
	
