public class Dog {
    int ID;
    String name;
    int ownersID;
    double tailsLength;
    String breed;
    int age;
    Owner owner;

    Dog() {
        this.ID = 0;
        this.name = "";
        this.ownersID = 0;
        this.tailsLength = 0;
        this.breed = "";
        this.age = 0;
        this.owner = new Owner();
    }

    Dog(int ID, String name, double tailsLength, String breed, int age, Owner owner) {
        this.ID = ID;
        this.name = name;
        this.ownersID = owner.getID();
        this.tailsLength = tailsLength;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnersID() {
        return ownersID;
    }

    public void setOwnersID(int ownersID) {
        this.ownersID = ownersID;
    }

    public double getTailsLength() {
        return tailsLength;
    }

    public void setTailsLength(double tailsLength) {
        this.tailsLength = tailsLength;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

