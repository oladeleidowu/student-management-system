package com.bimcode.studentmanagementsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse<T> {

    private String status;

    private String message;

    @JsonProperty(value = "data")
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        return "BaseResponse{" + "status='" + status + '\'' + ", message='" + message + '\'' + ", data=" + data + '}';
    }
}
