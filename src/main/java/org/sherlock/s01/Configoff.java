package org.sherlock.s01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class Configoff {

    @Bean
    public WineGlass<Muscat> muscat(){
        return new BellaRosaGlass();
    }

    @Bean
    @Primary
    public WineGlass<WhiteWine> whiteWineGlass(){
        return new ChardonnayGlass();
    }
    @Bean
    public Konstantin<Muscat> konstantin(){
        return new Konstantin<>(muscat());
    }

    @Bean
    public Eugine<WhiteWine> eugine(){
        return new Eugine<>();
    }

    @Bean
    public Dinner dinner(){
        return new Fish();
    }

    public static void main(String[] args) {
        SpringApplication.run(Configoff.class);
    }


}
