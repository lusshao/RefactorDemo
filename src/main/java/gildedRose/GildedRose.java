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

        switch (item.getName()) {
            case "Aged Brie":
                item.updateAged();
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                item.updateBackstage();
                return;

            case "Sulfuras, Hand of Ragnaros":
                return;
            default:
                if (item.getQuality() > 0) {
                    item.setQuality(item.getQuality() - 1);
                }
                item.setSellIn(item.getSellIn()-1);
                if (item.getSellIn() < 0 && item.getQuality() > 0) {
                        item.setQuality(item.getQuality() - 1);
                }
                return;
        }
    }
}