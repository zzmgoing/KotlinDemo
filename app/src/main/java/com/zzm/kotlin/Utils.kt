package com.zzm.kotlin

import android.util.Log
import android.widget.Toast

/**
 * Created by ZhongZiMing on 2017/9/26.
 */
class Utils{

    /**
     * 伴生对象
     * Kotlin中没有static静态
     * Java类中在其被加载的时候，静态的变量已经初始化了
     * Kotlin中则是分为实例变量和静态变量两类，Kotlin会将静态的变量及方法打包在一个伴生类中，即companion
     */
    companion object {
        /**
         * 吐司提示
         * toast("")
         * toast("",Toast.LENGTH_SHORT)
         * 默认值可以不传，减少了方法的重载
         */
        fun toast(msg: String,length: Int = Toast.LENGTH_SHORT){
            Toast.makeText(App.application,msg,length).show()
        }

        fun log(tag: String = "ZZM",message: String){
            Log.d(tag,message)
        }

    }


}