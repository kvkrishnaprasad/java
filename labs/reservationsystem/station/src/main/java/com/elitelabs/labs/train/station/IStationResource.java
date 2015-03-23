package com.elitelabs.labs.train.station;

import com.elitelabs.labs.train.station.response.Station;

import java.util.List;

public interface IStationResource {
  List<Station> searchStationByString(String str);

  List<Station> getAllStations();
}
