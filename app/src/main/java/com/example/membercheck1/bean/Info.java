package com.example.membercheck1.bean;

/**
 * Created by 区枫华 on 2017/5/18.
 */

public class Info {

    private String fristStr;
    private String secStr;
    private int underNum;
    private int topNum;
    private int headRes;
    private int likeNum;

    public Info() {

    }

    /**
     * 构造函数
     * @param fristStr
     * @param secStr
     * @param underNum
     * @param topNum
     * @param headRes
     * @param likeNum
     */
    public Info(String fristStr, String secStr, int topNum, int underNum, int headRes, int likeNum) {
        this.fristStr = fristStr;
        this.secStr = secStr;
        this.underNum = underNum;
        this.topNum = topNum;
        this.headRes = headRes;
        this.likeNum = likeNum;

    }

    public String getFristStr() {
        return fristStr;
    }

    public void setFristStr(String fristStr) {
        this.fristStr = fristStr;
    }

    public String getSecStr() {
        return secStr;
    }

    public void setSecStr(String secStr) {
        this.secStr = secStr;
    }

    public int getUnderNum() {
        return underNum;
    }

    public void setUnderNum(int underNum) {
        this.underNum = underNum;
    }

    public int getTopNum() {
        return topNum;
    }

    public void setTopNum(int topNum) {
        this.topNum = topNum;
    }

    public int getHeadRes() {
        return headRes;
    }

    public void setHeadRes(int headRes) {
        this.headRes = headRes;
    }

    public int getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(int likeNum) {
        this.likeNum = likeNum;
    }
}
