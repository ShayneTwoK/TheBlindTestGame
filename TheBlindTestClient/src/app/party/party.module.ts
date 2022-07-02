import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PartyRoutingModule } from './party-routing.module';
import { PartyComponent } from './party.component';
import {FontAwesomeModule} from "@fortawesome/angular-fontawesome";


@NgModule({
  declarations: [
    PartyComponent
  ],
    imports: [
        CommonModule,
        PartyRoutingModule,
        FontAwesomeModule
    ]
})
export class PartyModule { }
