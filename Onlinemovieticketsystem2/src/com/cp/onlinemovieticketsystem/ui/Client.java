package com.cp.onlinemovieticketsystem.ui;
import java.util.*;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsysstem.util.*;
import com.cp.onlinemovieticketsystem.dto.Seat;
import com.cp.onlinemovieticketsystem.Exception.MovieException;
import com.cp.onlinemovieticketsystem.dao.SeatDao;
import com.cp.onlinemovieticketsystem.service.SeatService;
import com.cp.onlinemovieticketsystem.dto.Show;

import java.util.*;

import com.cp.onlinemovieticketsystem.service.SeatService;
public class Client {
	
	public static void main(String args[])
	 {
		SeatService seatservice = new SeatService();
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		System.out.println("Enter choice");
				
		while(true)
		{
		System.out.println("....................Hello Welcome to siva ......................................");
		
		
		
		System.out.println("Enter 1 for Displaying List");
		System.out.println("Enter 2 for Searching Movie ");
		System.out.println("Enter 3 for seat status -> get in inside siva");
		System.out.println("Enter 4 for Ticket");
		System.out.println("Enter 5 for choosing seats");
		System.out.println("Enter 6 for initating Booking");
		System.out.println("Enter 7 for Exit");
		
		choice = scanner.nextInt();


		switch(choice)
		{
		case 1:
		{
			List<Show> complete = seatservice.displayList();
			for(Show showcomplete:complete)
			System.out.println(showcomplete);
		}
		
		break;
		
		case 2:
		
		
		{
		while(true)
		{
			System.out.println("Enter the movie name");
			
			
			try
			{
				String	search = scanner.next();
				Show showclient=seatservice.searchMovie(search);	
				System.out.println(showclient);
				break;
			}catch(MovieException exception)
			{
				System.out.println(exception.getMessage());
				//e.printLog();
			}
		
		}
		}
		
		
		break;
		
			case 3:
			{
				while(true)
				{
				System.out.println("****************************Welcome to U*******************************************");
								
				System.out.println("Enter your choice");
				System.out.println("Enter 1 for seat Display");
				System.out.println("Enter option 2 for seat Blocking");
				System.out.println("Enter 3 for seat Booking");
				System.out.println("Enter 4 for seat cancel");
				System.out.println("Enter the seats u want to block");
				int newOption = scanner.nextInt();
				switch(newOption)
				{
				case 1:
				{
					SeatService service = new SeatService();
					List<Seat> list1= service.DisplaySeat();
				    for(Seat seat:list1)
				    {
				    	
				    System.out.println(seat.getSeatId()+" "+seat.getSeatStatus()+" "+seat.getSeatPrice());
				    	
				    	
				    	
				    	
				    	
				    }
				}
				break;
				case 2:
				{
				{
					
					SeatService service = new SeatService();
										
				System.out.println("Enter the SeatId U want Block");
				try
				{
				int block = scanner.nextInt();
			
				
				
				Seat seatblock =service.blockseat(block);
				System.out.println(seatblock);
				
				
				}
				
				catch(MovieException exception)
				{
					//e.printLog();
					System.out.println(exception.getMessage());
				}
				}
				}
			break;	
				case 3:
				{
					System.out.println("Enter seat U want to Book");
					try
					{
				int	book = scanner.nextInt();
				SeatService sestservice = new SeatService();
				Seat seatbooking = sestservice.bookseat(book);
				System.out.println(seatbooking);
				}
					catch(MovieException exception)
					{
						System.out.println(exception.getMessage());
						//e.printLog();
					}
					}
					
						break;
				case 4:
				{
					System.out.println("Enter seat U want to cancel");
					try
					{
					int cancel = scanner.nextInt();
					SeatService seatcancel = new SeatService();
					Seat seatcancel1 = seatcancel.cancelseat(cancel);
					System.out.println(seatcancel1);
				}
					catch(MovieException exception)
					{
						System.out.println(exception.getMessage());
						//e.printLog();
					}
					}
				//break;
				
				}
				
					break;
				}
				}
			break;
			case 4:
			{
				System.out.println("ticket");
				SeatService sd = new SeatService();
				List<Ticket> list = sd.display();
				System.out.println(list);
				
			}
			break;
		
		
		case 5:
		{
			System.out.println("Enter the Id of seatId to choose");
			try
			{
			int choose = scanner.nextInt();
			
			Show showchoosing = seatservice.chooseSeats(choose);
			System.out.println("Enter the seat Id you want to choose");
			System.out.println(showchoosing);
		}
			catch(MovieException exception)
			{
				System.out.println(exception.getMessage());
				//e.printLog();
			}
		}
	break;
		case 6:
		{
			//System.exit(0);
			boolean initatebooking = seatservice.initiateBooking();
			System.out.println("Booking is initated ");
			System.out.println(initatebooking);
		}
		break;
		case 7:
		{
			System.exit(0);
		}
		
		}
}
	}
		}
		
