package com.buildsupply.stats.model;

import java.math.BigDecimal;

public class Stats {

	private long count;
	
	private BigDecimal max;
	
	private BigDecimal min;
	
	private BigDecimal sum;
	
	private double avg;

	public Stats() {
		
	}
	
	public Stats(Long count, BigDecimal max, BigDecimal min, BigDecimal sum, Double avg) {
		super();
		this.count = count != null ? count : 0;
		this.max = max != null ? max : BigDecimal.ZERO;
		this.min = min != null ? min : BigDecimal.ZERO;
		this.sum = sum != null ? sum : BigDecimal.ZERO;
		this.avg = avg != null ? avg : 0;
	}
	
	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public BigDecimal getMax() {
		return max;
	}

	public void setMax(BigDecimal max) {
		this.max = max;
	}

	public BigDecimal getMin() {
		return min;
	}

	public void setMin(BigDecimal min) {
		this.min = min;
	}

	public BigDecimal getSum() {
		return sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
