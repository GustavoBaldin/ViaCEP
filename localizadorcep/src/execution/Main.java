package execution;

import models.FindCEP;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        FindCEP findCEP = new FindCEP();
        System.out.println("Digite um cep: ");
        String cep = in.nextLine();

        if(cep.length() != 8) {
            System.out.println("Você digitou um CEP inválido.");
        } else {
            findCEP.searchCEP(cep);
        }

    }
}