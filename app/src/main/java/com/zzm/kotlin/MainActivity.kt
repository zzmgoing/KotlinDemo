package com.zzm.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * 1. 摆脱findViewById，减少30%代码量
     * 2. 摆脱Getter() Setter()，减少10%代码量
     * 3. lambda 表达式，随处可用，减少样板代码量
     * 4. 语法更简洁，上手快，例如map集合的遍历等
     * 5. 空指针安全，告别NullPointerException
     * 6. java和kotlin 互相调用，耦合性100%
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }


    fun initView(){

        tv_log.text = "我是测试文本"

        // lamda表达式 当只有一个参数的时候可以不写,默认为it
        bt_toast.setOnClickListener {
            Utils.toast("我是测试吐司")
            tv_log.text = "弹出了吐司"
        }

        bt_map.setOnClickListener {

            // java创建集合方式，list，map等
//            HashMap<String, String> map = new HashMap<>();
//            map.put("1","a")
//            map.put("2","b")
//            map.put("3","c")

            // kotlin 创建集合
            var map = mapOf("1" to "a","2" to "b","3" to "c")

//            tv_log.text = JavaStringUtils.parseMap(map)
            tv_log.text = KotlinStringUtils.parseMap(map)
        }

        bt_log.setOnClickListener {
            tv_log.text = Single.objFun()
        }

        bt_null.setOnClickListener {

            var user = User()
//            user.name = "小明"
            user.phone = "18697723086"

//         java字符串拼接写法   "name的长度:" + user.name.length + "\nphone的长度" + user.phone.length

            tv_log.text = "name的长度:${user.name?.length}\nphone的长度:${user.phone?.length}"

        }

        bt_java.setOnClickListener {
            //调用了Java的静态方法
            var isTrue = JavaStringUtils.isEmpty("true") //自动推断为Boolean类型
            if(isTrue){
                JavaStringUtils.TestUtil().testFun() //调用了Java的对象方法
            }
        }

        bt_second.setOnClickListener {
            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("from","hello kotlin")
            startActivity(intent)
        }

    }

}
