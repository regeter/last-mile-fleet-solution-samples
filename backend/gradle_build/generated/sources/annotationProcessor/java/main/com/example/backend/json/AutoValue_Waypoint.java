package com.example.backend.json;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Waypoint extends Waypoint {

  private final SerializedLocation location;

  private final Waypoint.WaypointType waypointType;

  private AutoValue_Waypoint(
      SerializedLocation location,
      Waypoint.WaypointType waypointType) {
    this.location = location;
    this.waypointType = waypointType;
  }

  @Override
  SerializedLocation location() {
    return location;
  }

  @Override
  Waypoint.WaypointType waypointType() {
    return waypointType;
  }

  @Override
  public String toString() {
    return "Waypoint{"
        + "location=" + location + ", "
        + "waypointType=" + waypointType
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Waypoint) {
      Waypoint that = (Waypoint) o;
      return this.location.equals(that.location())
          && this.waypointType.equals(that.waypointType());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= location.hashCode();
    h$ *= 1000003;
    h$ ^= waypointType.hashCode();
    return h$;
  }

  static final class Builder extends Waypoint.Builder {
    private SerializedLocation location;
    private Waypoint.WaypointType waypointType;
    Builder() {
    }
    @Override
    Waypoint.Builder setLocation(SerializedLocation location) {
      if (location == null) {
        throw new NullPointerException("Null location");
      }
      this.location = location;
      return this;
    }
    @Override
    Waypoint.Builder setWaypointType(Waypoint.WaypointType waypointType) {
      if (waypointType == null) {
        throw new NullPointerException("Null waypointType");
      }
      this.waypointType = waypointType;
      return this;
    }
    @Override
    Waypoint build() {
      if (this.location == null
          || this.waypointType == null) {
        StringBuilder missing = new StringBuilder();
        if (this.location == null) {
          missing.append(" location");
        }
        if (this.waypointType == null) {
          missing.append(" waypointType");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Waypoint(
          this.location,
          this.waypointType);
    }
  }

}
