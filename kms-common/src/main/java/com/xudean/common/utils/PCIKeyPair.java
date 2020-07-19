package com.xudean.common.utils;

public class PCIKeyPair {

    private String priKey;      //私钥
    private String pubKey;      //公钥


    public PCIKeyPair() {
    }

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
}