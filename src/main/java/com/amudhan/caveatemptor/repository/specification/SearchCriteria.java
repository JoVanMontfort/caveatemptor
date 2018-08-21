package com.amudhan.caveatemptor.repository.specification;

public class SearchCriteria {
    private String key;
    private String key2;
    private String operation;
    private Object value;

    public SearchCriteria(String key, String key2, String operation, Object value) {
        this.key = key;
        this.key2 = key2;
        this.operation = operation;
        this.value = value;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
