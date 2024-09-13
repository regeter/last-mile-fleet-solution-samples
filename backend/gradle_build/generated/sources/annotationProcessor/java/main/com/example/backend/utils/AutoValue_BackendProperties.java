package com.example.backend.utils;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BackendProperties extends BackendProperties {

  private final String providerId;

  private final String fleetEngineAddress;

  private final String serverServiceAccountEmail;

  private final String driverServiceAccountEmail;

  private final String consumerServiceAccountEmail;

  private final String fleetReaderServiceAccountEmail;

  private final String apiKey;

  private final String backendHost;

  AutoValue_BackendProperties(
      String providerId,
      String fleetEngineAddress,
      String serverServiceAccountEmail,
      String driverServiceAccountEmail,
      String consumerServiceAccountEmail,
      String fleetReaderServiceAccountEmail,
      String apiKey,
      String backendHost) {
    if (providerId == null) {
      throw new NullPointerException("Null providerId");
    }
    this.providerId = providerId;
    if (fleetEngineAddress == null) {
      throw new NullPointerException("Null fleetEngineAddress");
    }
    this.fleetEngineAddress = fleetEngineAddress;
    if (serverServiceAccountEmail == null) {
      throw new NullPointerException("Null serverServiceAccountEmail");
    }
    this.serverServiceAccountEmail = serverServiceAccountEmail;
    if (driverServiceAccountEmail == null) {
      throw new NullPointerException("Null driverServiceAccountEmail");
    }
    this.driverServiceAccountEmail = driverServiceAccountEmail;
    if (consumerServiceAccountEmail == null) {
      throw new NullPointerException("Null consumerServiceAccountEmail");
    }
    this.consumerServiceAccountEmail = consumerServiceAccountEmail;
    if (fleetReaderServiceAccountEmail == null) {
      throw new NullPointerException("Null fleetReaderServiceAccountEmail");
    }
    this.fleetReaderServiceAccountEmail = fleetReaderServiceAccountEmail;
    if (apiKey == null) {
      throw new NullPointerException("Null apiKey");
    }
    this.apiKey = apiKey;
    if (backendHost == null) {
      throw new NullPointerException("Null backendHost");
    }
    this.backendHost = backendHost;
  }

  @Override
  public String providerId() {
    return providerId;
  }

  @Override
  public String fleetEngineAddress() {
    return fleetEngineAddress;
  }

  @Override
  public String serverServiceAccountEmail() {
    return serverServiceAccountEmail;
  }

  @Override
  public String driverServiceAccountEmail() {
    return driverServiceAccountEmail;
  }

  @Override
  public String consumerServiceAccountEmail() {
    return consumerServiceAccountEmail;
  }

  @Override
  public String fleetReaderServiceAccountEmail() {
    return fleetReaderServiceAccountEmail;
  }

  @Override
  public String apiKey() {
    return apiKey;
  }

  @Override
  public String backendHost() {
    return backendHost;
  }

  @Override
  public String toString() {
    return "BackendProperties{"
        + "providerId=" + providerId + ", "
        + "fleetEngineAddress=" + fleetEngineAddress + ", "
        + "serverServiceAccountEmail=" + serverServiceAccountEmail + ", "
        + "driverServiceAccountEmail=" + driverServiceAccountEmail + ", "
        + "consumerServiceAccountEmail=" + consumerServiceAccountEmail + ", "
        + "fleetReaderServiceAccountEmail=" + fleetReaderServiceAccountEmail + ", "
        + "apiKey=" + apiKey + ", "
        + "backendHost=" + backendHost
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BackendProperties) {
      BackendProperties that = (BackendProperties) o;
      return this.providerId.equals(that.providerId())
          && this.fleetEngineAddress.equals(that.fleetEngineAddress())
          && this.serverServiceAccountEmail.equals(that.serverServiceAccountEmail())
          && this.driverServiceAccountEmail.equals(that.driverServiceAccountEmail())
          && this.consumerServiceAccountEmail.equals(that.consumerServiceAccountEmail())
          && this.fleetReaderServiceAccountEmail.equals(that.fleetReaderServiceAccountEmail())
          && this.apiKey.equals(that.apiKey())
          && this.backendHost.equals(that.backendHost());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= providerId.hashCode();
    h$ *= 1000003;
    h$ ^= fleetEngineAddress.hashCode();
    h$ *= 1000003;
    h$ ^= serverServiceAccountEmail.hashCode();
    h$ *= 1000003;
    h$ ^= driverServiceAccountEmail.hashCode();
    h$ *= 1000003;
    h$ ^= consumerServiceAccountEmail.hashCode();
    h$ *= 1000003;
    h$ ^= fleetReaderServiceAccountEmail.hashCode();
    h$ *= 1000003;
    h$ ^= apiKey.hashCode();
    h$ *= 1000003;
    h$ ^= backendHost.hashCode();
    return h$;
  }

}
