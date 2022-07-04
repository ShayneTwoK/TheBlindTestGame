import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PlayerListRoutingModule } from './player-list-routing.module';
import {PlayerListComponent} from "./player-list.component";
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    PlayerListComponent
  ],
  exports: [
    PlayerListComponent
  ],
  imports: [
    CommonModule,
    PlayerListRoutingModule,
    FontAwesomeModule,
    HttpClientModule
  ]
})
export class PlayerListModule { }
