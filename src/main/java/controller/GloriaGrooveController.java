package controller;

import repository.GloriaGrooveRepository;

public class GloriaGrooveController {

    private GloriaGrooveRepository gloriaGrooveRepository;

    public void getMusic() {

        gloriaGrooveRepository.getTheBestMusic();

    }
}
