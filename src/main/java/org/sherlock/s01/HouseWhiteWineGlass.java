package org.sherlock.s01;

/**
 * @author Evgeny Borisov
 * @contains Frameworkitis
 */
public class HouseWhiteWineGlass implements WineGlass<WhiteWine> {
    @Override
    public WhiteWine getContent() {
        return new WhiteWine() {
            @Override
            public String toString() {
                return "Домашнее вино! Лучшее!...mmm... бульк бульк";
            }
        };
    }
}
