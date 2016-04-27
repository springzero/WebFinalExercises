package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 * Created by Administrator on 2016/4/26.
 */
public class CustomerService {

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;




    /*
    * 获取客户列表
    * */
    public List<Customer> getCustomerList(String keyword) {
        return null;
    }

    /*
    * 获取客户
    * */
    public Customer getCustomer(long id) {
        return null;
    }

    /*
    * 创建客户
    * */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    /*
    * 更新客户
    * */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return false;
    }


    /*
    * 删除客户
    * */
    public boolean deleteCustomer(long id) {
        return false;
    }

}
