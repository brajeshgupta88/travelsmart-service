package com.ts.travelsmart_service.dto;

public class MissingField {
    private String field;
    private String prompt;
    private String type;
    public MissingField(String field, String prompt) {
        this.field = field;
        this.prompt = prompt;
    }
    public MissingField(String field, String prompt, String type) {
        this.field = field;
        this.prompt = prompt;
        this.type = type;
    }
    public String getField() { return field; }
    public void setField(String field) { this.field = field; }
    public String getPrompt() { return prompt; }
    public void setPrompt(String prompt) { this.prompt = prompt; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}