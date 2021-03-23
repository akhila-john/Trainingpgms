import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from '../student';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-viewdetails',
  templateUrl: './viewdetails.component.html',
  styleUrls: ['./viewdetails.component.css']
})
export class ViewdetailsComponent implements OnInit {
  //  usersdata;
  //  student :Student;
  @Input() student : Student;
  student_id : number;
  

  constructor(private route: ActivatedRoute,private router:Router,
    private userserviceservice:UserServiceService ) { }

  ngOnInit(): void {

  this.getStudent();
    //  this.student = new Student();
    //  this.student_id = this.route.snapshot.params['student_id'];

    // this.userserviceservice.getuserdetails().subscribe(data =>
    //   {console.log(data)
    //     this.usersdata = data;
    //   })


  }

  getStudent(): void {
    const student_id = +this.route.snapshot.paramMap.get('this.student_id');
    this.userserviceservice.getStudent(student_id).subscribe(student =>
      this.student = student);
  }
}
