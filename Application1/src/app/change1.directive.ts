import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appChange1]'
})
export class Change1Directive {

  constructor(element :ElementRef) {
    element.nativeElement.style.background='blue';
    element.nativeElement.innerText='Digital';
   }
     
     
}
