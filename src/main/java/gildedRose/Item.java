package gildedRose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void updateAged(){
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
        setSellIn(getSellIn()-1);
        if (getSellIn() < 0 && getQuality() < 50) {
            setQuality(getQuality() + 1);
        }
    }

    public void updateBackstage() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);
            if (getSellIn() < 11 && getQuality() < 50) {
                setQuality(getQuality() + 1);
            }
            if (getSellIn() < 6 && getQuality() < 50) {
                setQuality(getQuality() + 1);
            }
        }
        setSellIn(getSellIn()-1);
        if (getSellIn() < 0) {
            setQuality(0);
        }
    }

    public void updateNormal() {
        if (getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
        setSellIn(getSellIn()-1);
        if (getSellIn() < 0 && getQuality() > 0) {
            setQuality(getQuality() - 1);
        }
    }
}
