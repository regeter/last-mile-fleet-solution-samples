package com.example.backend.json;

import com.google.type.LatLng;
import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SerializedLocation extends SerializedLocation {

  private final LatLng point;

  private AutoValue_SerializedLocation(
      LatLng point) {
    this.point = point;
  }

  @Override
  LatLng point() {
    return point;
  }

  @Override
  public String toString() {
    return "SerializedLocation{"
        + "point=" + point
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializedLocation) {
      SerializedLocation that = (SerializedLocation) o;
      return this.point.equals(that.point());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= point.hashCode();
    return h$;
  }

  static final class Builder extends SerializedLocation.Builder {
    private LatLng point;
    Builder() {
    }
    @Override
    SerializedLocation.Builder setPoint(LatLng point) {
      if (point == null) {
        throw new NullPointerException("Null point");
      }
      this.point = point;
      return this;
    }
    @Override
    SerializedLocation build() {
      if (this.point == null) {
        String missing = " point";
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializedLocation(
          this.point);
    }
  }

}
