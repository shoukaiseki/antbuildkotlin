package org.shoukaiseki


/** org.shoukaiseki.TestParas <br>
 * java 没法调用这种默认参数形式的方法
 * @author 蒋カイセキ    Japan-Tokyo  2017-08-17 15:02:04<br>
 * ブログ http://shoukaiseki.blog.163.com/<br>
 * E-メール jiang28555@Gmail.com<br>
 **/

class TestParas(var name:String="asus",var age:Int=10){


    fun setParaClass(endClazz:Class<*> = TestParas::class.java){
        println(endClazz)
    }

    fun setParaName(name:String="asus.para"){
        this.name=name
    }

    /**
     * 新版本kotlin需要加 @JvmOverloads 才能使用setParaTest2(name)
     */
    @JvmOverloads
    fun setParaTest2(name:String,displayname:String="姓名"){
        println("name=$name,displayname=$displayname")
    }

     fun println() {
        println("name=$name,age=$age")
    }
}

fun main(args: Array<String>) {
    var tp=TestParas()
    tp.println()
    tp=TestParas("linux")
    tp.println()
    tp=TestParas("fedora",14)
    tp.println()

    tp.setParaName()
    tp.println()

    tp.setParaClass()
    tp.setParaClass(StringBuffer::class.java)

    tp.setParaTest2("linux")
    tp.setParaTest2("linux","理你哭死")

}
