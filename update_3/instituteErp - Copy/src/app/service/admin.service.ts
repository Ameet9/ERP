import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(private http:HttpClient) { }

  signIn(admin)
  {
    return this.http.post('http://localhost:8080/adminauthenticate',admin).toPromise();
  }
}
