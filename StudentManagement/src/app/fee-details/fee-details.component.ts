import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fee-details',
  templateUrl: './fee-details.component.html',
  styleUrls: ['./fee-details.component.css']
})
export class FeeDetailsComponent implements OnInit {
  fee:any[]=[
    {payment_id:490,student_id:1,payment_status:'paid'},
    {payment_id:491,student_id:1,payment_status:'partial'},
    {payment_id:492,student_id:1,payment_status:'not paid'},
    {payment_id:493,student_id:1,payment_status:'paid'},
  ]
  constructor() { }

  ngOnInit(): void {
  }

}
