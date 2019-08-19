package gildeRose;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    @Test
    public void should_be_4_quality_when_invoke_updateQuality_given_a_item_quality_5(){
        Item[] items = {new Item("sssmmm",5,5)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(4,items[0].getQuality());
        assertEquals(4,items[0].getSellIn());
    }

    @Test
    public void should_be_7_quality_when_invoke_updateQuality_given_a_item_quality_5_name_Aged_Brie_sellIn_0(){
        Item[] items = {new Item("Aged Brie",0,5)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(7,items[0].getQuality());
        assertEquals(-1,items[0].getSellIn());
    }

    @Test
    public void should_be_7_quality_when_invoke_updateQuality_given_a_item_quality_55_name_Aged_Brie_sellIn_0(){
        Item[] items = {new Item("Aged Brie",0,55)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(55,items[0].getQuality());
        assertEquals(-1,items[0].getSellIn());
    }

    @Test
    public void should_be_0_quality_when_invoke_updateQuality_given_a_item_quality_5_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_0(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",0,5)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0,items[0].getQuality());
        assertEquals(-1,items[0].getSellIn());
    }

    @Test
    public void should_be_3_quality_when_invoke_updateQuality_given_a_item_quality_5_name_liam_sellIn_0(){
        Item[] items = {new Item("liam",0,5)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(3,items[0].getQuality());
        assertEquals(-1,items[0].getSellIn());
    }

    @Test
    public void should_be_0_quality_when_invoke_updateQuality_given_a_item_quality_0_name_liam_sellIn_0(){
        Item[] items = {new Item("liam",0,0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0,items[0].getQuality());
        assertEquals(-1,items[0].getSellIn());
    }

    @Test
    public void should_be_5_quality_when_invoke_updateQuality_given_a_item_quality_5_name_Sulfuras_Hand_of_Ragnaros_sellIn_5(){
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",5,5)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(5,items[0].getQuality());
        assertEquals(5,items[0].getSellIn());
    }

    @Test
    public void should_be_0_quality_when_invoke_updateQuality_given_a_item_quality_0_name_Sulfuras_Hand_of_Ragnaros_sellIn_5(){
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",5,0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(0,items[0].getQuality());
        assertEquals(5,items[0].getSellIn());
    }

    @Test
    public void should_be_5_quality_when_invoke_updateQuality_given_a_item_quality_5_name_Sulfuras_Hand_of_Ragnaros_sellIn_fu_1(){
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",-1,5)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(5,items[0].getQuality());
        assertEquals(-1,items[0].getSellIn());
    }

    @Test
    public void should_be_3_quality_when_invoke_updateQuality_given_a_item_quality_0_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_5(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",5,0)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(3,items[0].getQuality());
        assertEquals(4,items[0].getSellIn());
    }

    @Test
    public void should_be_50_quality_when_invoke_updateQuality_given_a_item_quality_49_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_5(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",5,49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50,items[0].getQuality());
        assertEquals(4,items[0].getSellIn());
    }

    @Test
    public void should_be_3_quality_when_invoke_updateQuality_given_a_item_quality_49_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_12(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",12,49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(50,items[0].getQuality());
        assertEquals(11,items[0].getSellIn());
    }

    @Test
    public void should_be_50_quality_when_invoke_updateQuality_given_a_item_quality_55_name_Backstage_passes_to_a_TAFKAL80ETC_concert_sellIn_5(){
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",5,55)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(55,items[0].getQuality());
        assertEquals(4,items[0].getSellIn());
    }



}
