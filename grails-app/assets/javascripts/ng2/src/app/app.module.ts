import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {routing}        from './app.routing';

import { AppComponent } from './app.component';
import { SupplierComponent } from './supplier/supplier.component';



@NgModule({
  declarations: [
    AppComponent,
    SupplierComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    routing,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
