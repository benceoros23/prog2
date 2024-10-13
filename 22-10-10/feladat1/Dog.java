public class Dog {
    private final String name;
    private final String breed;
    private final String gender;
    private final double weight;

    public Dog(String name,String breed, String gender,  double weight) {
        this.name = name;
        this.breed = breed;
        this.gender = gender.toLowerCase();
        this.weight = weight;
    }

    

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public int compareWeight(Dog otherDog) {
        if (this.weight < otherDog.weight) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return String.format("Dog(%s (%s), %s, %.1fkg)", name, breed, gender, weight);

    }

    

    
}
