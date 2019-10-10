package com.hl.controller.session;

public class LoginResponseDto {
    private Long userId;
    private String name;
    private String apiKey;
    private long apiKeyExpire;
    private String flushKey;
    private long flushKeyExpire;

    public LoginResponseDto(){}

    public LoginResponseDto(Long userId, String name, String apiKey, long apiKeyExpire, String flushKey, long flushKeyExpire) {
        this.userId = userId;
        this.name = name;
        this.apiKey = apiKey;
        this.apiKeyExpire = apiKeyExpire;
        this.flushKey = flushKey;
        this.flushKeyExpire = flushKeyExpire;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public long getApiKeyExpire() {
        return apiKeyExpire;
    }

    public void setApiKeyExpire(long apiKeyExpire) {
        this.apiKeyExpire = apiKeyExpire;
    }

    public String getFlushKey() {
        return flushKey;
    }

    public void setFlushKey(String flushKey) {
        this.flushKey = flushKey;
    }

    public long getFlushKeyExpire() {
        return flushKeyExpire;
    }

    public void setFlushKeyExpire(long flushKeyExpire) {
        this.flushKeyExpire = flushKeyExpire;
    }
}
