import { FoodItem } from "../../shared/models/FoodItems";
import { Restaurant } from "../../shared/models/Restaurant";


export interface OrderDtO{

    foodItemsList?: FoodItem[];
    userId?: number;
    restaurant?: Restaurant;
}