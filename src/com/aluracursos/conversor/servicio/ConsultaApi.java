package com.aluracursos.conversor.servicio;

import com.aluracursos.conversor.modelos.MonedaRecord;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaApi {
    private final String API_KEI = "ab702fbaeed5c032e6ff8823";
    private final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public MonedaRecord buscarTasas(String monedaBase){
        URI direccion = URI.create(BASE_URL + API_KEI + "/latest/" + monedaBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .GET()
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                System.out.println("Error de conexión o API: Código " + response.statusCode());
                return null;
            }
            return new Gson().fromJson(response.body(), MonedaRecord.class);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error al obtener la respuesta de la API: " + e.getMessage());
        } return null;
    }
}
