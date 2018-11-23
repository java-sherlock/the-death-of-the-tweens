package org.sherlock.s01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class Configoff {

    @Bean
    @Qualifier("muscat")
    public WineGlass<Muscat> muscat(){
        return new BellaRosaGlass();
    }

    @Bean
    @Primary
    public WineGlass<WhiteWine> whiteWineGlass(){
        return new HouseWhiteWineGlass();
    }

    @Bean
    @Qualifier("muscat")
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
