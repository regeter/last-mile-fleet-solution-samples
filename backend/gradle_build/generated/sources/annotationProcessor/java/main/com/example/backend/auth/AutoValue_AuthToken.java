package com.example.backend.auth;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_AuthToken extends AuthToken {

  private final long creationTimestampMs;

  private final long expirationTimestampMs;

  private final String token;

  private AutoValue_AuthToken(
      long creationTimestampMs,
      long expirationTimestampMs,
      String token) {
    this.creationTimestampMs = creationTimestampMs;
    this.expirationTimestampMs = expirationTimestampMs;
    this.token = token;
  }

  @Override
  long creationTimestampMs() {
    return creationTimestampMs;
  }

  @Override
  long expirationTimestampMs() {
    return expirationTimestampMs;
  }

  @Override
  public String token() {
    return token;
  }

  @Override
  public String toString() {
    return "AuthToken{"
        + "creationTimestampMs=" + creationTimestampMs + ", "
        + "expirationTimestampMs=" + expirationTimestampMs + ", "
        + "token=" + token
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AuthToken) {
      AuthToken that = (AuthToken) o;
      return this.creationTimestampMs == that.creationTimestampMs()
          && this.expirationTimestampMs == that.expirationTimestampMs()
          && this.token.equals(that.token());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= (int) ((creationTimestampMs >>> 32) ^ creationTimestampMs);
    h$ *= 1000003;
    h$ ^= (int) ((expirationTimestampMs >>> 32) ^ expirationTimestampMs);
    h$ *= 1000003;
    h$ ^= token.hashCode();
    return h$;
  }

  static final class Builder extends AuthToken.Builder {
    private long creationTimestampMs;
    private long expirationTimestampMs;
    private String token;
    private byte set$0;
    Builder() {
    }
    @Override
    public AuthToken.Builder setCreationTimestampMs(long creationTimestampMs) {
      this.creationTimestampMs = creationTimestampMs;
      set$0 |= (byte) 1;
      return this;
    }
    @Override
    public AuthToken.Builder setExpirationTimestampMs(long expirationTimestampMs) {
      this.expirationTimestampMs = expirationTimestampMs;
      set$0 |= (byte) 2;
      return this;
    }
    @Override
    public AuthToken.Builder setToken(String token) {
      if (token == null) {
        throw new NullPointerException("Null token");
      }
      this.token = token;
      return this;
    }
    @Override
    public AuthToken build() {
      if (set$0 != 3
          || this.token == null) {
        StringBuilder missing = new StringBuilder();
        if ((set$0 & 1) == 0) {
          missing.append(" creationTimestampMs");
        }
        if ((set$0 & 2) == 0) {
          missing.append(" expirationTimestampMs");
        }
        if (this.token == null) {
          missing.append(" token");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AuthToken(
          this.creationTimestampMs,
          this.expirationTimestampMs,
          this.token);
    }
  }

}
