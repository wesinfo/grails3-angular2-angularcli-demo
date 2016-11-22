import {Routes, RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import {SupplierComponent} from './supplier/supplier.component';

const appRoutes:Routes = [
    {path:'',component:SupplierComponent}
];

export const routing = RouterModule.forRoot(appRoutes);
