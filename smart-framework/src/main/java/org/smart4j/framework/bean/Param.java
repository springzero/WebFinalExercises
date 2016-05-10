package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 * Created by Administrator on 2016/5/10.
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /*
    * 根据参数名获取long型参数值
    * */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public int getInt(String name) {
        return CastUtil.castInt(paramMap.get(name));
    }

    public String getString(String name) {
        return CastUtil.castString(paramMap.get(name));
    }

    public Double getDouble(String name) {
        return CastUtil.castDouble(paramMap.get(name));
    }

    /*
    * 获取所有字段信息
    * */
    public Map<String, Object> getMap() {
        return paramMap;
    }

}
