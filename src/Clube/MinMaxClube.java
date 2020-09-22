package Clube;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMaxClube {
    public static void main(String[] args) {


        Clube c1 = new Clube("Michael Jackson", 50, false, "Pop");
        Clube c2 = new Clube("Lil Peep", 21, false, "Trap");
        Clube c3 = new Clube("Amy Winehouse", 27, true, "Soul");
        Clube c4 = new Clube("Juice WRLD", 21, false, "Trap");
        Clube c5 = new Clube("Brian Jones", 27, true, "Rock");
        Clube c6 = new Clube("Jimi Hendrix", 27, true, "Blues-Rock");
        Clube c7 = new Clube("Janis Joplin", 27, true, "Blues-Rock");
        Clube c8 = new Clube("Avicii", 28, false, "Eletronica");
        Clube c9 = new Clube("Jim Morrison", 27, true, "Blues-Rock");
        Clube c10 = new Clube("Kurt Cobain", 27, true, "Rock alternativo");


        List<Clube> clube = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

        Comparator<Clube> maisVelho = (a1, a2) -> {
            if(a1.idadeMorte > a2.idadeMorte) return 1;
            if(a1.idadeMorte < a2.idadeMorte) return -1;
            return 0;
        };

        System.out.println(clube.stream().max(maisVelho).get());
        System.out.println(clube.stream().min(maisVelho).get());

    }
}
