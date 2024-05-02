package com.apiconsumer.viaCEP;

import com.apiconsumer.viaCEP.model.Address;
import com.apiconsumer.viaCEP.service.ViaCepService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ViaCepApplication {

    public static void main(String[] args) {

        ViaCepService viaCepService = new ViaCepService();

        try {
            Address address = viaCepService.getAddress("01001000");

            System.out.println(address);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
