import { Component, OnInit } from '@angular/core';
import { RestService } from 'src/app/service/rest.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(public svc:RestService) { }

  ngOnInit() {
  }
  register(user){
    return this.svc.register(user).then(response=>{
      console.log(response);
    }).catch(error=>{
      console.log(error);
    });
  }

}
