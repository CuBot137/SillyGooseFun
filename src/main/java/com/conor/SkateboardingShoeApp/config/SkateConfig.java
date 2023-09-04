package com.conor.SkateboardingShoeApp.config;

import com.conor.SkateboardingShoeApp.model.SkateModel;
import com.conor.SkateboardingShoeApp.repository.SkateRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SkateConfig {
    private final SkateRepo skateRepo;

    public SkateConfig(SkateRepo skateRepo) {
        this.skateRepo = skateRepo;
    }

    @Bean
    CommandLineRunner commandLineRunner(SkateRepo skateRepo) {
        return args -> {
            SkateModel sk1 = new SkateModel(
                    "VANS ZAHBA MID BEATRICE DOMOND SHOES (DARK OLIVE)",
                    "Vans"
            );

            skateRepo.saveAll(List.of(sk1));

        };

    };
}
