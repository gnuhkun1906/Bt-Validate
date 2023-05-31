package ra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Max(800)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String songName;
    @NotBlank
    @Max(300)
    @Pattern(regexp = "^[a-zA-Z0-9]*$")
    private String artist;
    @NotBlank
    @Max(1000)
    @Pattern(regexp = "^[a-zA-Z0-9\\\\s,]*$")
    private String kindOfMusic;

    public Song() {
    }

    public Song(Long id, String songName, String artist, String kindOfMusic) {
        this.id = id;
        this.songName = songName;
        this.artist = artist;
        this.kindOfMusic = kindOfMusic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }
}
