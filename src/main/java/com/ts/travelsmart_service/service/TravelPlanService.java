package com.ts.travelsmart_service.service;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TravelPlanService {

    public List<Map<String, Object>> getFlightOptions(String origin, String destination, String departDate, String returnDate, int travelerCount) {
        // Mock flight options
        List<Map<String, Object>> flights = new ArrayList<>();
        flights.add(Map.of(
            "type", "flight",
            "id", "f1",
            "start", "2025-11-05T08:35:00Z",
            "end", "2025-11-05T12:15:00Z",
            "from", origin,
            "to", destination,
            "price", 520.00,
            "meta", Map.of("airline", "GA", "number", "GA123")
        ));
        flights.add(Map.of(
            "type", "flight",
            "id", "f2",
            "start", "2025-11-05T10:00:00Z",
            "end", "2025-11-05T13:40:00Z",
            "from", origin,
            "to", destination,
            "price", 480.00,
            "meta", Map.of("airline", "SQ", "number", "SQ456")
        ));
        return flights;
    }

    public List<Map<String, Object>> getHotelOptions(String destination, String departDate, String returnDate, int travelerCount) {
        // Mock hotel options
        List<Map<String, Object>> hotels = new ArrayList<>();
        hotels.add(Map.of(
            "type", "hotel",
            "id", "h1",
            "start", departDate + "T14:00:00Z",
            "end", returnDate + "T11:00:00Z",
            "name", "Beachside Resort",
            "address", "Beach Road, " + destination,
            "price", 780.00,
            "meta", Map.of("nights", 7)
        ));
        hotels.add(Map.of(
            "type", "hotel",
            "id", "h2",
            "start", departDate + "T15:00:00Z",
            "end", returnDate + "T11:00:00Z",
            "name", "Mountain View Hotel",
            "address", "Mountain Road, " + destination,
            "price", 650.00,
            "meta", Map.of("nights", 7)
        ));
        return hotels;
    }

    public List<Map<String, Object>> getActivityOptions(String destination) {
        // Mock activity options
        List<Map<String, Object>> activities = new ArrayList<>();
        activities.add(Map.of(
            "type", "activity",
            "id", "a1",
            "start", "2025-11-06T02:00:00Z",
            "end", "2025-11-06T06:00:00Z",
            "name", "Snorkeling Tour",
            "location", "Nusa Penida",
            "price", 90.00
        ));
        activities.add(Map.of(
            "type", "activity",
            "id", "a2",
            "start", "2025-11-07T03:00:00Z",
            "end", "2025-11-07T07:00:00Z",
            "name", "Temple Visit",
            "location", "Uluwatu",
            "price", 50.00
        ));
        return activities;
    }
}