package org22.example22.demo.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ResponseStandard<T> {
    private int httpCode;
    private String message;
    private T data;

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseStandard{" +
                "httpCode=" + httpCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public ResponseStandard(int httpCode, String message, T data) {
        this.httpCode = httpCode;
        this.message = message;
        this.data = data;
    }
}
