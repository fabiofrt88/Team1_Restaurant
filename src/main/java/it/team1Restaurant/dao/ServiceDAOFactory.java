package it.team1Restaurant.dao;

import it.team1Restaurant.service.DishService;
import it.team1Restaurant.service.DrinkService;
import it.team1Restaurant.service.IngredientService;
import it.team1Restaurant.service.MenuService;

public class ServiceDAOFactory {

    public static DishService getDishService(){
        DishDAO dishDAO = new DishDAO();
        return new DishService(dishDAO);
    }

    public static DrinkService getDrinkService(){
        DrinkDAO drinkDAO = new DrinkDAO();
        return new DrinkService(drinkDAO);
    }

    public static IngredientService getIngredientService(){
        IngredientDAO ingredientDAO = new IngredientDAO();
        return new IngredientService(ingredientDAO);
    }

    public static MenuService getMenuService(){
        MenuDAO menuDAO = new MenuDAO();
        return new MenuService(menuDAO);
    }

}
