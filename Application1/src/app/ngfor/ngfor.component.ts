import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  months = ["January", "Feburary", "March", "April", "May", 
  "June", "July", "August", "September",
  "October", "November", "December"];

  people: any[] = [
    {"name": "Douglas  Pace" ,"age" :"27"},
    { "name": "Mcleod  Mueller","age" :"27"},
    {"name": "Day  Meyers","age" :"27" },
    {"name": "Aguirre  Ellis","age" :"27"},
    {"name": "Cook  Tyson","age" :"27"}
  ];

  registartiondetails = [
    {id:1, name :"Quest", Place:"TVM", Phone :"997865"},
    {id:2, name :"Quest", Place:"TVM", Phone :"997865"},
    {id:3, name :"Quest", Place:"TVM", Phone :"997865"},
    {id:4, name :"Quest", Place:"TVM", Phone :"997865"},
    {id:5, name :"Quest", Place:"TVM", Phone :"997865"},
    {id:6, name :"Quest", Place:"TVM", Phone :"997865"},
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
