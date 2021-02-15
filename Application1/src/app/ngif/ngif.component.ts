import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngif',
  templateUrl: './ngif.component.html',
  styleUrls: ['./ngif.component.css']
})
export class NgifComponent implements OnInit {
  isavailable :boolean =true;
  isavailables :boolean =true;
  isavailable1 :boolean =true;
  constructor() { }

  ngOnInit(): void {
  }
  showcontent(){
    // if(this.isavailable ==true){
    //   this.isavailable=false;
    // }
    // else{
    //   this.isavailable=true;
    // }
    this.isavailable ==true ? this.isavailable=false : this.isavailable = true;
  }
clickFunction(){
  this.isavailables ==true ? this.isavailables=false : this.isavailables= true;
}
clickOnFunction(){
  this.isavailable1 ==true ? this.isavailable1=false : this.isavailable1= true;
}
}