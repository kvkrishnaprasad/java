package com.elitelabs.labs.train.station.internal;

import com.elitelabs.labs.train.station.response.Station;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StationResourceTest {

  private StationResource stationResource;

  @Before
  public void setUp() {
    stationResource = new StationResource();
  }

  @Test
  public void dummy() {
  }

  @Test
  public void getAllStations() {
    List<Station> list = stationResource.getAllStations();
    assertEquals(4, list.size());
  }

  @Test
  public void searchStation() {
    List<Station> list = stationResource.searchStationByString("SBC");
    assertEquals(1, list.size());
  }
}