package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;


    // Constructors
    // we don't need to take any parameters bc we may or may not have any menu items
    public Menu() {
        this.lastUpdated = new Date();
    }

    // Methods
    //Getters and Setters
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }
    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

}
