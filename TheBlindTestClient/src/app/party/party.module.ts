import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PartyRoutingModule } from './party-routing.module';
import { PartyComponent } from './party.component';
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";
import {PlayerService} from "../player/player.service";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    PartyComponent
  ],
    imports: [
        CommonModule,
        PartyRoutingModule,
        FontAwesomeModule,
      HttpClientModule
    ],
  providers: [PlayerService]
})
export class PartyModule { }
