import { Component, OnInit,Input,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit {
@Input() childvalue: string;
@Input() b;
@Output() myoutputvalue: EventEmitter<any> = new EventEmitter();
Outputmessage="am from child component";
  constructor() { }

  ngOnInit(): void {
    
  }
  //$event - fetching the emitted value
sendmessage($event) {
  
this.myoutputvalue.emit(this.Outputmessage);
}
}
