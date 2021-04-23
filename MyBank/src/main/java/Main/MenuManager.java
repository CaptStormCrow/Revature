package Main;

public class MenuManager {
    Menu[] menu = new Menu[9];
    Menu startingMenu;

    public void init() {
        Menu welcome = new Menu("Log In", "Sign Up");
        Menu sign_up = new Menu("")
    }

    public Menu[] getMenus(){
        return menu;
    }
    public void setMenus(Menu[] menus){
        this.menu = menus;
    }

    public Menu getStartingMenu(){
        return startingMenu;
    }

    public void setStartingMenu(Menu startingMenu){
        this.startingMenu = startingMenu;
    }
}
