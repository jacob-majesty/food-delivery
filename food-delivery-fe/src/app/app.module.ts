import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/components/header.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HeaderModule } from './header/header.module';
import { RestaurantListingModule } from './restaurant-listing/restaurant-listing.module';
import { HttpClientModule } from '@angular/common/http';
import { FoodCatalogueModule } from './food-catalogue/food-catalogue.module';

@NgModule({
  declarations: [],
  imports: [RouterModule, BrowserModule, HeaderComponent, AppComponent, HeaderModule, RestaurantListingModule, HttpClientModule,FoodCatalogueModule],
  providers: [],
  bootstrap: []
})
export class AppModule {}