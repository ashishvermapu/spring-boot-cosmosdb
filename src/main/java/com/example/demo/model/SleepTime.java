package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "sleepTime", "message" })
public class SleepTime {

  @JsonProperty("sleepTime")
  private Integer sleepTime;

  @JsonProperty("message")
  private String message;

  public SleepTime(){
  }

  public SleepTime(Integer sleepTime, String message) {
    this.sleepTime = sleepTime;
    this.message = message;
  }

  public Integer getSleepTime() {
    return sleepTime;
  }

  public void setSleepTime(Integer sleepTime) {
    this.sleepTime = sleepTime;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "SleepTime{" +
            "sleepTime=" + sleepTime +
            ", message='" + message + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof SleepTime)) return false;

    SleepTime sleepTime1 = (SleepTime) o;

    if (getSleepTime() != null ? !getSleepTime().equals(sleepTime1.getSleepTime()) : sleepTime1.getSleepTime() != null)
      return false;
    return getMessage() != null ? getMessage().equals(sleepTime1.getMessage()) : sleepTime1.getMessage() == null;
  }

  @Override
  public int hashCode() {
    int result = getSleepTime() != null ? getSleepTime().hashCode() : 0;
    result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
    return result;
  }
}