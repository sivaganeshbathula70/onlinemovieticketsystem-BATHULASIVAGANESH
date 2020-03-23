package com.cp.onlinemovieticketsystem.dto;
import com.cp.onlinemovieticketsystem.dto.Seat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class Show  {
	int showId;
	LocalTime showStartTime;
	LocalTime showEndTime;
	Seat seats;
	String showName;
	String movie;
	int ScreenId;
	int theaterId;
	
	
	
	public Show(int showId, LocalTime showStartTime, LocalTime showEndTime, Seat seats, String showName, String movie,
			int screenId, int theaterId) {
		super();
		this.showId = showId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seats = seats;
		this.showName = showName;
		this.movie = movie;
		ScreenId = screenId;
		this.theaterId = theaterId;
	
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public Seat getSeats() {
		return seats;
	}
	public void setSeats(Seat seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public int getScreenId() {
		return ScreenId;
	}
	public void setScreenId(int screenId) {
		ScreenId = screenId;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	@Override
	public String toString() {
		return "Show [showId=" + showId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", seats=" + seats + ", showName=" + showName + ", movie=" + movie + ", ScreenId=" + ScreenId
				+ ", theaterId=" + theaterId + "]";
	
	
	}
	
	

}
