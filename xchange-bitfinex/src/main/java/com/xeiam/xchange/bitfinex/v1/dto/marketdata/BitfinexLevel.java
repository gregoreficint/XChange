package com.xeiam.xchange.bitfinex.v1.dto.marketdata;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BitfinexLevel {

  private final BigDecimal price;
  private final BigDecimal amount;
  private final float timestamp;

  public BitfinexLevel(@JsonProperty("price") BigDecimal price, @JsonProperty("amount") BigDecimal amount, @JsonProperty("timestamp") float timestamp) {

    this.price = price;
    this.amount = amount;
    this.timestamp = timestamp;
  }

  public BigDecimal getPrice() {

    return price;
  }

  public BigDecimal getAmount() {

    return amount;
  }

  public float getTimestamp() {

    return timestamp;
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();
    builder.append("BitfinexLevel [timestamp=");
    builder.append(timestamp);
    builder.append("]");
    return builder.toString();
  }
}
