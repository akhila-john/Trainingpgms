import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Student } from '../student';
import { UserServiceService} from '../user-service.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
userdata;
obj_s : Student = new Student();

  constructor(private objuser : UserServiceService,private router:Router) { }

  ngOnInit(): void {
    this.getalluserdetails();
  }

  getalluserdetails() {
    this.objuser.getuserdetails().subscribe((data) => {
      this.userdata = data;
    });
  }

  SaveCustomerdata() {
    this.objuser.postStudentdetails(this.obj_s).subscribe(
      (data : Student) =>
      console.log(data)
    );
    alert(this.obj_s.first_name + "details saved successfully")
    this.getalluserdetails();
  }

  // deleteStudent(student_id: object){
  //   this.objuser.deleteStudent(student_id).subscribe(
  //     data =>{
  //       console.log(data);
  //       this.getalluserdetails();
  //     }
      
  //   );
  // }

   deletecustomerdetails(student_id){
    if(confirm("are u sure to delete")){
       this.objuser.deletestudentdetails(student_id);
      this.getalluserdetails();
    }
   }

   loadnewcomponent(student_id){
     // alert(student_id);
     this.router.navigate(['editdetails',student_id]);
   }

  studentdetails(student_id: number){
    this.router.navigate(['viewdetails',student_id]);
  }


}
