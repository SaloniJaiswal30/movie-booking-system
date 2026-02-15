package com.example.booking.controller;

import com.example.booking.model.Show;
import com.example.booking.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    // 1️⃣ Browse theatres running a movie in town by date
    @GetMapping("/browse")
    public List<Show> browseShows(
            @RequestParam String movieId,
            @RequestParam String town,
            @RequestParam String date) {

        return showService.browseShows(movieId, town, date);
    }

    // 2️⃣ Theatre creates show
    @PostMapping
    public String createShow(@RequestBody Show show) {
        showService.createShow(show);
        return "Show created successfully";
    }

    // 3️⃣ Theatre updates show
    @PutMapping("/{showId}")
    public Show updateShow(
            @PathVariable String showId,
            @RequestBody Show show) {

        return showService.updateShow(showId, show);
    }

    // 4️⃣ Theatre deletes show
    @DeleteMapping("/{showId}")
    public String deleteShow(@PathVariable String showId) {
        showService.deleteShow(showId);
        return "Show deleted";
    }
}