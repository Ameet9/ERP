import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/service/rest.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public svc:RestService,public router:Router) { }

  ngOnInit() {
  }
   login(user){
  //   return this.svc.authenticateStudent(user).then(response=>{
  //     if(response!=false)
  //     localStorage.setItem("loggedInUser",user.email);
  //     this.router.navigate(['register']).then(()=>{
  //       window.location.reload();
  //     });
  //     console.log(response);
  //   }).catch(error=>{
  //     console.log(error);
  //   });
  if(user.email=="dhiru"&&user.password=="1234"){
    localStorage.setItem("loggedInUser",user.email);
         this.router.navigate(['register']).then(()=>{
           window.location.reload();
         });
  }
  }

}
