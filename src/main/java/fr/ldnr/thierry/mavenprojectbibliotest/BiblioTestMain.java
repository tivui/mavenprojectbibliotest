/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.thierry.mavenprojectbibliotest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author stag
 */

@SpringBootApplication
public class BiblioTestMain {

    public static final Logger logger = LoggerFactory.getLogger(BiblioTestMain.class);

    public static void main(String[] args) {
        SpringApplication.run(BiblioTestMain.class, args);
        logger.info("Début de l'application biblio");
    }
    
}
