package ru.maxim.horse.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import ru.maxim.horse.services.HorseService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HorseServlet extends HttpServlet {
    @Autowired
    private HorseService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String widthAsString = request.getParameter("width");
        String heightAsString = request.getParameter("height");
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        try {
            PrintWriter writer = response.getWriter();
            writer.write(String.valueOf(service.getCount(Integer.parseInt(widthAsString), Integer.parseInt(heightAsString), start, end)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
