package org.sherlock.s01;

/**
 * @author Evgeny Borisov
 */
public class Konstantin<Wine extends WhiteWine> extends Hendrix<Wine> {
    public Konstantin(WineGlass<Wine> content) {
        super(content);
    }
}
