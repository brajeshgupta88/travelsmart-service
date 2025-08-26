package com.ts.travelsmart_service.dto;

import java.util.List;

public class Selections {
    private String flightId;
    private String hotelId;
    private List<String> activityIds;
    public String getFlightId() { return flightId; }
    public void setFlightId(String flightId) { this.flightId = flightId; }
    public String getHotelId() { return hotelId; }
    public void setHotelId(String hotelId) { this.hotelId = hotelId; }
    public List<String> getActivityIds() { return activityIds; }
    public void setActivityIds(List<String> activityIds) { this.activityIds = activityIds; }
}