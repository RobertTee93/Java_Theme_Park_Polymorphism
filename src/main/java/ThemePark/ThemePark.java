package ThemePark;

import Attractions.Attraction;
import Attractions.Rollercoaster;
import Interfaces.IReviewed;
import Stalls.BeerStall;
import Stalls.Stall;

import java.util.ArrayList;
import java.util.BitSet;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private String name;

    public ThemePark( String name) {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int countAttractions() {
        return this.attractions.size();
    }

    public int countStalls(){
        return this.stalls.size();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        for (IReviewed attraction : this.attractions){
            reviewed.add(attraction);
        }
        for (IReviewed stall : this.stalls){
            reviewed.add(stall);
        }

        return reviewed;
    }
}
