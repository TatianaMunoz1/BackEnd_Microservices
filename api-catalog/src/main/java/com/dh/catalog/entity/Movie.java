package com.dh.catalog.entity;

import com.dh.catalog.entity.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "media_item")
public final class Movie extends Pattern {
    @MongoId
    private Integer id;
    private String name;
    private String genre;
    private String urlStream;

    public Movie(String name, String genre, String urlStream) {
        this.name = name;
        this.genre = genre;
        this.urlStream = urlStream;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", urlStream='" + urlStream + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id) && Objects.equals(name, movie.name) && Objects.equals(genre, movie.genre) && Objects.equals(urlStream, movie.urlStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, urlStream);
    }
}
