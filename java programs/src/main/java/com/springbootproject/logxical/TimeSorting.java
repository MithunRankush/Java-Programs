package com.logxical;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TimeSorting {

	public static void main(String[] args) {
		String[] times = { "03:00 PM", "11:50 AM", "06:45 PM", "03:35 AM" };

		SimpleDateFormat format = new SimpleDateFormat("hh:mm a");

		try {
			Date[] date = new Date[times.length];
			for (int i = 0; i < times.length; i++) {
				date[i] = format.parse(times[i]);
			}
			Arrays.sort(date);
			for (Date d : date) {
				System.out.println(format.format(d));
			}

		} catch (ParseException e) {
			e.getStackTrace();
		}

	}

}
