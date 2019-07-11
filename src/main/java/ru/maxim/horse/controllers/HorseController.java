package ru.maxim.horse.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.maxim.horse.services.HorseService;

@RestController
public class HorseController {
    @Autowired
    private HorseService horseService;

    @GetMapping("/horse/rest/count")
    public int getCount(@RequestParam("width") int width,
                        @RequestParam("height") int height,
                        @RequestParam("start") String start,
                        @RequestParam("end") String end) {
        return horseService.getCount(width, height, start, end);
    }
}
