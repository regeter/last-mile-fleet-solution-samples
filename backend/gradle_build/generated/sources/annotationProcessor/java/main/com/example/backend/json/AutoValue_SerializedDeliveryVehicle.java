package com.example.backend.json;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SerializedDeliveryVehicle extends SerializedDeliveryVehicle {

  private final String name;

  private AutoValue_SerializedDeliveryVehicle(
      String name) {
    this.name = name;
  }

  @Override
  String name() {
    return name;
  }

  @Override
  public String toString() {
    return "SerializedDeliveryVehicle{"
        + "name=" + name
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializedDeliveryVehicle) {
      SerializedDeliveryVehicle that = (SerializedDeliveryVehicle) o;
      return this.name.equals(that.name());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    return h$;
  }

  static final class Builder extends SerializedDeliveryVehicle.Builder {
    private String name;
    Builder() {
    }
    @Override
    SerializedDeliveryVehicle.Builder setName(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    SerializedDeliveryVehicle build() {
      if (this.name == null) {
        String missing = " name";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializedDeliveryVehicle(
          this.name);
    }
  }

}
