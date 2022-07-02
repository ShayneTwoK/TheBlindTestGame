import { Component, OnInit } from '@angular/core';
import { faCrown } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-party',
  templateUrl: './party.component.html',
  styleUrls: ['./party.component.css']
})
export class PartyComponent implements OnInit {
  // Icon
  faCrown = faCrown;

  constructor() { }

  ngOnInit(): void {
  }

}
