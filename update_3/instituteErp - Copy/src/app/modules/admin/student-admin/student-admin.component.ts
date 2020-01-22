import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-admin',
  templateUrl: './student-admin.component.html',
  styleUrls: ['./student-admin.component.css']
})
export class StudentAdminComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
  }
  logout()
  {
    localStorage.removeItem("loggedInAdmin");
    this.router.navigate(['/admin']).then(()=>{
      window.location.reload();
    })
  }

}
