package com.xunmall.example.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: WangYanjing
 * @Date: ${Date} ${Time}
 * @Description:
 */
public class ReportManagerFactory {
    Map<String, IReportManager> financialReportManager = new HashMap<>();

    Map<String, IReportManager> employeeReportManager = new HashMap<>();

   public IReportManager getFinancialReportManager(String tenantId) {
        IReportManager r = financialReportManager.get(tenantId);
        if (r == null) {
            r = new FinancialReportManager(tenantId);
            financialReportManager.put(tenantId, r);
        }
        return r;
    }

    public IReportManager getEmployeeReportManager(String tenantId) {
        IReportManager r = employeeReportManager.get(tenantId);
        if (r == null) {
            r = new EmployeeReportManager(tenantId);
            employeeReportManager.put(tenantId, r);
        }
        return r;
    }


}
