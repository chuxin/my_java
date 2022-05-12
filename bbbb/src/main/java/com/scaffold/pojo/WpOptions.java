package com.scaffold.pojo;

public class WpOptions {
    private Integer optionId;

    private String optionName;

    private String autoload;

    private String optionValue;

    public WpOptions(Integer optionId, String optionName, String autoload, String optionValue) {
        this.optionId = optionId;
        this.optionName = optionName;
        this.autoload = autoload;
        this.optionValue = optionValue;
    }

    public WpOptions() {
        super();
    }

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName == null ? null : optionName.trim();
    }

    public String getAutoload() {
        return autoload;
    }

    public void setAutoload(String autoload) {
        this.autoload = autoload == null ? null : autoload.trim();
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue == null ? null : optionValue.trim();
    }
}