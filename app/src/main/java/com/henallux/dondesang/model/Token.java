package com.henallux.dondesang.model;

public class Token {

    private String access_token;
    private int expires_in;

    public Token(String access_token,int expires_in)
    {
        this.access_token=access_token;
        this.expires_in=expires_in;
    }
    public Token()
    {

    }

    public int getExpires_in() {
        return expires_in;
    }

    public String getAccess_token() {
        return access_token;
    }
}
