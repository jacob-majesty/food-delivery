import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RestaurantListingRoutingModule } from './restaurant-listing-routing.module';
import { RestaurantListingComponent } from './components/restaurant-listing.component';



@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RestaurantListingRoutingModule,
    RestaurantListingComponent
  ],
  exports: [
      RestaurantListingComponent
    ]
})
export class RestaurantListingModule { }
