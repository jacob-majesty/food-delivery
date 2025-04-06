import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderRoutingModule } from './header-routing.module';
import { HeaderComponent } from './components/header.component';


@NgModule({
  declarations: [
    
  ],
  imports: [
    CommonModule,
    HeaderRoutingModule,
    HeaderComponent
  ],
  exports: [
    HeaderComponent
  ]
})
export class HeaderModule { }
