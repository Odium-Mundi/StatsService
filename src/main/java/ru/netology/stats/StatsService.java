package ru.netology.stats;

public class StatsService {
    public int sumAllSale(int[] allSale) {
        int sum = 0;
        for (int sale: allSale) {
            sum += sale;
        }
        mean(sum, allSale.length);
        return sum;
    }

   public int mean(int sum, int length)
        {
        return sum/length;
    }

    public int maxSale(int[] allSale) {
        int currentMax = allSale[0];
        int numberMounth = 0;
        for (int i =0; i< allSale.length; i++) {
            if (currentMax < allSale[i]) {
                currentMax = allSale[i];
                numberMounth = i +1;

            }

        }
        return numberMounth;
    }

     public int minSale(int[] allSale) { //чем отл эта запись от maxSale?
        int currentMin = allSale[0];
        int numberMounth = 0;
        for (int i = 0; i < allSale.length; i++) {
            if (currentMin > allSale[i]) {
                currentMin = allSale[i];
                numberMounth = i + 1;
            }

        }
        return numberMounth;
    }


    public  int minCountMounth(int[] allSale) {
        int count = 0;
        for (int i = 0; i < allSale.length; i++) {
            if (mean(sumAllSale(allSale), allSale.length) < allSale[i]) {
                count += 1;
            }
        }
        return count;
    }

    public  int maxCountMounth(int[] allSale) {
        int count = 0;
        for (int i = 0; i < allSale.length; i++) {
            if (mean(sumAllSale(allSale), allSale.length) > allSale[i]) {
                count += 1;
            }
        }
        return count;
    }



}

