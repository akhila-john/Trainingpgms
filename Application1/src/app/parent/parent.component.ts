import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
valuetochild = "using parent value in child";
a=100;
valuefromchild;
  constructor() { }

  ngOnInit(): void {
  }
receivevaluefromchild( $event){
  this.valuefromchild = $event;
}
}
