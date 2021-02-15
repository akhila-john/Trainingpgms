import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
@Component({
  selector: 'app-registrationdetails',
  templateUrl: './registrationdetails.component.html',
  styleUrls: ['./registrationdetails.component.css']
})
export class RegistrationdetailsComponent implements OnInit {
name: string;
angForm: FormGroup;
  constructor(private fb: FormBuilder) { 
    this.createForm();
  }

  ngOnInit(): void {
  }
  
submitdata(){
   if (this.angForm.status === 'VALID') {
     alert("saved successfully");
  }
   else {
     alert("kindly fill the required details")
  }
}

  createForm(){
    this.angForm = this.fb.group({
name: ['', [Validators.required, Validators.minLength(3)]],
email: ['', [Validators.required, Validators.email]],
address: ['', [Validators.required, Validators.minLength(3)]],
phone: ['', [Validators.required, Validators.minLength(10)]],
 // validates date format yyyy-mm-dd
 dob: ['', [Validators.required, Validators.pattern(/^\d{4}\-(0[1-9]|1[012])\-(0[1-9]|[12][0-9]|3[01])$/)]],
 title: ['', Validators.required]
     });

}
}