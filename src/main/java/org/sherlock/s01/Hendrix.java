package org.sherlock.s01;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author Evgeny Borisov
 */
@NoArgsConstructor
@AllArgsConstructor
public class Hendrix<Wine> {

    @Autowired
    private WineGlass<Wine> content;


    @EventListener(ContextRefreshedEvent.class)
    public void drink() {
        System.out.println(getClass().getSimpleName()+ " is drinking "+content.getContent());
    }

}
