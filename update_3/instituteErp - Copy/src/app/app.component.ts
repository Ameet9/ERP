import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  loggedInUser:string=null;
  title = 'InstituteErp';
  constructor(public router:Router){}
  ngOnInit(){
    this.loggedInUser=localStorage.getItem("loggedInUser");
    if(this.loggedInUser!=null){
      return this.router.navigate(['register']);

    }
    else if(this.loggedInUser==""){
      this.loggedInUser=null;
return this.router.navigate(['home']);
    }
  }
}
