import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  language:String;

  constructor(public navCtrl: NavController) {

  }

  findData(key:any){
    console.log(key.target.value);
    console.log(this.language);
  }

}
