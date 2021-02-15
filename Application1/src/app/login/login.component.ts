import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
username;
password;
isavailable = false;
  constructor() { }

  ngOnInit(): void {
  }
  login(){
    if (this.username == "admin" && this.password == "admin") {
      return this.isavailable = true;
     }
     else {
      //return this.isavailable = false;
       alert("invalid credentials"+ this.username + this.password);
     }
  }
}
