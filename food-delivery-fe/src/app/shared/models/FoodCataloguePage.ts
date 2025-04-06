import { FoodItem } from "./FoodItems";
import { Restaurant } from "./Restaurant";

export interface FoodCataloguePage{
    foodItemsList:FoodItem[];
    restaurant:Restaurant | null;
}