package com.zzm.kotlin

/**
 * Created by ZhongZiMing on 2017/9/27.
 */

object KotlinStringUtils {


    /**
     * 遍历map集合输出key和value
     * @param map
     */
    fun parseMap(map: Map<*, *>): String {

        //字符串赋值，第一个必须指定为String类型

        var str = ""
        for((k,v) in map){
            str = str + k + "=" + v + "\n"
        }
        return str
    }



}
