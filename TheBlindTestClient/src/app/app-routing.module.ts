import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:"", loadChildren: () => import('./party/party.module').then(m => m.PartyModule) },
  {path:"room", loadChildren: () => import('./room/room.module').then(m => m.RoomModule) },
  {path:"home", loadChildren: () => import('./home/home.module').then(m => m.HomeModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
