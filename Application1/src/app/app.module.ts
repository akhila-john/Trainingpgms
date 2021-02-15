import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { MenuComponent } from './menu/menu.component';
import { InterpolationComponent } from './interpolation/interpolation.component';
import { NgifComponent } from './ngif/ngif.component';
import { NgforComponent } from './ngfor/ngfor.component';
import { PipesComponent } from './pipes/pipes.component';
import { GalleryComponent } from './gallery/gallery.component';
import { AboutComponent } from './about/about.component';
import { RegistrationdetailsComponent } from './registrationdetails/registrationdetails.component';
import { LoginComponent } from './login/login.component';
import { Change1Directive } from './change1.directive';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CustomerComponent } from './customer/customer.component';
import { ServiceComponent } from './service/service.component';
import { HttpClientModule } from '@angular/common/http';
import { UserService } from './user.service';
import { EditComponent } from './edit/edit.component';
import { EditcustomerdetailsComponent } from './editcustomerdetails/editcustomerdetails.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    MenuComponent,
    InterpolationComponent,
    NgifComponent,
    NgforComponent,
    PipesComponent,
    GalleryComponent,
    AboutComponent,
    RegistrationdetailsComponent,
    LoginComponent,
    Change1Directive,
    ParentComponent,
    ChildComponent,
    CustomerComponent,
    ServiceComponent,
    EditComponent,
    EditcustomerdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
