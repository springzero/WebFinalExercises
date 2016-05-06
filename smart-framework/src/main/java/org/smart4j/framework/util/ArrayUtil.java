package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Administrator on 2016/5/6.
 */
public class ArrayUtil {

    /*
    * 判断字符串是否为空
    * */
    public static boolean isEmpty(Object[] arr) {
        return ArrayUtils.isEmpty(arr);
    }


    /*
    * 判断字符串是否非空
    * */
    public static boolean isNotEmpty(Object[] arr) {
        return !isEmpty(arr);
    }

}
