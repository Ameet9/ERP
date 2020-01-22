import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';

import { RestService } from './service/rest.service';
import { AboutComponent } from './home/about/about.component';
import { ServicesComponent } from './home/services/services.component';
import { ContactsComponent } from './home/contacts/contacts.component';
import { GalleryComponent } from './home/gallery/gallery.component';
import { CodesComponent } from './home/codes/codes.component';
import { FooterComponent } from './home/footer/footer.component';
import { LoginComponent } from './home/membership/login/login.component';
import { RegisterComponent } from './home/membership/register/register.component';
import { LogoutComponent } from './home/membership/logout/logout.component';
import { AdminComponent } from './modules/admin/admin.component';
import { StudentComponent } from './modules/student/student.component';
import { HomeAdminComponent } from './modules/admin/home-admin/home-admin.component';
import { StudentAdminComponent } from './modules/admin/student-admin/student-admin.component';
import { FacultyAdminComponent } from './modules/admin/faculty-admin/faculty-admin.component';
import { ExamAdminComponent } from './modules/admin/exam-admin/exam-admin.component';
import { LoginAdminComponent } from './modules/admin/login-admin/login-admin.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    ServicesComponent,
    ContactsComponent,
    GalleryComponent,
    CodesComponent,
    FooterComponent,
    LoginComponent,
    RegisterComponent,
    LogoutComponent,
    AdminComponent,
    StudentComponent,
    HomeAdminComponent,
    StudentAdminComponent,
    FacultyAdminComponent,
    ExamAdminComponent,
    LoginAdminComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [RestService],
  bootstrap: [AppComponent]
})
export class AppModule { }
