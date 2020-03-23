package com.cp.onlinemovieticketsysstem.util;
import com.cp.onlinemovieticketsystem.dto.Seat;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.cp.onlinemovieticketsystem.dto.Show;
import com.cp.onlinemovieticketsystem.dto.Seat.seatStatusEnum;

public class ShowRepository {
	private static List<Show>showList =new ArrayList<Show>();

	public List<Show> getShow() {
		return showList;
	}

	public void setShow(List<Show> show) {
		this.showList = show;
	}
	
	
static
{
	Show repository = new Show(1,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","sarilerunekuavaru",1,25);
	showList.add(repository);
	Show repository1 = new Show(2,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(1,seatStatusEnum.valueOf("Available"),100.0),"Sarsavathi","Darbar",2,25);
	Show repository2 = new Show(75,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(3,seatStatusEnum.valueOf("Available"),100.0),"Hrror","Super",3,25);
	showList.add(repository1);
	showList.add(repository2);
	Show repository3 = new Show(1,LocalTime.parse("12:15",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","1",4,25);
showList.add(repository3);
Show repository4 = new Show(1,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","24",5,25);
showList.add(repository4);
Show repository5 = new Show(1,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","Hello",7,25);
showList.add(repository5);
Show repository7 = new Show(1,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","U",8,25);
showList.add(repository7);
Show repository8 = new Show(1,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","Aswathma",9,25);
showList.add(repository8);
Show repository10 = new Show(1,LocalTime.parse("12:10",DateTimeFormatter.ofPattern("HH:mm")),LocalTime.parse("03:10",DateTimeFormatter.ofPattern("HH:mm")),new Seat(123,seatStatusEnum.valueOf("Available"),100.0),"Harihara","2.0",10,25);
showList.add(repository10);

}




}

