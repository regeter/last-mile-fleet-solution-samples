package com.example.backend.json;

import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_SerializedTask extends SerializedTask {

  private final String name;

  private final String type;

  private final String state;

  private final String taskOutcome;

  private final String deliveryVehicleId;

  private final String trackingId;

  private final SerializedLocation plannedLocation;

  private AutoValue_SerializedTask(
      String name,
      String type,
      String state,
      String taskOutcome,
      String deliveryVehicleId,
      String trackingId,
      SerializedLocation plannedLocation) {
    this.name = name;
    this.type = type;
    this.state = state;
    this.taskOutcome = taskOutcome;
    this.deliveryVehicleId = deliveryVehicleId;
    this.trackingId = trackingId;
    this.plannedLocation = plannedLocation;
  }

  @Override
  String name() {
    return name;
  }

  @Override
  String type() {
    return type;
  }

  @Override
  String state() {
    return state;
  }

  @Override
  String taskOutcome() {
    return taskOutcome;
  }

  @Override
  String deliveryVehicleId() {
    return deliveryVehicleId;
  }

  @Override
  String trackingId() {
    return trackingId;
  }

  @Override
  SerializedLocation plannedLocation() {
    return plannedLocation;
  }

  @Override
  public String toString() {
    return "SerializedTask{"
        + "name=" + name + ", "
        + "type=" + type + ", "
        + "state=" + state + ", "
        + "taskOutcome=" + taskOutcome + ", "
        + "deliveryVehicleId=" + deliveryVehicleId + ", "
        + "trackingId=" + trackingId + ", "
        + "plannedLocation=" + plannedLocation
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SerializedTask) {
      SerializedTask that = (SerializedTask) o;
      return this.name.equals(that.name())
          && this.type.equals(that.type())
          && this.state.equals(that.state())
          && this.taskOutcome.equals(that.taskOutcome())
          && this.deliveryVehicleId.equals(that.deliveryVehicleId())
          && this.trackingId.equals(that.trackingId())
          && this.plannedLocation.equals(that.plannedLocation());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= name.hashCode();
    h$ *= 1000003;
    h$ ^= type.hashCode();
    h$ *= 1000003;
    h$ ^= state.hashCode();
    h$ *= 1000003;
    h$ ^= taskOutcome.hashCode();
    h$ *= 1000003;
    h$ ^= deliveryVehicleId.hashCode();
    h$ *= 1000003;
    h$ ^= trackingId.hashCode();
    h$ *= 1000003;
    h$ ^= plannedLocation.hashCode();
    return h$;
  }

  static final class Builder extends SerializedTask.Builder {
    private String name;
    private String type;
    private String state;
    private String taskOutcome;
    private String deliveryVehicleId;
    private String trackingId;
    private SerializedLocation plannedLocation;
    Builder() {
    }
    @Override
    SerializedTask.Builder setName(String name) {
      if (name == null) {
        throw new NullPointerException("Null name");
      }
      this.name = name;
      return this;
    }
    @Override
    SerializedTask.Builder setType(String type) {
      if (type == null) {
        throw new NullPointerException("Null type");
      }
      this.type = type;
      return this;
    }
    @Override
    SerializedTask.Builder setState(String state) {
      if (state == null) {
        throw new NullPointerException("Null state");
      }
      this.state = state;
      return this;
    }
    @Override
    SerializedTask.Builder setTaskOutcome(String taskOutcome) {
      if (taskOutcome == null) {
        throw new NullPointerException("Null taskOutcome");
      }
      this.taskOutcome = taskOutcome;
      return this;
    }
    @Override
    SerializedTask.Builder setDeliveryVehicleId(String deliveryVehicleId) {
      if (deliveryVehicleId == null) {
        throw new NullPointerException("Null deliveryVehicleId");
      }
      this.deliveryVehicleId = deliveryVehicleId;
      return this;
    }
    @Override
    SerializedTask.Builder setTrackingId(String trackingId) {
      if (trackingId == null) {
        throw new NullPointerException("Null trackingId");
      }
      this.trackingId = trackingId;
      return this;
    }
    @Override
    SerializedTask.Builder setPlannedLocation(SerializedLocation plannedLocation) {
      if (plannedLocation == null) {
        throw new NullPointerException("Null plannedLocation");
      }
      this.plannedLocation = plannedLocation;
      return this;
    }
    @Override
    SerializedTask build() {
      if (this.name == null
          || this.type == null
          || this.state == null
          || this.taskOutcome == null
          || this.deliveryVehicleId == null
          || this.trackingId == null
          || this.plannedLocation == null) {
        StringBuilder missing = new StringBuilder();
        if (this.name == null) {
          missing.append(" name");
        }
        if (this.type == null) {
          missing.append(" type");
        }
        if (this.state == null) {
          missing.append(" state");
        }
        if (this.taskOutcome == null) {
          missing.append(" taskOutcome");
        }
        if (this.deliveryVehicleId == null) {
          missing.append(" deliveryVehicleId");
        }
        if (this.trackingId == null) {
          missing.append(" trackingId");
        }
        if (this.plannedLocation == null) {
          missing.append(" plannedLocation");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SerializedTask(
          this.name,
          this.type,
          this.state,
          this.taskOutcome,
          this.deliveryVehicleId,
          this.trackingId,
          this.plannedLocation);
    }
  }

}
