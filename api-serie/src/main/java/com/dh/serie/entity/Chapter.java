package com.dh.serie.entity;

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
@Document(collection = "chapters")
public class Chapter {
    @MongoId
    private String id;
    private String name;
    private Short number;
    private String urlStream;

    public Chapter(String name, Short number, String urlStream) {
        this.name = name;
        this.number = number;
        this.urlStream = urlStream;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", urlStream='" + urlStream + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chapter)) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(id, chapter.id) && Objects.equals(name, chapter.name) && Objects.equals(number, chapter.number) && Objects.equals(urlStream, chapter.urlStream);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, number, urlStream);
    }
}
