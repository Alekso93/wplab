package mk.finki.ukim.mk.lab.repository.inmemory;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InMemoryAlbumRepository {
    public List<Album> findAll(){
        return DataHolder.albums;
    }
}
