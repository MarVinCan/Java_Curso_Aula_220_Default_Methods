package service;

public class BrazilInterstService implements IntreService {
	private Double interestRate;

	public BrazilInterstService(Double interestRate) {
		this.interestRate = interestRate;
	}
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	

}
