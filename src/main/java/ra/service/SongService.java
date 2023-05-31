package ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Song;
import ra.repository.ISongRepository;

@Service
public class SongService implements ISongService {

    @Autowired
    private ISongRepository songRepository;
    @Override
    public void createUser(Song song) {
        songRepository.save(song);
    }
}
