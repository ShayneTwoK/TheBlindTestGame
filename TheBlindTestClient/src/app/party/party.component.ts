import {Component, OnInit} from '@angular/core';
import {faCrown} from '@fortawesome/free-solid-svg-icons';
import {Player} from "../player/player";
import {PlayerService} from "../player/player.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-party',
  templateUrl: './party.component.html',
  styleUrls: ['./party.component.css']
})
export class PartyComponent implements OnInit {

  // Icon
  faCrown = faCrown;

  public players: Player[];

  constructor(private playerService: PlayerService) {
    this.players = [];
  }

  ngOnInit(): void {
    this.getPlayers();

  }

  public getPlayers(): void {
    this.playerService.getPlayers().subscribe(
      (response: Player[]) => {
        this.players = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }

    )
  }

  public randomIntFromInterval(min: number, max: number) : number {
    return Math.floor(Math.random() * (max - min + 1) + min)
  }

}
