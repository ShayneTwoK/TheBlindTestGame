import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Player} from "./player";
import {environment} from "../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  private apiServerUrl: string;

  constructor(private http: HttpClient) {
    this.apiServerUrl = environment.apiBaseUrl;
  }

  public getPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(`${this.apiServerUrl}/players`);
  }

  public addPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(`${this.apiServerUrl}/addPlayer`, player);
  }

  public updatePlayer(player: Player): Observable<Player> {
    return this.http.put<Player>(`${this.apiServerUrl}/updatePlayer`, player);
  }

  public deletePlayer(playerId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/deletePlayer/${playerId}`);
  }

}
