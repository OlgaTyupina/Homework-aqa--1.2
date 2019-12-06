package ru.netology;

import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();

        {
            System.out.println("It should return 100 if amount 900");
            int result = service.remain(900);
            System.out.println(100 == result);
        }

        {
            System.out.println("It should return 0 if amount 1000");
            int result = service.remain(1000);
            System.out.println(0 == result);
        }

    }
}
