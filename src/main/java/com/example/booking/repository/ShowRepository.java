package com.example.booking.repository;

import com.example.booking.model.Show;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ShowRepository {

    private Map<String, Show> showDB = new HashMap<>();

    public void save(Show show) {
        showDB.put(show.getShowId(), show);
    }

    public Show findById(String showId) {
        return showDB.get(showId);
    }

    public void delete(String showId) {
        showDB.remove(showId);
    }

    public List<Show> findAll() {
        return new ArrayList<>(showDB.values());
    }

    public List<Show> findByMovieTownAndDate(String movieId, String town, String date) {
        List<Show> result =  showDB.values()
                .stream()
                .filter(s ->
                        s.getMovieId().equals(movieId) &&
                                s.getTown().equalsIgnoreCase(town) &&
                                s.getShowDate().equals(date))
                .collect(Collectors.toList());

        // If nothing found → return dummy data
        if (result.isEmpty()) {

            Show s1 = new Show();
            s1.setShowId("D1");
            s1.setMovieId(movieId);
            s1.setTheatreId("T1");
            s1.setTheatreName("PVR Forum");
            s1.setTown(town);
            s1.setShowDate(date);
            s1.setShowTime("18:30");

            Show s2 = new Show();
            s2.setShowId("D2");
            s2.setMovieId(movieId);
            s2.setTheatreId("T2");
            s2.setTheatreName("INOX Garuda");
            s2.setTown(town);
            s2.setShowDate(date);
            s2.setShowTime("21:15");

            return List.of(s1, s2);
        }
        return result;

    }
}