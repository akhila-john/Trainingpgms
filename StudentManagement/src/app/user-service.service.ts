import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
api_url = "http://localhost:8081/WebAPI/rest/student";
api_url1 = "http://localhost:8081/WebAPI/rest/student/";

  constructor(private http: HttpClient) { }

  getuserdetails() {
    return this.http.get(this.api_url);
  }

  getStudent(student_id: number): Observable<any> {
    return this.http.get('${this.api_url}/${student_id}');
  }

  public postStudentdetails(obj_s: Student): Observable<Student> {
    return this.http.post<Student>(this.api_url,obj_s,{
      headers:new HttpHeaders({
        'content-Type': 'application/json'
      })
    });
  }

   public deletestudentdetails(student_id: object) {
    this.http.delete(this.api_url +student_id).subscribe(data => {
      console.log(data);
     });
   }

// deleteStudent(student_id:object): Observable<any> {
//   return this.http.delete('${this.api_url1}/${id}', {responseType :'json'});
// }

  public updatestudentdetails(student_id: object,updaterecords: object){
    this.http.put(this.api_url + student_id, updaterecords).subscribe(data =>{
      console.log(data);
    });
  }

  
}
