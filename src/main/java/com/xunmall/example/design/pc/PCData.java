package com.xunmall.example.design.pc;

/**
 * @author wangyanjing
 * @date 2020/6/18 21:38
 */
public final class PCData {
    private final int iniData;

    public PCData(int iniData) {
        this.iniData = iniData;
    }

    public PCData(String d){
        this.iniData = Integer.valueOf(d);
    }

    public int getIniData(){
        return iniData;
    }

    @Override
    public String toString() {
        return "PCData{" +
                "iniData=" + iniData +
                '}';
    }
}
