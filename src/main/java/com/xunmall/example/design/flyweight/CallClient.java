package com.xunmall.example.design.flyweight;

/**
 * @Author: Eugene
 * @Date: ${Date} ${Time}
 * @Description:
 */
public class CallClient {

    public static void main(String[] args) {
        ReportManagerFactory reportManagerFactory = new ReportManagerFactory();
        IReportManager reportManager = reportManagerFactory.getFinancialReportManager("A");
        System.out.println(reportManager.createReport());
    }

}
