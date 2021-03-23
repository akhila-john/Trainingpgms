import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { StudentComponent } from './student/student.component';

import { FeeDetailsComponent } from './fee-details/fee-details.component';
import { EmergencyContactComponent } from './emergency-contact/emergency-contact.component';
import { BatchDetailsComponent } from './batch-details/batch-details.component';
import { MenuComponent } from './menu/menu.component';
import { HttpClientModule} from '@angular/common/http';
import { ViewdetailsComponent } from './viewdetails/viewdetails.component';
import { EditdetailsComponent } from './editdetails/editdetails.component';
import { FormsModule } from '@angular/forms';
import { UserServiceService} from './user-service.service';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentComponent,
    
    FeeDetailsComponent,
    EmergencyContactComponent,
    BatchDetailsComponent,
    MenuComponent,
    ViewdetailsComponent,
    EditdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,FormsModule
  ],
  providers: [UserServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
