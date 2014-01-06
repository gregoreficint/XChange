/**
 * Copyright (C) 2012 - 2013 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.xeiam.xchange.bitcoinium.dto.marketdata;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * Data object representing a Ticker History from Bitcoinium Web Service
 * </p>
 */
public final class BitcoiniumTickerHistory {

  private final ArrayList<BigDecimal> pp;
  private final long t;
  private final ArrayList<BigDecimal> tt;

  public BitcoiniumTickerHistory(@JsonProperty("pp") ArrayList<BigDecimal> pp, @JsonProperty("t") long t, @JsonProperty("tt") ArrayList<BigDecimal> tt) {

    this.pp = pp;
    this.t = t;
    this.tt = tt;
  }

  public ArrayList<BigDecimal> getPriceHistoryList() {

    return this.pp;
  }

  public long getBaseTimestamp() {

    return this.t;
  }

  public ArrayList<BigDecimal> getTimeStampOffsets() {

    return this.tt;
  }

  @Override
  public String toString() {

    return "BitcoiniumTickerHistory [priceList=" + pp + ", timestamp=" + t + ", timeOffsets=" + tt + "]";
  }

}
