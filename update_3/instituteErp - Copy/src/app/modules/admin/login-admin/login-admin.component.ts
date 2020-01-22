import { Component, OnInit } from '@angular/core';
import { AdminService } from 'src/app/service/admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.css']
})
export class LoginAdminComponent implements OnInit {

  messageS:string ="";
  messageE:string ="";
  constructor(private service:AdminService,private router:Router) { }

  ngOnInit() {
  }

  authenticate(admin)
  {
    this.service.signIn(admin).then(response=>{
      console.log(response);
        localStorage.setItem('loggedInAdmin',admin.email);
        this.messageS="Login Successful";
        this.router.navigate(['admin/adminHome']).then(()=>{
          window.location.reload();
        });
    }).catch(error=>{
      console.log(error);
      this.messageE="Invalid Username and Password";
    });
    
    
  }

}
