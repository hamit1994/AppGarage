import { Component, OnInit } from '@angular/core';
import { GarageService } from './garage.service';
import { HttpClientModule, HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers : [GarageService, HttpClient, HttpClientModule]
})

export class AppComponent implements OnInit {
  title = 'Bienvenue dans la gestion de la garage';
  cars : any = [];

  constructor(private garageService: GarageService) {
    
  }

  ngOnInit(): void {
    console.log('On init');
    this.garageService.getCars().subscribe((datas) => {
      this.cars = datas;
    });
  }

  removeCar(id: string) {
    this.garageService.removeCar(id).subscribe(
      () => this.ngOnInit(),
      (err: any) => console.log(err)
    );
  }
}


