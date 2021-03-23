import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-editdetails',
  templateUrl: './editdetails.component.html',
  styleUrls: ['./editdetails.component.css']
})
export class EditdetailsComponent implements OnInit {
student_id;
userdata;
  constructor(private objUser:UserServiceService,public router :ActivatedRoute) { }

  ngOnInit(): void {
    this.assignvaluetoid();
  
  }
  assignvaluetoid(){
    this.router.params.subscribe(params => {
      this.student_id = params['student_id'];
    });
  }

  updatecustomerdata(){
    this.objUser.updatestudentdetails(this.student_id, this.userdata);
    alert(this.userdata.first_name + "saved");
  }

}
