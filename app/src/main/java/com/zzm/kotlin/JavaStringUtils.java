package com.zzm.kotlin;

import android.widget.Toast;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by ZhongZiMing on 2017/9/27.
 */

public class JavaStringUtils {

    /**
     * string是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str!=null&&!str.equals("");
    }

    /**
     * 遍历map集合输出key和value
     * @param map
     */
    public static String parseMap(Map map){
        String str = "";
        Iterator<Map.Entry> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry next = iterator.next();
            str += next.getKey() + "=" +next.getValue() + "\n";
        }
        return str;
    }


    public static class TestUtil{

        public void testFun(){
            /**
             * java调用kotlin方法，方法的参数都得传，因为java中没做处理
             */
            Utils.Companion.toast("调用了Java方法，其实Java方法又调用了kotlin方法", Toast.LENGTH_SHORT);
        }

    }


}
