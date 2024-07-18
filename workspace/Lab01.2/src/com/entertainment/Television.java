package com.entertainment;

import java.util.Objects;

public class Television {
    private String brand;
    private int volume;
    private Object currentChannel;

// natural order is defined by brand (string)
    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Object getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(Object currentChannel) {
        this.currentChannel = currentChannel;
    }

    // a poorly written hash function, it easily results in hash collisions
    // i.e. different objects can easily yield the same hashcode
    // return getBrand().length() + getVolume();
    // instead, we use Objects.hash() to give us a scientifically correct hash function
    // it will minimize the probability of hash collisions
    @Override
    public int hashCode() {
        System.out.println("hashCode Called");
        return Objects.hash(brand, volume, currentChannel);
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        // proceed only if object is a-television
        if (obj instanceof Television) {
            // downcast 'obj' to more specific reference type Television, to call getName(), etc.
            Television other = (Television) obj;

            // do the checks - sameness is defined as same-brand AND same volume
            // Objects.equals() does a null safe on the 2 arguments provided via Java 17
            result = this.getBrand().equals(other.getBrand()) &&
                    this.getVolume() == other.getVolume();
        }
        return result;

        @Override
                public int compareTo(Television other) {
            int result = thisgetBrand().compareTo(other.getBrand());
            if (result == 0) { // tied on brand, so break the tie by volume
                result = Integer.compare(this.getVolume(), other.getVolume());
            }
            return  result;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: brand=%s, volume=%d, currentChannel=%s",
                getClass().getSimpleName(), getBrand(), getVolume(), getCurrentChannel());
    }


}
