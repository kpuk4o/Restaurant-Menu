package restaurant;

public class MenuItem {
    //Class Variables -first have to initialize them
    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;

    //Constructors to build instances of menu items
        //Just the important info
    public MenuItem(String name, String description, Double price) {
        //access class variables with .this
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }
    //second constructor that takes important info as well as optional info
    // allows later to add all the info
    public MenuItem(String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = category;
        this.isNew = isNew;
    }

    //Methods
    // Getters and Setters to access and mutate the class variables since they are private
    public String getName() { return this.name; } //create a getter that returns a string

    public void setName(String name) { this.name = name; } //create a setter that passes a name as a parameter

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Double getPrice() { return this.price; }
    public void setPrice(Double price) { this.price = price; }

    public String getCategory() { return this.category; }
    public void setCategory(String category) { this.description = category; }

    public Boolean getIsNew() { return this.isNew; }
    public void getIsNew(Boolean isNew) { this.isNew = isNew; }
}

//Create restaurant.Menu