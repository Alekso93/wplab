package mk.finki.ukim.mk.lab.repository.inmemory;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Album;

import java.util.List;

public class InMemoryAlbumRepository {
    public List<Album> findAll(){
        return DataHolder.albums;
    }
}
