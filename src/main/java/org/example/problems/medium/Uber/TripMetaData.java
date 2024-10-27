package org.example.problems.medium.Uber;

public class TripMetaData {
    String riderRating;
    String driverRating;
    Integer srcLocation;
    Integer dstLocation;

    public TripMetaData(String riderRating, String driverRating, Integer srcLocation, Integer dstLocation) {
        this.riderRating = riderRating;
        this.driverRating = driverRating;
        this.srcLocation = srcLocation;
        this.dstLocation = dstLocation;
    }

    public String getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(String riderRating) {
        this.riderRating = riderRating;
    }

    public String getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(String driverRating) {
        this.driverRating = driverRating;
    }

    public Integer getSrcLocation() {
        return srcLocation;
    }

    public void setSrcLocation(Integer srcLocation) {
        this.srcLocation = srcLocation;
    }

    public Integer getDstLocation() {
        return dstLocation;
    }

    public void setDstLocation(Integer dstLocation) {
        this.dstLocation = dstLocation;
    }
}
