package com.example.booking.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show {
    private String showId;
    private String movieId;
    private String theatreId;
    private String theatreName;
    private String town;
    private String showDate;   // "2026-02-15"
    private String showTime;   // "18:30"
}
