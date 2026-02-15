package com.example.booking.service;

import com.example.booking.model.Show;
import com.example.booking.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    // Partner creates show
    public void createShow(Show show) {
        showRepository.save(show);
    }

    // Partner updates show
    public Show updateShow(String showId, Show updatedShow) {
        Show existing = showRepository.findById(showId);
        if (existing == null) return null;

        existing.setShowTime(updatedShow.getShowTime());
        existing.setShowDate(updatedShow.getShowDate());
        existing.setTown(updatedShow.getTown());
        existing.setTheatreName(updatedShow.getTheatreName());

        showRepository.save(existing);
        return existing;
    }

    // Partner deletes show
    public void deleteShow(String showId) {
        showRepository.delete(showId);
    }

    // User browses shows
    public List<Show> browseShows(String movieId, String town, String date) {
        return showRepository.findByMovieTownAndDate(movieId, town, date);
    }
}

