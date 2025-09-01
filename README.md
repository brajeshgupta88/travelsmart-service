# travelsmart-service

Make required changes to integrate http://localhost:8080/api/travel-plan API 

Request 

{
    "query": "Trip to Bali in November for 2, prefer beach hotel",
    "context": {
      "origin": "BLR",
      "destination": "DPS",
      "departDate": "2025-11-05",
      "returnDate": "2025-11-12",
      "travelerCount": 2,
      "currency": "USD"
    },
    "selections": {
      "flightId": "f1",
      "hotelId": "h1",
      "activityIds": ["a1"]
    }
  }


Resposne 

  {
    "itinerary": {
        "alternatives": {},
        "currency": "USD",
        "totals": {
            "price": 1390.0
        },
        "items": [
            {
                "price": 520.0,
                "meta": {
                    "number": "GA123",
                    "airline": "GA"
                },
                "start": "2025-11-05T08:35:00Z",
                "end": "2025-11-05T12:15:00Z",
                "from": "BLR",
                "id": "f1",
                "to": "DPS",
                "type": "flight"
            },
            {
                "address": "...",
                "price": 780.0,
                "meta": {
                    "nights": 7
                },
                "start": "2025-11-05T14:00:00Z",
                "name": "Beachside Resort",
                "end": "2025-11-12T11:00:00Z",
                "id": "h1",
                "type": "hotel"
            },
            {
                "price": 90.0,
                "start": "2025-11-06T02:00:00Z",
                "name": "Snorkeling Tour",
                "end": "2025-11-06T06:00:00Z",
                "location": "Nusa Penida",
                "id": "a1",
                "type": "activity"
            }
        ]
    },
    "status": "complete"
}
