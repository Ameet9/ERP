import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegisterComponent } from './home/membership/register/register.component';
import { GalleryComponent } from './home/gallery/gallery.component';
import { ContactsComponent } from './home/contacts/contacts.component';
import { AboutComponent } from './home/about/about.component';
import { ServicesComponent } from './home/services/services.component';
import { LoginComponent } from './home/membership/login/login.component';
import { LogoutComponent } from './home/membership/logout/logout.component';
import { AdminComponent } from './modules/admin/admin.component';
import { StudentAdminComponent } from './modules/admin/student-admin/student-admin.component';
import { HomeAdminComponent } from './modules/admin/home-admin/home-admin.component';
import { FacultyAdminComponent } from './modules/admin/faculty-admin/faculty-admin.component';
import { ExamAdminComponent } from './modules/admin/exam-admin/exam-admin.component';
import { LoginAdminComponent } from './modules/admin/login-admin/login-admin.component';



const routes: Routes = [{
  path:"",component:HomeComponent},
  {path:"home",component:HomeComponent},
  {path:"register",component:RegisterComponent},
  {path:"gallery",component:GalleryComponent},
  {path:"contact",component:ContactsComponent},
  {path:"about",component:AboutComponent},
  {path:"services",component:ServicesComponent},
  {path:"login",component:LoginComponent},
  {path:"logout",component:LogoutComponent},
  {path:"admin",component:AdminComponent,children:[
    {path:"",component:LoginAdminComponent},
    {path:"adminHome",component:HomeAdminComponent},
    {path:"adminStudent",component:StudentAdminComponent},
    {path:"adminFaculty",component:FacultyAdminComponent},
    {path:"adminExam",component:ExamAdminComponent},
    {path:"adminLogin",component:LoginAdminComponent}
  ]}
  ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
