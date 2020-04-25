package com.github.antoniolike.thefantasy.tools;

public abstract class PrimitivesOperations {
	
	public static byte maxByteValue(){
		return Byte.MAX_VALUE;
	}
	public static short maxShortValue(){
		return Short.MAX_VALUE;
	}
	public static int maxIntValue(){
		return Integer.MAX_VALUE;
	}
	public static long maxLongValue(){
		return Long.MAX_VALUE;
	}
	public static float maxFloatValue(){
		return Float.MAX_VALUE;
	}
	public static double maxDoubleValue(){
		return Double.MAX_VALUE;
	}
	public static char maxCharValue(){
		return Character.MAX_VALUE;
	}
	public static boolean maxBooleanValue(){
		return true;
	}
	public static int safeDivision(int a, int b) {
		return b==0?0:a/b;
	}
}
