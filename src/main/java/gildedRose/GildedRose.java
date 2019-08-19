package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
        }
    }

    private void updateItemQuality(Item item) {

        switch (item.name) {
            case "Aged Brie":
                if (item.quality < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
                item.setSellIn(item.getSellIn()-1);
                if (item.sellIn < 0 && item.quality < 50) {
                        item.setQuality(item.getQuality() + 1);
                }
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                if (item.quality < 50) {
                    item.setQuality(item.getQuality() + 1);
                    if (item.sellIn < 11 && item.quality < 50) {
                            item.setQuality(item.getQuality() + 1);
                    }
                    if (item.sellIn < 6 && item.quality < 50) {
                            item.setQuality(item.getQuality() + 1);
                    }
                }
                item.setSellIn(item.getSellIn()-1);
                if (item.sellIn < 0) {
                    item.setQuality(0);
                }
                return;

            case "Sulfuras, Hand of Ragnaros":
                return;
            default:
                if (item.quality > 0) {
                    item.setQuality(item.getQuality() - 1);
                }
                item.setSellIn(item.getSellIn()-1);
                if (item.sellIn < 0 && item.quality > 0) {
                        item.setQuality(item.getQuality() - 1);
                }
                return;
        }
    }

}