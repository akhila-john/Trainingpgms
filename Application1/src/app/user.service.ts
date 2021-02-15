import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Customer} from './customer';
@Injectable({
  providedIn: 'root'
})
export class UserService {
api_url = "https://jsonplaceholder.typicode.com/users";
api_customer = "http://localhost:3000/customer";

  constructor(private http: HttpClient) { }

  getuserdetails() {
    return this.http.get(this.api_url);
  }
  getcustomerDetails() {
    return this.http.get(this.api_customer);
  }

  public postcustomerdetails(obj_c: Customer): Observable<Customer> {
    return this.http.post<Customer>(this.api_customer, obj_c, {
      headers: new HttpHeaders({
        'content-Type': 'application/json'
      })
    });
  }
  public deletecustomerdetails(id: object) {
    this.http.delete(this.api_customer + id).subscribe(data => {
      console.log(data);
    });
  }
  public getsinglecustomerdetails(id: object) {
    return this.http.get(this.api_customer + id);
  }

  public updatecustomerdetails(id: object, updaterecords: object) {
     this.http.put(this.api_customer + id,updaterecords). subscribe(data => {
      console.log(data);
    });
  }
}