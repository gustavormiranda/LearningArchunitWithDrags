package service;

import java.util.List;

public class PablloVittarService {

    private PablloVittarRepository pablloVittarRepository;

    public String getTheBestMusic() {
        List<String> musics = pablloVittarRepository.getTheListOfMusic();

        return musics.get(0);
    }
}
