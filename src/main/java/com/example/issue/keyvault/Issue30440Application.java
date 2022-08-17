package com.example.issue.keyvault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Issue30440Application implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Issue30440Application.class);

    @Value("${spring-datasource-url}")
    private String keyVaultSecretName;

    public static void main(String[] args) {
        SpringApplication.run(Issue30440Application.class, args);
    }

    public void run(String[] args) {
        LOGGER.info("property keyVaultSecretName in Azure Key Vault: {}", keyVaultSecretName);

        System.out.println("property keyVaultSecretName in Azure Key Vault: " + keyVaultSecretName);
    }
}
