import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home-admin',
  templateUrl: './home-admin.component.html',
  styleUrls: ['./home-admin.component.css']
})
export class HomeAdminComponent implements OnInit {

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

  link(address)
  {
    this.router.navigate([address]).then(()=>{
      window.location.reload();
    })
  }

}
