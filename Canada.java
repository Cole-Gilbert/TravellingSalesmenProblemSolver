public final class Canada {
    
    public final static State Alberta              = new State("AB", "Alberta");
    public final static State BritishColumbia      = new State("BC", "BritishColumbia");
    public final static State Manitoba             = new State("MB", "Manitoba");
    public final static State NewBrunswick         = new State("NB", "NewBrunswick");
    public final static State Newfoundland         = new State("NL", "Newfoundland");
    public final static State NorthwestTerritories = new State("NT", "NorthwestTerritories");
    public final static State NovaScotia           = new State("NS", "NovaScotia");
    public final static State NunavutTerritories   = new State("NU", "NunavutTerritories");
    public final static State Ontario              = new State("ON", "Ontario");
    public final static State PrinceEdwardIsland   = new State("PE", "PrinceEdwardIsland");
    public final static State Quebec               = new State("QC", "Quebec");
    public final static State Saskatchewan         = new State("SK", "Saskatchewan");
    public final static State Yukon                = new State("YT", "Yukon");
        
    // List of all the provinces.

    public final static State[] provinces = {
        Alberta,        BritishColumbia,        Manitoba,             NewBrunswick,
        Newfoundland,    NorthwestTerritories,     NovaScotia,            NunavutTerritories,
        Ontario,         PrinceEdwardIsland,        Quebec,                Saskatchewan,
        Yukon
    };

    // Abbreviations for the provinces.

    public final static State AB = Alberta;
    public final static State BC = BritishColumbia;
    public final static State MB = Manitoba;
    public final static State NB = NewBrunswick;
    public final static State NL = Newfoundland;
    public final static State NT = NorthwestTerritories;
    public final static State NS = NovaScotia;
    public final static State NU = NunavutTerritories;
    public final static State ON = Ontario;
    public final static State PE = PrinceEdwardIsland;
    public final static State QC = Quebec;
    public final static State SK = Saskatchewan;
    public final static State YT = Yukon;

    // Set the provincial capitals.

    static {
        capital(AB, "Edmonton",      54.5444, 113.4009);
        capital(BC, "Victoria",      48.4284, 123.3656);
        capital(MB, "Winnipeg",      49.8951,  97.1384);
        capital(NB, "Fredericton",   45.9636,  66.6421);
        capital(NL, "StJohns",       46.5615,  52.7126);
        capital(NT, "Yellowknife",   62.4540, 114.3718);
        capital(NS, "Halifax",       44.6488,  63.5752);
        capital(NU, "Iqaluit",       63.7467,  68.5170);
        capital(ON, "Toronto",       43.6532,  79.3832);
        capital(PE, "Charlottetown", 46.2382,  63.1311);
        capital(QC, "Quebec",        52.9399,  73.5491);
        capital(SK, "Regina",        50.4452, 104.6189);
        capital(YT, "Whitehorse",    60.7212, 135.0568);
    }

    public static State find(String name) {
        for (State province : provinces) {
            if (province.name().equals(name)) return province;
            if (province.code().equals(name)) return province;
        }
        return null;
    }

    private static void capital(State province, String name, double longitude, double latitude) {
        province.capital(new City(name, province, longitude, latitude));
    }
}
