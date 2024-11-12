package consumo.api.spotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(
        name = "AlbumSpotifyClient",
        url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {

    @GetMapping(value = "/v1/browse/new-releases")
    AlbumResponse getRealeases(@RequestHeader("Authorization") String authorization);

}
