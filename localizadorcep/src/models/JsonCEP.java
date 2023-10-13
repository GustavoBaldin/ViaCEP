package models;

import com.google.gson.Gson;

public class JsonCEP {

    public void convertToJson(String stringJson) {
        Gson gson = new Gson();

        ViaCEP viaCEP = gson.fromJson(stringJson, ViaCEP.class);
        System.out.println(viaCEP);
    }
}
