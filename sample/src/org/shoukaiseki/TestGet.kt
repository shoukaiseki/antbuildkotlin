package org.shoukaiseki

class TestGet{


    private var str:String?=null
    get() {
        println("getStr.Execution")
        if(field==null){
            return "str get null"
        }else{
            return  field
        }
    }

    set(value) {
        println("setStr.Execution")
        if(value!=null){
            field=value
        }else{
            field="str set null"
        }
    }

    var str2:String?=null
        get() = field?:"str2 get null"

        set(value) {
            field = value ?: "str2 set null"
        }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("start")
            var tg=TestGet()
            tg.init()
            tg.str="asus"
            tg.str2="asus"
            tg.init()
            tg.str=null
            tg.str2=null
            tg.init()
        }
    }



    fun init(){
        println("TestGet.init")
        println("str="+str)
        println("str2="+str2)
        println()
    }

}

