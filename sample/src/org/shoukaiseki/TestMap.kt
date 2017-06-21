package org.shoukaiseki

object  TestMap{
    @JvmStatic fun main(args: Array<String>) {
        val map = hashMapOf<String, Int>()
        map.put("one", 1)
        map.put("two", 2)
        map["three"]=3

        for ((key, value) in map) {
            println("houhou1:key = $key, value = $value")
        }

        for(keyvalue in map){
            println("houhou2:key = ${keyvalue.key}, value = ${keyvalue.value}")
        }

    }

}

