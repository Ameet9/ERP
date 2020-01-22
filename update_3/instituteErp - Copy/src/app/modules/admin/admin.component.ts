import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  loggedInAdmin:string=null;
  constructor() { }

  ngOnInit() {
    this.loggedInAdmin=localStorage.getItem('loggedInAdmin');
    console.log(this.loggedInAdmin);

    if(this.loggedInAdmin==''){
      this.loggedInAdmin=null;
    }
  }

}
