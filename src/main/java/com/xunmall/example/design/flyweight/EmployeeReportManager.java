package com.xunmall.example.design.flyweight;

/**
 * @Author: Eugene
 * @Date: ${Date} ${Time}
 * @Description:
 */
public class EmployeeReportManager implements IReportManager {

    protected String tenantId = null;

    public EmployeeReportManager(String tenantId){
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "this is a employee report";
    }

    @Override
    public void operation(String name) {

    }

    @Override
    public String getType() {
        return null;
    }
}
