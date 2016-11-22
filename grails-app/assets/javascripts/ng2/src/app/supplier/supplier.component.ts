import { Component, OnInit } from '@angular/core';
import {Http, Headers,Response} from '@angular/http';

// import 'rxjs/add/operator/toPromise';
import { Observable }     from 'rxjs/Observable';
import {Router} from '@angular/router';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css']
})
export class SupplierComponent implements OnInit {
  data:Object;

  constructor(private router:Router, private http:Http) { }

  ngOnInit():void{
    this.getData();
  }


  getData() {
    this.http.get(`/supplier/index`).map(this.extractData).subscribe(
      res => this.data = res
    )
  }
  private extractData(res: Response) {
    let body = res.json();
    return body;
  }


}
