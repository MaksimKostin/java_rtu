package com.spring.practice_14;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Card implements AllFunc{
    @JsonProperty("cardNumber")
    public int cardNumber;
    @JsonProperty("code")
    public int code;

    public Card() { }

    public Card(int cardNumber, int code) {
        this.cardNumber = cardNumber;
        this.code = code;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
