package com.gildedrose;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GildedRoseTest {

    @Test
    public void testUpdateItems() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(out);

        GildedRose.setItems(ITEMS);
        updateAndPrint(ps);

        assertThat(out.toString(), is(EXPECTED_OUTPUT));
    }

    private static void updateAndPrint(PrintStream ps) {
        for (int i = 0; i < 10; i++) {
            GildedRose.updateQuality();
            GildedRose.printItems(ps);
        }
    }

    private static final List<Item> ITEMS = asList(new Item("+5 Dexterity Vest", 10, 20),
            new Item("Aged Brie", 2, 0),
            new Item("Elixir of the Mongoose", 5, 7),
            new Item("Sulfuras, Hand of Ragnaros", 0, 80),
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            new Item("Conjured Mana Cake", 3, 6));

    private static final String EXPECTED_OUTPUT = "+5 Dexterity Vest, 9, 19\n" +
            "Aged Brie, 1, 1\n" +
            "Elixir of the Mongoose, 4, 6\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
            "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
            "Conjured Mana Cake, 2, 5\n" +
            "\n" +
            "+5 Dexterity Vest, 8, 18\n" +
            "Aged Brie, 0, 2\n" +
            "Elixir of the Mongoose, 3, 5\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 13, 22\n" +
            "Backstage passes to a TAFKAL80ETC concert, 8, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, 3, 50\n" +
            "Conjured Mana Cake, 1, 4\n" +
            "\n" +
            "+5 Dexterity Vest, 7, 17\n" +
            "Aged Brie, -1, 4\n" +
            "Elixir of the Mongoose, 2, 4\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 12, 23\n" +
            "Backstage passes to a TAFKAL80ETC concert, 7, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, 2, 50\n" +
            "Conjured Mana Cake, 0, 3\n" +
            "\n" +
            "+5 Dexterity Vest, 6, 16\n" +
            "Aged Brie, -2, 6\n" +
            "Elixir of the Mongoose, 1, 3\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 11, 24\n" +
            "Backstage passes to a TAFKAL80ETC concert, 6, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, 1, 50\n" +
            "Conjured Mana Cake, -1, 1\n" +
            "\n" +
            "+5 Dexterity Vest, 5, 15\n" +
            "Aged Brie, -3, 8\n" +
            "Elixir of the Mongoose, 0, 2\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 10, 25\n" +
            "Backstage passes to a TAFKAL80ETC concert, 5, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, 0, 50\n" +
            "Conjured Mana Cake, -2, 0\n" +
            "\n" +
            "+5 Dexterity Vest, 4, 14\n" +
            "Aged Brie, -4, 10\n" +
            "Elixir of the Mongoose, -1, 0\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 9, 27\n" +
            "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, -1, 0\n" +
            "Conjured Mana Cake, -3, 0\n" +
            "\n" +
            "+5 Dexterity Vest, 3, 13\n" +
            "Aged Brie, -5, 12\n" +
            "Elixir of the Mongoose, -2, 0\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 8, 29\n" +
            "Backstage passes to a TAFKAL80ETC concert, 3, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, -2, 0\n" +
            "Conjured Mana Cake, -4, 0\n" +
            "\n" +
            "+5 Dexterity Vest, 2, 12\n" +
            "Aged Brie, -6, 14\n" +
            "Elixir of the Mongoose, -3, 0\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 7, 31\n" +
            "Backstage passes to a TAFKAL80ETC concert, 2, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, -3, 0\n" +
            "Conjured Mana Cake, -5, 0\n" +
            "\n" +
            "+5 Dexterity Vest, 1, 11\n" +
            "Aged Brie, -7, 16\n" +
            "Elixir of the Mongoose, -4, 0\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 6, 33\n" +
            "Backstage passes to a TAFKAL80ETC concert, 1, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, -4, 0\n" +
            "Conjured Mana Cake, -6, 0\n" +
            "\n" +
            "+5 Dexterity Vest, 0, 10\n" +
            "Aged Brie, -8, 18\n" +
            "Elixir of the Mongoose, -5, 0\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 5, 35\n" +
            "Backstage passes to a TAFKAL80ETC concert, 0, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, -5, 0\n" +
            "Conjured Mana Cake, -7, 0\n" +
            "\n";

    public static void main(String[] args) {
        GildedRose.setItems(ITEMS);
        updateAndPrint(System.out);
    }

}
