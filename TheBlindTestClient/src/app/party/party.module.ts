import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PartyRoutingModule } from './party-routing.module';
import { PartyComponent } from './party.component';
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {PlayerService} from "../player/player.service";
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import {PlayerListModule} from "../player-list/player-list.module";


@NgModule({
  declarations: [
    PartyComponent
  ],
  imports: [
    CommonModule,
    PartyRoutingModule,
    FontAwesomeModule,
    HttpClientModule,
    RouterModule,
    PlayerListModule
  ],
  providers: [PlayerService]
})
export class PartyModule { }
