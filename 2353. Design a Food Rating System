import java.util.*;

class Food {
    String name;
    String cuisine;
    int rating;
    Food(String n, String c, int r) {
        name = n;
        cuisine = c;
        rating = r;
    }
}

class FoodRatings {
    private Map<String, Food> foodToFood;
    private Map<String, TreeSet<Food>> cuisineToFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToFood = new HashMap<>();
        cuisineToFoods = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            Food f = new Food(foods[i], cuisines[i], ratings[i]);
            foodToFood.put(foods[i], f);
            cuisineToFoods
                .computeIfAbsent(cuisines[i], k -> new TreeSet<>( (a, b) -> {
                    if (a.rating != b.rating) return Integer.compare(b.rating, a.rating);
                    return a.name.compareTo(b.name);
                }))
                .add(f);
        }
    }
    
    public void changeRating(String food, int newRating) {
        Food f = foodToFood.get(food);
        TreeSet<Food> set = cuisineToFoods.get(f.cuisine);
        set.remove(f);
        f.rating = newRating;
        set.add(f);
    }
    
    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first().name;
    }
}
