package gildedRose;

public class AgedUpdater extends Item{
    public AgedUpdater( int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void update() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
        setSellIn(getSellIn()-1);
        if (getSellIn() < 0 && getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }
}
