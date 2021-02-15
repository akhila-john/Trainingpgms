import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {
userdata;
  constructor(private objuser : UserService) { }

  ngOnInit(): void {
    this.getalluserdeatils();
  }

  getalluserdeatils(){
    this.objuser.getuserdetails().subscribe((data) => {
      //console.log(data)
      this.userdata = data;
    });
}
}