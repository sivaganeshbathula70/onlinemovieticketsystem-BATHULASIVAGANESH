package com.cp.onlinemovieticketsysstem.util;
import com.cp.onlinemovieticketsystem.dto.Seat;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsystem.dto.Seat.seatStatusEnum;
import java.util.*;
import com.cp.onlinemovieticketsystem.dto.Ticket;
import com.cp.onlinemovieticketsystem.dto.*;
import com.cp.onlinemovieticketsystem.dto.Ticket;

import java.util.ArrayList;
import java.util.List;
import com.cp.onlinemovieticketsystem.dto.Seat;


public class SeatRepository {
private static 	List<Seat> seatList = new ArrayList<Seat>();
	//seatList.add(1);
	
	List<Integer>list2 = new ArrayList<Integer>();
	public List<Seat> getSeat()
	{
		return seatList;
	}
	public void  setSeat(List<Seat> seatList)
	
	{
	 this.seatList = seatList;
	}
	
	private static List<Ticket>listTicket  = new ArrayList<Ticket>();

	public List<Ticket> getTicket() {
		return listTicket;
	}

	public void setTicket(List<Ticket> listTicket) {
		this.listTicket = listTicket;
	}
	public SeatRepository()
	{
		
		
	
		Ticket ticket = new Ticket();
		ticket.setScreenName("Hari");
		ticket.setBookingReference("MahaSivarathri2020offfersponseredbycapgemini");
		ticket.setNoOfSeats(100);
		ticket.setSeatName("Anasuya");
		ticket.setTicketId(7);
		ticket.setTicketstatus(true);
		listTicket.add(ticket);

	}

	



	
static
{
	Seat Repository = new Seat(1,seatStatusEnum.valueOf("Available"),100.0);
	seatList.add(Repository);
	Seat Repository1 = new Seat(2,seatStatusEnum.valueOf("Available"),250.0);
	seatList.add(Repository1);
	Seat Repository2 = new Seat(3,seatStatusEnum.valueOf("Available"),150.0);
	seatList.add(Repository2);
	Seat Repository3 = new Seat(4,seatStatusEnum.valueOf("Available"),280.0);
	seatList.add(Repository3);
	Seat Repository4 = new Seat(5,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository5 = new Seat(6,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository6 = new Seat(7,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository7 = new Seat(8,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository8 = new Seat(9,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository9 = new Seat(10,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository10 = new Seat(11,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository11= new Seat(12,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository12= new Seat(13,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository13= new Seat(14,seatStatusEnum.valueOf("Available"),280.0);
	
	Seat Repository14= new Seat(15,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository15 = new Seat(16,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository16 = new Seat(17,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository17 = new Seat(18,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository18 = new Seat(19,seatStatusEnum.valueOf("Available"),280.0);
	
	Seat Repository19 = new Seat(20,seatStatusEnum.valueOf("Available"),280.0);

	Seat Repository20 = new Seat(21,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository21 = new Seat(22,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository22 = new Seat(23,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository23 = new Seat(24,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository24 = new Seat(25,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository25 = new Seat(26,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository26 = new Seat(27,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository27 = new Seat(28,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository28 = new Seat(29,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository29 = new Seat(30,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository30 = new Seat(31,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository31 = new Seat(32,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository32= new Seat(33,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository33= new Seat(34,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository34= new Seat(35,seatStatusEnum.valueOf("Available"),280.0);
	
	Seat Repository35= new Seat(36,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository36 = new Seat(37,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository37 = new Seat(38,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository38 = new Seat(39,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository39 = new Seat(40,seatStatusEnum.valueOf("Available"),280.0);
	
	Seat Repository40 = new Seat(41,seatStatusEnum.valueOf("Available"),280.0);

	Seat Repository41 = new Seat(42,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository42 = new Seat(43,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository43 = new Seat(44,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository44 = new Seat(45,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository45 = new Seat(46,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository46 = new Seat(47,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository47 = new Seat(48,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository48 = new Seat(49,seatStatusEnum.valueOf("Available"),280.0);
	
	Seat Repository49 = new Seat(50,seatStatusEnum.valueOf("Available"),280.0);
	Seat Repository50 = new Seat(51,seatStatusEnum.valueOf("Available"),280.0);
	
seatList.add(Repository5);
seatList.add(Repository6);
seatList.add(Repository7);
seatList.add(Repository8);
seatList.add(Repository9);
seatList.add(Repository10);
seatList.add(Repository11);
seatList.add(Repository12);
seatList.add(Repository13);
seatList.add(Repository14);
seatList.add(Repository15);
seatList.add(Repository16);
seatList.add(Repository17);
seatList.add(Repository18);
seatList.add(Repository19);
seatList.add(Repository20);
seatList.add(Repository21);
seatList.add(Repository22);
seatList.add(Repository23);
seatList.add(Repository24);
seatList.add(Repository25);
seatList.add(Repository26);
seatList.add(Repository27);
seatList.add(Repository28);
seatList.add(Repository29);
seatList.add(Repository30);
seatList.add(Repository31);
seatList.add(Repository32);
seatList.add(Repository33);
seatList.add(Repository34);
seatList.add(Repository35);
seatList.add(Repository36);
seatList.add(Repository37);
seatList.add(Repository38);
seatList.add(Repository39);
seatList.add(Repository40);
seatList.add(Repository41);
seatList.add(Repository42);
seatList.add(Repository43);
seatList.add(Repository43);
seatList.add(Repository44);
seatList.add(Repository45);
seatList.add(Repository46);
seatList.add(Repository47);
seatList.add(Repository48);
seatList.add(Repository48);
seatList.add(Repository49);
seatList.add(Repository50);



	
}







}
	
		
		
	
	


