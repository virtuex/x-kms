package com.xudean.common.keyutils;

public class PCIKeyPair {
    /**
     * 私钥
     */
    private String priKey;
    /**
     * 公钥
     */
    private String pubKey;
    /**
     * 用户名
     */
    private String username;

    public PCIKeyPair(String priKey, String pubKey) {
        this.priKey = priKey;
        this.pubKey = pubKey;
    }

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}