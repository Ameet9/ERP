import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(public http:HttpClient) { }
  register(user){
    return this.http.post("http://localhost:8080/register",user).toPromise();
  }

  authenticateStudent(user){
    return this.http.post("http://localhost:8080/authStudent",user).toPromise();
  }
}
