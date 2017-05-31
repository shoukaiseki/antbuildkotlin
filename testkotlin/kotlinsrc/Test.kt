import testkotlin.Base


class Test : Base() {
	
	fun test(){
		var paramap=jm.getParameters()
		paramap.put("asus","asus111")
		var obj=Base.getSql("asus",paramap);
		println("obj1s="+obj);
	}
	
}

fun main(args: Array<String>) {
	var test=Test()
	test.test()
}