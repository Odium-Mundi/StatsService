package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumAllSale() {
        StatsService service = new StatsService();

        int[] sale = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 180;

        int actual = service.sumAllSale(sale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMean() {
        StatsService service = new StatsService();

        int[] sale = {8,15,13,15,17,20,19,20,7,14,14,18};
        int sum = service.sumAllSale(sale) ;
        int expected = 15;

        int actual = service.mean(sum, sale.length);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSale() {
        StatsService service = new StatsService();

        int[] sale = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 6;

        int actual = service.maxSale(sale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSale() {
        StatsService service = new StatsService();

        int[] sale = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 9;

        int actual = service.minSale(sale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinCountMounth() {
        StatsService service = new StatsService();

        int[] sale = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expected = 5;

        int actual = service.minCountMounth(sale);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxCountMounth() {
        StatsService service = new StatsService();

        int[] sale = {8,15,13,15,17,20,19,20,7,14,14,18}; //mean = 15;
        int expected = 5;

        int actual = service.maxCountMounth(sale);

        assertEquals(expected, actual);
    }
}
