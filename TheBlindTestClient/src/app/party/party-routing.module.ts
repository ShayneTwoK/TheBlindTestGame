import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {PartyComponent} from "./party.component";

const routes: Routes = [
  {path: "", component: PartyComponent},
    // maybe routing for player-list à faire
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PartyRoutingModule { }
