import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BatchDetailsComponent } from './batch-details/batch-details.component';
import { HomeComponent } from './home/home.component';
import { StudentComponent } from './student/student.component';
import { FeeDetailsComponent} from './fee-details/fee-details.component';
import { EmergencyContactComponent } from './emergency-contact/emergency-contact.component';
import { ViewdetailsComponent } from './viewdetails/viewdetails.component';
import { EditdetailsComponent } from './editdetails/editdetails.component';

const routes: Routes = [
  {path:'home',component:HomeComponent},
  {path:'student',component:StudentComponent},
  {path:'batch-details',component:BatchDetailsComponent},
  {path: 'fee-details',component:FeeDetailsComponent},
  {path: 'emergency-contact',component:EmergencyContactComponent},
  {path: 'viewdetails/:student_id',component:ViewdetailsComponent},
  {path: 'editdetails/:student_id',component:ViewdetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
