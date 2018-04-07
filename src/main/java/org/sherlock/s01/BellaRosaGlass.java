package org.sherlock.s01;

/**
 * @author Evgeny Borisov
 */
public class BellaRosaGlass implements WineGlass<Muscat> {
    @Override
    public Muscat getContent() {
        return new Muscat() {
            @Override
            public String toString() {
                return "Muscat...mmm... какая гадость, как это можно пить с рыбой...";
            }
        };
    }
}
