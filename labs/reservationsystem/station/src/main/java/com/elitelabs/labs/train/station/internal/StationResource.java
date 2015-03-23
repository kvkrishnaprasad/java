package com.elitelabs.labs.train.station.internal;

import com.elitelabs.labs.train.common.DatabaseLayer;
import com.elitelabs.labs.train.station.IStationResource;
import com.elitelabs.labs.train.station.response.Station;
import com.google.inject.Inject;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class StationResource implements IStationResource {

  private DatabaseLayer databaseLayer = new DatabaseLayer();

  public StationResource() {
  }

  @Override
  public List<Station> searchStationByString(String str) {

    List<Station> stationList = new LinkedList<Station>();

    try {
      databaseLayer.makeConnection();
      // TODO: Fix the SQL statement
      ResultSet rs = databaseLayer.executeQuery("select * from station");
      while (rs.next()) {
        Station s = new Station();
        s.setStationCode(rs.getString("station_code"));
        s.setStationName(rs.getNString("station_name"));

        stationList.add(s);
      }
    }
    catch (SQLException e ) {
    }

    databaseLayer.closeConnection();

    return stationList;
  }

  @Override
  public List<Station> getAllStations() {
    List<Station> stationList = new LinkedList<Station>();

    try {
      databaseLayer.makeConnection();
      ResultSet rs = databaseLayer.executeQuery("select * from station");
      while (rs.next()) {
        Station s = new Station();
        s.setStationCode(rs.getString("station_code"));
        s.setStationName(rs.getNString("station_name"));

        stationList.add(s);
      }
    }
    catch (SQLException e ) {
    }

    databaseLayer.closeConnection();

    return stationList;
  }
}
