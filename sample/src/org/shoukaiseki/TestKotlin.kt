package org.shoukaiseki

class TestKotlin 	{

	companion  object {

		fun getThis():TestKotlin?{
			if(1==1){
				return TestKotlin()
			}else{
				return null
			}
		}

	}

	fun asus1(){
		println("asus1")
	}

	fun asus2(){
		println("asus2")
	}
}
	fun asus(){
		println("Hello")
	}

    fun asus2() {
		var a:String? = null
        a="valueb"
		var b = a ?: return
        println("b=$b")

    }

	fun main(args: Array<String>) {
        /**
		asus()
		asus2()

		var aas=TTTTSSA()
		aas.asuss();
		**/

        var tk:TestKotlin?=null
		tk= TestKotlin.getThis()
		tk?.let {
			tk!!.asus1()
			tk!!.asus2()
		}
        if(tk!=null){
			tk.asus1()
			tk.asus2()
		}else{
			println("tk is null")
		}
		println("tk is null")
	}