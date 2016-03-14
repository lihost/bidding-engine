package com.apg.bidding;

import java.text.SimpleDateFormat;

public class Util {

	public static final String DATE_FORMAT = "dd-MM-yyyy'T'HH:mm";
	
	public static SimpleDateFormat getDateFormat() {
		return new SimpleDateFormat(DATE_FORMAT);
	}
}
