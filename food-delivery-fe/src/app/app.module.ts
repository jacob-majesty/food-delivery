import { RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/components/header.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HeaderModule } from './header/header.module';

@NgModule({
  declarations: [],
  imports: [RouterModule, BrowserModule, HeaderComponent, AppComponent, HeaderModule],
  providers: [],
  bootstrap: []
})
export class AppModule {}