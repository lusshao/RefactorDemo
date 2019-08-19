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
                    item.quality = item.quality + 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    item.quality = item.quality - item.quality;
                }
                return;

            case "Sulfuras, Hand of Ragnaros":
                return;
            default:
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
                item.sellIn = item.sellIn - 1;
                if (item.sellIn < 0) {
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                }
                return;
        }
    }
}