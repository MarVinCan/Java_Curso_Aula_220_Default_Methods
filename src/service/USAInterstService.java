package service;

public class USAInterstService implements IntreService {
	private Double interestRate;

	public USAInterstService(Double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
