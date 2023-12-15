package pgdp.adventuin;

import java.util.*;

public final class AdventuinParty {

    public static Map<HatType, List<Adventuin>> groupByHatType(List<Adventuin> adventuins) {
        Map<HatType, List<Adventuin>> res = new HashMap<>();
        List<HatType> distHats = new ArrayList<>();

        adventuins.forEach(x -> distHats.add(x.getHatType()));
        distHats.stream().distinct();

        distHats.forEach(x -> {
            List<Adventuin> byHats = new ArrayList<>();
            adventuins.stream().forEach(a -> {
                if (x.equals(a.getHatType()) ) {
                    byHats.add(a);
                }
            });
        });
        return res;
    }


    public static String getLocalizedChristmasGreeting(Adventuin name) {
        return name.getLanguage().getLocalizedChristmasGreeting(name.getName());
    }

    public static void printLocalizedChristmasGreetings(List<Adventuin> adventuin) {
        adventuin.stream().sorted(Comparator.comparing(Adventuin::getHeight)).
                forEach(a -> System.out.println(getLocalizedChristmasGreeting(a)));
    }
}