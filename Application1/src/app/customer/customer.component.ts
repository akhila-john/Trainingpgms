import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import {Customer} from '../customer';
import {Router} from '@angular/router';
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
customerdata;
obj_c: Customer = new Customer();

  constructor(private objuser:UserService,public router : Router) { }

  ngOnInit(): void {
    this.getallcustomerdeatils();
  }

  getallcustomerdeatils(){
    this.objuser.getcustomerDetails().subscribe((data) => {
      console.log(data);
      this.customerdata = data;
    });
}
SaveCustomerdata(){
  this.objuser.postcustomerdetails(this.obj_c).subscribe(
    (data : Customer) =>
    console.log(data)
  );
  alert(this.obj_c.name + " details saved successfully")
  this.getallcustomerdeatils();
}
//remove or delete data
deletecustomerdetails(id){
  if(confirm("Are you sure to delete")){
    this.objuser.deletecustomerdetails(id);
    this.getallcustomerdeatils();
  }}

  loadnewcomponent(id){
    //alert(id);
    this.router.navigate(['/Ed',id]);
    }
}