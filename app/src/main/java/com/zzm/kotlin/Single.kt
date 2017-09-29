package com.zzm.kotlin

/**
 * Created by ZhongZiMing on 2017/9/28.
 */
/**
 * 单例模式，一个object就行了
 */
object Single{

    /**
     * 变量
     */
    var obj = "singleObject"

    /**
     * 常量
     */
    val OBJ = "单例模式"

    /**
     * 单例方法
     */
    fun objFun() : String{
        Utils.log(OBJ, "这是一个单例的方法，传两个参数")
        Utils.log(message = "这是一个单例的方法，只传一个参数")
        return "调用单例方法打印log"
    }


}