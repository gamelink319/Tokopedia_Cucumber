package DriverStrategy;

import Utils.Constans;

public class DriverStrategyImplementer {
	
	public static DriverStrategy choosesStrategy(String strategy) {
		switch(strategy) {
		case Constans.CHROME:
			return new Chrome();
		case Constans.FIREFOX:
			return new Firefox();
		default:
			return null;
			
		}
	}

}
