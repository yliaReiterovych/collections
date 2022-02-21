package Modul3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//import java.util.ArrayList;

public class Profit {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = profitInput();
        bestMonth(list);
        worstMonth(list);
    }

    public static ArrayList<Integer> profitInput() throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Ведіть прибуток компанії за рік ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 12; i++) {
            System.out.print(whichMonth(i) + ": ");
            String line = reader.readLine();
            int monthProfit = Integer.parseInt(line);
            list.add(monthProfit);
        }
        return list;
    }

    public static void bestMonth(ArrayList<Integer> list) {
        int bestMonth = list.get(0);
        int bestMonthIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > bestMonth) {
                bestMonth = list.get(i);
                bestMonthIndex = i;
            }
        }
        System.out.println("Найкращий місяць в році" + whichMonth(bestMonthIndex) + ", " + bestMonth + "грн");
    }

    public static void worstMonth(ArrayList<Integer> list) {
        int worstMonth = list.get(0);
        int worstMonthIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < worstMonth) {
                worstMonth = list.get(i);
                worstMonthIndex = i;
            }
        }
        System.out.println("Найгірший місяць в році" + whichMonth(worstMonthIndex) + ", " + worstMonth + "грн");
    }

    public static String whichMonth(int index) {
        String month = "";
        switch (index) {
            case 0:
                month = "січень";
                break;
            case 1:
                month = "лютий";
                break;
            case 2:
                month = "березень";
                break;
            case 3:
                month = "квітень";
                break;
            case 4:
                month = "травень";
                break;
            case 5:
                month = "червень";
                break;
            case 6:
                month = "липень";
                break;
            case 7:
                month = "серпень";
                break;
            case 8:
                month = "вересень";
                break;
            case 9:
                month = "жовтень";
                break;
            case 10:
                month = "листопад";
                break;
            case 11:
                month = "грудень";
                break;
        }
        return month;
    }
}