package ra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ra.model.Song;

@Repository
public interface ISongRepository extends CrudRepository<Song,Long> {
}