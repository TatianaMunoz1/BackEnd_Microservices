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
@Document(collection = "seasons")
public class Season {
    @MongoId
    private String id;
    private Byte seasonNumber;
    private List<Chapter> chapters;

    public Season(Byte seasonNumber, List<Chapter> chapters) {
        this.seasonNumber = seasonNumber;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Season{" +
                "id='" + id + '\'' +
                ", seasonNumber=" + seasonNumber +
                ", chapters=" + chapters +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Season)) return false;
        Season season = (Season) o;
        return Objects.equals(id, season.id) && Objects.equals(seasonNumber, season.seasonNumber) && Objects.equals(chapters, season.chapters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seasonNumber, chapters);
    }
}
