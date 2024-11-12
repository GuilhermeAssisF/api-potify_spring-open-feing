package consumo.api.spotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Album {

    private String id;
    private String name;
    private String release_date;

    public Album() {
    }

    public Album(String id, String name, String realeaseDate) {
        this.id = id;
        this.name = name;
        this.release_date = realeaseDate;
    }

    public String getRealeaseDate() {
        return release_date;
    }

    public void setRealeaseDate(String realeaseDate) {
        this.release_date = realeaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
