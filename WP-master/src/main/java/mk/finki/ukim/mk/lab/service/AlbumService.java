package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.model.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    public List<Album> findAll();
    Optional<Album> findById(Long id);
}
