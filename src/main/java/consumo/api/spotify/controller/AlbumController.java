package consumo.api.spotify.controller;


import consumo.api.spotify.client.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

    private final AuthSpotifyClient authSpotifyClient;

    private final AlbumSpotifyClient albumSpotifyClient;

    public AlbumController(AuthSpotifyClient authSpotifyClient, AlbumSpotifyClient albumSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
        this.albumSpotifyClient = albumSpotifyClient;
    }

    @GetMapping("/albums")
    public ResponseEntity<List<Album>> helloWorld(){
        var request = new LoginRequest(
            "client_credentials",
            "insira_seu_id",
            "insira_seu_secret_id"
        );

        var token = authSpotifyClient.login(request).getAccessToken();

        var response = albumSpotifyClient.getRealeases("Bearer " + token);

        return ResponseEntity.ok(response.getAlbums().getItems());
    }
}
