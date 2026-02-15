package com.example.booking.dto;

public class ShowTimeDto {

    private String showId;
    private String showTime;

    public ShowTimeDto(String showId, String showTime) {
        this.showId = showId;
        this.showTime = showTime;
    }

    public String getShowId() { return showId; }
    public String getShowTime() { return showTime; }
}