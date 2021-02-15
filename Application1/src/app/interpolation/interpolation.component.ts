import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interpolation',
  templateUrl: './interpolation.component.html',
  styleUrls: ['./interpolation.component.css']
})
export class InterpolationComponent implements OnInit {
name = "quest";
age = 5;
name1 : string ="quest1";
age1 : number = 20; 
name2 = "ANNA";
isdisabled : boolean = false;
months = ["Jan", "Feb", "Mar", "April", "May", "Jun",
             "July", "Aug", "Sept", "Oct", "Nov", "Dec"];
             mycolor={'color': 'red','font-weight':'bold'};
  constructor() { }

  ngOnInit(): void {
  }
hello() {
  return "hello"+this.name2;
}
cancel() {
this.name1="my worrrllddd";
}
}
