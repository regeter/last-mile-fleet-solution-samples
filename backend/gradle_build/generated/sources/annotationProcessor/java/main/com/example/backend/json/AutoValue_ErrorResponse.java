package com.example.backend.json;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_ErrorResponse extends ErrorResponse {

  private final String message;

  private final int status;

  AutoValue_ErrorResponse(
      String message,
      int status) {
    if (message == null) {
      throw new NullPointerException("Null message");
    }
    this.message = message;
    this.status = status;
  }

  @Override
  public String message() {
    return message;
  }

  @Override
  public int status() {
    return status;
  }

  @Override
  public String toString() {
    return "ErrorResponse{"
        + "message=" + message + ", "
        + "status=" + status
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ErrorResponse) {
      ErrorResponse that = (ErrorResponse) o;
      return this.message.equals(that.message())
          && this.status == that.status();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= message.hashCode();
    h$ *= 1000003;
    h$ ^= status;
    return h$;
  }

}
