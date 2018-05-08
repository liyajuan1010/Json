package com.example.administrator.myapplication.net;

/**
 * Created by Administrator on 2018/5/2.
 */

public class HttpResult<T> {
    private int code;
    private String message;
    private T data;

    public HttpResult(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
