package models;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FindCEP {

    public void searchCEP(String cep) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        String stringJson = response.body();

        FileWriter fw = new FileWriter("endereco.json");
        fw.write(stringJson);
        fw.close();

        JsonCEP jsonCEP = new JsonCEP();
        jsonCEP.convertToJson(stringJson);

    }
}
