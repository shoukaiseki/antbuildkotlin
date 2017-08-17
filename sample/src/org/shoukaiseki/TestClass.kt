package org.shoukaiseki

import com.alibaba.fastjson.JSONObject
import java.lang.reflect.AnnotatedParameterizedType
import java.lang.reflect.AnnotatedType
import java.lang.reflect.Field
import java.util.*
import java.lang.reflect.ParameterizedType
import kotlin.collections.HashMap


/**
 */
class TestClass{
    var asus:List<TestParas>? = null
    var linux:HashMap<String,TestParas>? = null
    var fedora:HashMap<*,*>?=null

}

fun main(args: Array<String>) {

    var clsSup: Class<*> = TestClass::class.java
    val fields = arrayListOf<Field>()
    fields.addAll(Arrays.asList(*clsSup.declaredFields))
    fields.addAll(Arrays.asList(*clsSup.fields))
    for (fi in fields) {
        var name = fi.name
        val typeName = fi.type.name
        println("name=$name,typeName=$typeName")
        /**
        for(tv in fi.type.typeParameters){
            println("tv=$tv")
            for (bd in tv.bounds){
                println("tv.bounds=${bd}")
            }
        }
         *
         */

        printGenericType(fi)

    }

    var asusfi=clsSup.getDeclaredField("asus")
    println("asusfi=${asusfi}")
    println("asusfi=${JSONObject.toJSONString(asusfi)}")
    println("asusfi.type=${asusfi.annotatedType.type}")
    println("asusfi.annotatedType.type.typeName=${asusfi.annotatedType.type.typeName}")
    printGenericType(asusfi)
    printAnnotatedType(asusfi)

    asusfi=clsSup.getDeclaredField("linux")
    println("asusfi=${asusfi}")
    println("asusfi=${JSONObject.toJSONString(asusfi)}")
    printGenericType(asusfi)
    printAnnotatedType(asusfi)

    asusfi=clsSup.getDeclaredField("fedora")
    println("asusfi=${asusfi}")
    println("asusfi=${JSONObject.toJSONString(asusfi)}")
    printGenericType(asusfi)
    printAnnotatedType(asusfi)
    /**
     */

}

fun printAnnotatedType(fi:Field){
    println("AnnotatedType")
    val gType = fi.annotatedType
    println("gType.class=${gType.javaClass}")
    if(gType is AnnotatedParameterizedType){
        // 强制类型转换
        // 获取原始类型
        for (aata in gType.annotatedActualTypeArguments){
            println("泛型类型=${aata.type}[${aata.type.typeName}]")
        }


    }

}

fun printGenericType(fi:Field){
    println("GenericType")
    val gType = fi.genericType
    if(gType is ParameterizedType){
        // 强制类型转换
        // 获取原始类型
        val rType = gType.rawType
        println("原始类型是：" + rType)
        // 取得泛型类型的泛型参数
        val tArgs = gType.actualTypeArguments
        println("泛型信息是:")
        for (i in tArgs.indices) {
            println("第" + i + "个泛型类型是：" + tArgs[i])
        }
    }else{
        System.out.println("获取泛型类型出错！");
    }
}
