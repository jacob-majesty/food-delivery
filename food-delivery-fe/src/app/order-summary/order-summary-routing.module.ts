import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OrderSummaryComponent } from './components/order-summary.component';

const routes: Routes = [
  { path: 'orderSummary', component: OrderSummaryComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class OrderSummaryRoutingModule { }
