import { Component, OnInit } from '@angular/core';
import { DataService } from './services/data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'checkinapp.....';
  message = "helloworld";
  data:any;
  reservationInfo : any;

  constructor(private service : DataService){}

  // ngOnInit(){

  //   service.getReservationData()
  // }

  public getRerData(id : number) : void {
    this.service.getReservationData(id).subscribe(res=>{
      this.data = res;
      console.log("data is "+this.data);
    })
  }

  

}
