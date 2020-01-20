package com.smati.flightreservation1.DataTransferObject;

public class ReservationUpdateRequest {

	private Long id;
	private Boolean chechedIn;
	private int NumberOfBags;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getChechedIn() {
		return chechedIn;
	}

	public void setChechedIn(Boolean chechedIn) {
		this.chechedIn = chechedIn;
	}

	public int getNumberOfBags() {
		return NumberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
}
