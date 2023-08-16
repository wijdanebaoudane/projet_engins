package com.example.demo;

import com.example.demo.entities.Utilisateur;
import com.example.demo.repositorie.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

    }
    @Bean
   CommandLineRunner start(UtilisateurRepository utilisateurRepository,
                           ComposantsRepository composantsRepository,
                           DemandeRepository demandeRepository,
                           EnginsRepository enginsRepository,
                           FamilleRepository familleRepository
                           ){
        return  args -> {
            Stream.of("wijdane","hajr","chaimae").forEach(name_us->{
                Utilisateur utilisateur=new Utilisateur();
                utilisateur.SetName(name_us );
                utilisateurRepository.save(utilisateur);

            });

        };
   }
}
