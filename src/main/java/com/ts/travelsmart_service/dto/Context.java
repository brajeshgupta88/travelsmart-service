package com.ts.travelsmart_service.dto;

public class Context {
    private String origin;
    private String destination;
    private String departDate;
    private String returnDate;
    private int travelerCount;
    private String currency;
    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public String getDepartDate() { return departDate; }
    public void setDepartDate(String departDate) { this.departDate = departDate; }
    public String getReturnDate() { return returnDate; }
    public void setReturnDate(String returnDate) { this.returnDate = returnDate; }
    public int getTravelerCount() { return travelerCount; }
    public void setTravelerCount(int travelerCount) { this.travelerCount = travelerCount; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

}


