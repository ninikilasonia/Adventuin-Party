package pgdp.adventuin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}