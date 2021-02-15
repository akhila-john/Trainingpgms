import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { MenuComponent } from './menu/menu.component';
import { GalleryComponent } from './gallery/gallery.component';
import { AboutComponent } from './about/about.component';
import { InterpolationComponent } from './interpolation/interpolation.component';
import { NgifComponent } from './ngif/ngif.component';
import { NgforComponent } from './ngfor/ngfor.component';
import { PipesComponent } from './pipes/pipes.component';
import { RegistrationdetailsComponent } from './registrationdetails/registrationdetails.component';
import { LoginComponent } from './login/login.component';
import { ParentComponent } from './parent/parent.component';
import { CustomerComponent } from './customer/customer.component';
import { ServiceComponent } from './service/service.component';
import { EditcustomerdetailsComponent } from './editcustomerdetails/editcustomerdetails.component';
const routes: Routes = [
  {path:'home',component: HomeComponent},
  {path:'contact',component:ContactComponent},
  {path:'menu', component: MenuComponent},
  {path:'gallery', component: GalleryComponent},
  {path: 'about', component: AboutComponent},
  {path: 'interpolation',component:InterpolationComponent  },
  {path:'ngif',component: NgifComponent  },
  {path: 'Ngfor',component: NgforComponent },
  {path: 'pipes',component:PipesComponent},
  {path: 'registrationdetails',component:RegistrationdetailsComponent},
  {path: 'login',component:LoginComponent},
  {path: 'parent',component: ParentComponent},
  {path: 'customer',component: CustomerComponent},
  {path: 'service',component:  ServiceComponent},
  {path:"Ed/:id",component:EditcustomerdetailsComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
