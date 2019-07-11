package ru.maxim.horse.services;

import org.springframework.stereotype.Service;
import ru.maxim.horse.services.utils.*;


@Service
public class HorseServiceWithLeeAlg implements HorseService {
    @Override
    public int getCount(int width, int height, String start, String end) {
        Chessboard chessboard = new Chessboard(width, height);
        Horse horse = new Horse(start, chessboard);
        EndSquare endSquare = new EndSquare(end, chessboard);
        return CountSteps.count(horse, endSquare);
    }
}
