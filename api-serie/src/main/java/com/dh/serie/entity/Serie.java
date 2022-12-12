package com.dh.serie.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


import java.util.List;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "series")
public class Serie {
    @MongoId
    private String id;
    private String name;
    private String genre;
    private List<Season> seasons;

    public Serie(String name, String genre, List<Season> seasons) {
        this.name = name;
        this.genre = genre;
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", seasons=" + seasons +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return Objects.equals(id, serie.id) && Objects.equals(name, serie.name) && Objects.equals(genre, serie.genre) && Objects.equals(seasons, serie.seasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, seasons);
    }
}
