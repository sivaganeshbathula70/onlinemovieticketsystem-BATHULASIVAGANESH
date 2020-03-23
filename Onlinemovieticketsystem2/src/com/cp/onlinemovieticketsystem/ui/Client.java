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
		Scanner sc = new Scanner(System.in);
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
		
		choice = sc.nextInt();


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
				String	search = sc.next();
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
				int newOption = sc.nextInt();
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
				int block = sc.nextInt();
			
				
				
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
				int	book = sc.nextInt();
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
					int cancel = sc.nextInt();
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
			int choose = sc.nextInt();
			
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
		
	
/*		
		
		System.out.println("Enter the movie name");
	String	sd = sc.nextLine();
	ShowService showservice = new ShowService();
	try
	{
		Show sb=showservice.searchMovie(sd);	
		System.out.println(sb);
	}catch(ShowException e)
	{
		e.printLog();
	}
	System.out.println("Enter the seat Id u want to block");
	int a = sc.nextInt();
	SeatService servi = new SeatService();
	
	Seat sdU =servi.BlockSeatId(a);
	System.out.println(sdU);
	
	*/
	//sb.toString();
	//System.out.println(sb);

		
		//ShowService showserviceu = new ShowService();
		//Show sho = new Show();
	
	//	sho.setMovie("sarilerunekuavaru");
	//	sho.setScreenId(7458914);
	//	sho.setSeats("A to Z");
	//	sho.setShowStartTime(34567L);
	//	sho.setShowEndTime(2017-12-12-4L);
	//	sho.setShowId(41258);
		//sho.setTheaterId(879);
		//if(showservice.addShowService(sho))
		//{
		//	System.out.println("show1 added successfull");
		//}
		//else
		//{
		//	System.out.println("Show not found");
		//}
	//Show sho1 = new Show();
	//sho1.setMovie("Darbar");
	//sho1.setScreenId(74896512);
	//sho1.setSeats("A to k");
	//sho1.setShowStartTime(2017-12-12-8L);
	//sho1.setShowEndTime(2017-12L);
	//sho1.setShowId(789564);
	//sho1.setTheaterId(784);
	//if(showservice.addShowService(sho1))
	//{
	//	System.out.println("show 2 added successfully");
	//}
	//else
	//{
	//	System.out.println("show not found");
	//}
//	List<Show>showdata = showservice.getShowService();
	
//	for(Show obu:showdata)
	//{
	//	System.out.println(obu.getMovie());
	//System.out.println(obu.getScreenId());
	//	System.out.println(obu.getSeats());
	//	System.out.println(obu.getShowStartTime());
		//System.out.println(obu.getShowEndTime());
		//System.out.println(obu.getShowId());
	//System.out.println(obu.getTheaterId());
	//}
	
//showservice.searchMovie();

	
/*
	
	CeatService ceatservice = new CeatService();
	Ceat ceat = new Ceat();
	ceat.setSeatId(7412548);
	ceat.setSeatStatus(null);
	ceat.setSeatPrice(150.0);
  if(ceatservice.addCeatService(ceat))
  {
	  System.out.println("Ceat deatails available for this show ");
  }
  else
  {
	  System.out.println("ceat are not found");
  }
	Ceat ceat1 = new Ceat();
	ceat1.setSeatId(87);
	ceat1.setSeatStatus(null);
	ceat1.setSeatPrice(200.8);
	if(ceatservice.addCeatService(ceat))
	{
		System.out.println("ceat deatails are available");
		
	}
	else
	{
	System.out.println("ceats are not available");
	} */


