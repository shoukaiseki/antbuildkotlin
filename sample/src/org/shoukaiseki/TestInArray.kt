
/**
 */
object TestInArray {


    @JvmStatic fun main(args: Array<String>) {
        var a:Array<*> = arrayOf<String>()
        //kotlin 判断 是不是数组
        //Array  Cannot check for instance of erased type
        // a instanceof String[]
        if(a.isArrayOf<String>()){
            println("is String=true")
        } else {
            println("is String=false")
        }
        a=arrayOf<Any>()
        if(a.isArrayOf<String>()){
            println("Any is String=true")
        } else {
            println("Any is String=false")
        }
    }

}
