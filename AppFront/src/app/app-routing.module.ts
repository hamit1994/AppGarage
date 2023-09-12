import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarCreateComponent } from './car-create/car-create.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  {path: 'cars/car', component: CarCreateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
