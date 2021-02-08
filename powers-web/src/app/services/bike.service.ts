import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
};
@Injectable({
  providedIn: 'root',
})
export class BikeService {
  constructor(private http: HttpClient) {}

  getBikes() {
    return this.http.get('/server/bikes');
  }
}