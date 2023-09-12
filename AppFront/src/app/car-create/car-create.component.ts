import { Component, OnInit } from '@angular/core';
import { GarageService } from '../garage.service';

@Component({
  selector: 'app-car-create',
  templateUrl: './car-create.component.html',
  styleUrls: ['./car-create.component.css']
})
export class CarCreateComponent implements OnInit {

  id! : number;
  brand! : string;
  model! : string;
  color! : number;
  year! : number;

  constructor(private garageService: GarageService) {
    
  }

  ngOnInit(): void {
    console.log('On init');
  }
  addCar(){
    var inputData = {
      id : this.id,
      brand : this.brand,
      model : this.model,
      color : this.color,
      year : this.year
    }

    this.garageService.saveCar(inputData).subscribe(
      () => this.ngOnInit(),
      (err: any) => console.log(err)
    )
  }
}
