package com.xunmall.example.design.flyweight;

/**
 * @Author: WangYanjing
 * @Date: ${Date} ${Time}
 * @Description:
 */
public class FinancialReportManager implements IReportManager{

    protected String tenantId = null;

    public FinancialReportManager(String tenantId){
        this.tenantId = tenantId;
    }

    @Override
    public String createReport() {
        return "this is a financial Report";
    }



    @Override
    public void operation(String name) {

    }

    @Override
    public String getType() {
        return null;
    }
}
