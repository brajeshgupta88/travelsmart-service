package com.ts.travelsmart_service.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.*;
import com.ts.travelsmart_service.dto.TravelPlanRequest;
import com.ts.travelsmart_service.dto.Context;
import com.ts.travelsmart_service.dto.Selections;
import com.ts.travelsmart_service.dto.MissingField;

@RestController
@RequestMapping("/api/travel-plan")
public class TravelPlanController {

    @PostMapping
    public ResponseEntity<?> planTrip(@RequestBody TravelPlanRequest request) {
        List<MissingField> missing = new ArrayList<>();
        if (request.getContext() == null || request.getContext().getOrigin() == null) {
            missing.add(new MissingField("origin", "What is your departure city?"));
        }
        if (request.getContext() == null || request.getContext().getDepartDate() == null) {
            missing.add(new MissingField("departDate", "When do you want to depart?", "date"));
        }

        if (!missing.isEmpty()) {
            Map<String, Object> resp = new HashMap<>();
            resp.put("status", "incomplete");
            resp.put("missing", missing);
            return ResponseEntity.ok(resp);
        }

        Map<String, Object> itinerary = new HashMap<>();
        itinerary.put("currency", request.getContext().getCurrency());
        itinerary.put("items", Arrays.asList(
            new FlightItem(), new HotelItem(), new ActivityItem()
        ));
        itinerary.put("alternatives", new HashMap<>());
        itinerary.put("totals", Map.of("price", 1390.00));

        Map<String, Object> resp = new HashMap<>();
        resp.put("status", "complete");
        resp.put("itinerary", itinerary);

        return ResponseEntity.ok(resp);
    }
}

// DTOs
class FlightItem extends HashMap<String, Object> {
    public FlightItem() {
        put("type", "flight");
        put("id", "f1");
        put("start", "2025-11-05T08:35:00Z");
        put("end", "2025-11-05T12:15:00Z");
        put("from", "BLR");
        put("to", "DPS");
        put("price", 520.00);
        put("meta", Map.of("airline", "GA", "number", "GA123"));
    }
}
class HotelItem extends HashMap<String, Object> {
    public HotelItem() {
        put("type", "hotel");
        put("id", "h1");
        put("start", "2025-11-05T14:00:00Z");
        put("end", "2025-11-12T11:00:00Z");
        put("name", "Beachside Resort");
        put("address", "...");
        put("price", 780.00);
        put("meta", Map.of("nights", 7));
    }
}
class ActivityItem extends HashMap<String, Object> {
    public ActivityItem() {
        put("type", "activity");
        put("id", "a1");
        put("start", "2025-11-06T02:00:00Z");
        put("end", "2025-11-06T06:00:00Z");
        put("name", "Snorkeling Tour");
        put("location", "Nusa Penida");
        put("price", 90.00);
    }
}