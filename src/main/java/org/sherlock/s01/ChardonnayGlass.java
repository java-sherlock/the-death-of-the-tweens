package org.sherlock.s01;

/**
 * @author Evgeny Borisov
 */
public class ChardonnayGlass implements WineGlass<WhiteWine> {
    @Override
    public WhiteWine getContent() {
        return new WhiteWine() {
            @Override
            public String toString() {
                return "Chardonnay...mmm... бульк бульк";
            }
        };
    }
}
