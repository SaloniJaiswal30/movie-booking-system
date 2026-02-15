package com.example.booking.dto;

import java.util.List;

public class TheatreShowsResponse {

    private String theatreId;
    private String theatreName;
    private String town;
    private List<ShowTimeDto> shows;

    public TheatreShowsResponse(String theatreId, String theatreName, String town, List<ShowTimeDto> shows) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.town = town;
        this.shows = shows;
    }

    public String getTheatreId() { return theatreId; }
    public String getTheatreName() { return theatreName; }
    public String getTown() { return town; }
    public List<ShowTimeDto> getShows() { return shows; }
}