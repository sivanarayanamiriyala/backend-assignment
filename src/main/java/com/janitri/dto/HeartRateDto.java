package com.janitri.dto;

import lombok.Data;

@Data
public class HeartRateDto {
    private int rate;

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
}
