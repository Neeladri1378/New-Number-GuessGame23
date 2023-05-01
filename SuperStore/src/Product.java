public class Product {
    private String name;
    private String rarity;
    private int cost;

    public Product(String name, String rarity, int cost) {
        this.name = name;
        this.rarity = rarity;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public String getRarity() {
        return this.rarity;
    }

    public int getCost() {
        return this.cost;
    }
}
public class OldProduct extends Product {
    private String oldField;

    public OldProduct(String name, String rarity, int cost, String oldField) {
        super(name, rarity, cost);
        this.oldField = oldField;
    }

    public String getOldField() {
        return this.oldField;
    }
}
    
 public class FullartProduct extends Product {
    private String fullartField;

    public FullartProduct(String name, String rarity, int cost, String fullartField) {
        super(name, rarity, cost);
        this.fullartField = fullartField;
    }

    public String getFullartField() {
        return this.fullartField;
    }
}
    
    public class HoloRareProduct extends Product {
    
        private String holoRareField;
    
        public HoloRareProduct(String name, String rarity, int cost, String holoRareField) {
            super(name, rarity, cost);
            this.holoRareField = holoRareField;
        }
    
        public String getHoloRareField() {
            return this.holoRareField;
        }
    
   
    // Creating objects of OldProduct class
   /* products.add(new OldProduct("Flareon Base 1st Edition", "Old", 2000, "SomeOldField"));
    products.add(new OldProduct("Aerodactyl", "Old", 40, "SomeOldField"));
    products.add(new OldProduct("Vaporeon", "Old", 4, "SomeOldField"));
    products.add(new OldProduct("Pikachu Base Edition", "Old", 1000, "SomeOldField"));
    products.add(new OldProduct("Base Edition Mewtoo", "Old", 1500, "SomeOldField"));
    
    // Creating objects of FullartProduct class
    products.add(new FullartProduct("Zenith Pikachu", "Fullart", 100, "SomeFullartField"));
    products.add(new FullartProduct("Brilliant Stars Charizard", "Fullart", 100, "SomeFullartField"));
    products.add(new FullartProduct("PSA 10 Rosa", "Fullart", 1000, "SomeFullartField"));
    products.add(new FullartProduct("Pop 1 Misty", "Fullart", 10000, "SomeFullartField"));
    products.add(new FullartProduct("Giovanni Scheme", "Fullart", 100, "SomeFullartField"));
    
    // Creating objects of HoloRareProduct class
    products.add(new HoloRareProduct("Voltarion", "Holo Rare", 5000, "SomeHoloRareField"));
    products.add(new HoloRareProduct("Xyerneus", "Holo Rare", 1000, "SomeHoloRareField"));
    products.add(new HoloRareProduct("White Kyrius", "Holo Rare", 3500, "SomeHoloRareField"));
    
    
    */
    
} 
    
    
    

