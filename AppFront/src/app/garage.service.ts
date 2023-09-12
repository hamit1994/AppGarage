import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class GarageService {

  readonly API_URL = 'http://localhost:8080';

  readonly ENDPOINT_CARS = "/cars"
  readonly ENDPOINT_DELETE = "/car/"

  constructor(private httpClient : HttpClient) { }

  getCars() {
    return this.httpClient.get(this.API_URL + this.ENDPOINT_CARS);
  }

  removeCar(id: string){
    return this.httpClient.delete(this.API_URL + this.ENDPOINT_DELETE + id);
  }

  saveCar(inputData: Object){
    return this.httpClient.post(this.API_URL + this.ENDPOINT_CARS, inputData)
  }
}
