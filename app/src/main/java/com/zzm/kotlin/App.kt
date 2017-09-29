package com.zzm.kotlin

import android.app.Application

/**
 * Created by ZhongZiMing on 2017/9/26.
 */
class App : Application() {

    /**
     * 伴生类，作用相当于static
     */
    companion object {
        // lateinit 延迟加载，在被赋值的时候加载
        lateinit var application : App
    }

    override fun onCreate() {
        super.onCreate()
        application = this
    }

}