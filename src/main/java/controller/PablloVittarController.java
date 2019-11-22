package controller;

import service.PablloVittarService;

public class PablloVittarController {

    private PablloVittarService pablloVittarService;

    public void getMusic() {

        pablloVittarService.getTheBestMusic();

    }
}
