import {Component, Input, OnInit} from '@angular/core';
import {faCrown} from '@fortawesome/free-solid-svg-icons';
import {Player} from "../player/player";

@Component({
  selector: 'app-player-list',
  templateUrl: './player-list.component.html',
  styleUrls: ['./player-list.component.css']
})
export class PlayerListComponent implements OnInit {

  @Input()
  players!: Player[];

  // Icon
  faCrown = faCrown;

  constructor() { }

  ngOnInit(): void {
  }

  public randomIntFromInterval(min: number, max: number) : number {
    return Math.floor(Math.random() * (max - min + 1) + min)
  }

}
