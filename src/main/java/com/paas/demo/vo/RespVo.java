package com.paas.demo.vo;

import java.io.Serializable;

public class RespVo implements Serializable {
    private static final long serialVersionUID = 6401595033946583507L;
    private String code;
    private String msg;
    private Object data;

    public RespVo() {
    }

    public RespVo(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static RespVo success(Object data) {
        return new RespVo("0000", "", data);
    }

    public static RespVo error(String code, String msg) {
        return new RespVo(code, msg, null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
