package br.insper.aposta.partida;

import br.insper.loja.partida.dto.RetornarPartidaDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PartidaService {

    @Value("${partida.service.url}")
    private String partidaServiceUrl;

    public ResponseEntity<RetornarPartidaDTO> getPartida(Integer idPartida) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(
                partidaServiceUrl+idPartida,
                RetornarPartidaDTO.class);
    }

}
