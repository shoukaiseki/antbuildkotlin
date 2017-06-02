package com.map

import testkotlin.map.BaseMap

class TestMap {
	
}

fun main(args: Array<String>) {
	var map=BaseMap()
	map.init()
	for(data in map.getData()){
		println("key="+data.key)
		println("value="+data.value)
	}

}