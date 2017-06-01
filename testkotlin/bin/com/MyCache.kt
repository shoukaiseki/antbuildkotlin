package com

open class MyCache {
	companion object{
		//public static final int TYPE = 2;
		const val TYPE=2
		
		//private static final String NAME = "Name";
		@JvmStatic val NAME = "Name"
		
		//private static String VARNAME;
		@JvmStatic var VARNAME = "VARNAME"
		
		//var 不支持 const
		//public static String ASUS
		@JvmField var ASUS="asus"
		
		//public static String TAG
		@JvmField var TAG:String="opticket"
		
		 @JvmStatic
        fun main(args: Array<String>) {
			println("i am kotlin")
        }
	}
}