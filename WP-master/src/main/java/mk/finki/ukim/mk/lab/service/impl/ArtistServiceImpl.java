package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Artist;
import mk.finki.ukim.mk.lab.model.Song;
import mk.finki.ukim.mk.lab.repository.inmemory.InMemoryArtistRepository;
import mk.finki.ukim.mk.lab.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {
    public final InMemoryArtistRepository inMemoryArtistRepository;

    public ArtistServiceImpl(InMemoryArtistRepository inMemoryArtistRepository) {
        this.inMemoryArtistRepository = inMemoryArtistRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return inMemoryArtistRepository.findAll();
    }

    @Override
    public Artist ArtistfindById(Long id) {
        return inMemoryArtistRepository.findById(id).orElse(null);
    }

    @Override
    public Song addSongToArtist(Artist artist, Song song) {
        inMemoryArtistRepository.addSongToArtist(artist, song);
        return song;
    }
}
