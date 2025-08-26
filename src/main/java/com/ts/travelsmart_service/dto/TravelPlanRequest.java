package com.ts.travelsmart_service.dto;



public class TravelPlanRequest {
    private String query;
    private Context context;
    private Selections selections;
    public String getQuery() { return query; }
    public void setQuery(String query) { this.query = query; }
    public Context getContext() { return context; }
    public void setContext(Context context) { this.context = context; }
    public Selections getSelections() { return selections; }
    public void setSelections(Selections selections) { this.selections = selections; }
}