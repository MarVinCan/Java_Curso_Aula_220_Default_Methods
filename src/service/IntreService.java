package service;

import java.security.InvalidParameterException;

public interface IntreService {
	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		} else {
			return amount * Math.pow(1.0 + getInterestRate() / 100, months);
		}
	}
}
