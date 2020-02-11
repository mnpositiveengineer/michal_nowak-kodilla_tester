package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double height;
    private double width;
    private boolean postmarked;

    public Stamp(String stampName, double height, double width, boolean postmarked) {
        this.stampName = stampName;
        this.height = height;
        this.width = width;
        this.postmarked = postmarked;
    }

    public String getStampName() {
        return stampName;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public boolean isPostmarked() {
        return postmarked;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", postmarked=" + postmarked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                postmarked == stamp.postmarked &&
                Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, height, width, postmarked);
    }
}
