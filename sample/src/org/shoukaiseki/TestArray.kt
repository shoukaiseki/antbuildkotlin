package org.shoukaiseki;

import com.alibaba.fastjson.JSONObject
import org.shoukaiseki.TreeMenu

import java.util.ArrayList

/**
 */
object TestArray {

    @JvmStatic fun main(args: Array<String>) {
        println("asus")

        val tm = TreeMenu("", "", "")
        val tms = arrayOf<TreeMenu>()
        val tms2 = arrayOf(
                TreeMenu("1c", "23", "sfd"),
                TreeMenu("2c", "23", "sfd"),
                TreeMenu("3c", "23", "sfd"),
                TreeMenu("4c", "23", "sfd")
        )

        tm.addChildren(*getChildren1().toTypedArray())
        tm.addChildren(*getChildren2().toTypedArray())
        tm.addChildren(*tms)
        tm.addChildren(*tms2)
        //        getChildren(null).to
        for (tt in tm.children){
            println(JSONObject.toJSONString(tt))
        }
    }

    internal fun getChildren2(): ArrayList<TreeMenu> {
        var als=ArrayList<TreeMenu>()
        als.add(TreeMenu("1b", "2", "asus"))
        als.add(TreeMenu("2b", "2", "asus"))
        als.add(TreeMenu("3b", "2", "asus"))
        als.add(TreeMenu("4b", "2", "asus"))
        return als
    }

    internal fun getChildren1(): ArrayList<TreeMenu> {
        var als=ArrayList<TreeMenu>()
        als.add(TreeMenu("1a", "2", "asus"))
        als.add(TreeMenu("2a", "2", "asus"))
        als.add(TreeMenu("3a", "2", "asus"))
        als.add(TreeMenu("4a", "2", "asus"))
        return als
    }

}
