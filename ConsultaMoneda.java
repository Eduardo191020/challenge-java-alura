import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda tranformarMoneda(String tipoMoneda){
        URI direccion =URI.create("https://v6.exchangerate-api.com/v6/5ed89ba91f4aee6b88529424/latest/"+tipoMoneda);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response =client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);//transformar a json
        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un error.");
        }
    }
}
