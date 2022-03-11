package com.lq.inh.exception;

public class SpeedOutOfRangeException extends Exception{
		@Override
		public String getMessage() { 
			return "I AM THE MESSAGE";
		}
}
