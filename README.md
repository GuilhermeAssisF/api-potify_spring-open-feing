# ApiSpotify_SpringOpenFeign

## Descrição
**ApiSpotify_SpringOpenFeign** é uma API desenvolvida em Java utilizando o framework Spring e a biblioteca OpenFeign para integração com a API do Spotify. Este projeto permite buscar informações de músicas, álbuns, artistas e playlists diretamente da plataforma Spotify, facilitando a criação de serviços baseados em música.

## Funcionalidades
- Consultar informações sobre músicas e álbuns.
- Buscar detalhes de artistas e playlists.
- Integrar de forma eficiente com a API oficial do Spotify utilizando Feign para simplificar as chamadas HTTP.

![Captura de tela 2024-11-12 175327](https://github.com/user-attachments/assets/72d420ce-0bfd-411a-9110-61be7a0ae8fc)

## Tecnologias Utilizadas
- **Java**: Linguagem principal de desenvolvimento.
- **Spring Boot**: Framework para criar aplicações web robustas.
- **OpenFeign**: Biblioteca para simplificar a comunicação HTTP e consumir APIs REST.
- **Spotify API**: Serviço externo para acessar dados de músicas, álbuns, playlists e artistas.

## Pré-requisitos
- **Java 11** ou superior
- **Maven** para gerenciamento de dependências
- Conta de **desenvolvedor no Spotify** para obter as credenciais de autenticação (Client ID e Client Secret)

## Instalação e Configuração
Clone o repositório com o comando `git clone https://github.com/GuilhermeAssisF/ApiSpotify_SpringOpenFeign.git` e navegue até o diretório do projeto usando `cd ApiSpotify_SpringOpenFeign`. Em seguida, configure suas credenciais da API do Spotify no arquivo `application.properties`, adicionando `spotify.client.id=SEU_CLIENT_ID` e `spotify.client.secret=SEU_CLIENT_SECRET`. Depois, compile e execute a aplicação com o comando `mvn spring-boot:run`.

## Uso
Após iniciar a aplicação, use um cliente HTTP (como Postman) ou um navegador para testar as endpoints da API. Exemplos de endpoints:
- `/api/spotify/artists/{id}`
- `/api/spotify/albums/{id}`
- `/api/spotify/playlists/{id}`

Exemplo de Requisição:
```http
GET http://localhost:8080/api/spotify/albums/1vANZV20H5B4Fk6yf7Ot9a
