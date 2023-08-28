package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    public List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
    return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType, Integer> result = new HashMap<>();
        //LAWD HELP ME

        for (Spice spice: spices){
            if (result.containsKey( (SpiceType) spice.getClass())){
                SpiceType spicy = (SpiceType) spice.getClass();
                result.replace(spicy, result.get(spicy), result.get(spicy) + 1);
            } else {
                SpiceType spicy = (SpiceType) spice.getClass();
                result.put(spicy, 1);
            }
        }

        return result;
    }

    public void applySpice(Spice spice) {
     spices.add( spice);
    }
}
