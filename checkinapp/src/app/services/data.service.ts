import { Injectable } from '@angular/core';
import {Http, Response} from '@angular/http';
import {map} from 'rxjs/operators';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class DataService {


  url : string = "http://localhost:9999/flightreservation/resdetails/"

  constructor(private _http:Http) { }


  public getReservationData(id:number):any{
    return this._http.get(this.url+id)
    .pipe(map(response=>{
      console.log("res "+response.json());
      return response.json();
    },
    error=>{
      console.error(error);
    }
  ))
  }

  // public getReservationData(id : number) : any {
  //   console.log("inside the service!!!"+id);
  //  return  this._http.get(this.url+id).pipe(map(res=>{
  //     return res.json();
     
  //   },
  //     error=>{
  //       console.log(error);
  //     }
  //   ))
  // }


}
