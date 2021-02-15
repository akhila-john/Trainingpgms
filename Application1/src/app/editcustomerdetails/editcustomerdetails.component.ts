import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { ActivatedRoute} from '@angular/router';
@Component({
  selector: 'app-editcustomerdetails',
  templateUrl: './editcustomerdetails.component.html',
  styleUrls: ['./editcustomerdetails.component.css']
})
export class EditcustomerdetailsComponent implements OnInit {
id;
customerdata;
  constructor(private objCust:UserService,public router : ActivatedRoute) { }

  ngOnInit(): void {
    this.assignvaluetoid();
    this.loadcustomerdata();
  }

  assignvaluetoid() {
    this.router.params.subscribe(params => {
      this.id = params['id'];
    })
  }

  loadcustomerdata() {
    this.objCust.getsinglecustomerdetails(this.id).subscribe((data: any[]) => {
      console.log(data);
      this.customerdata = data;
    });
  }
  updatecustomerdata() {
    this.objCust.updatecustomerdetails(this.id, this.customerdata);
    alert(this.customerdata.name + "saved");
  }
}
