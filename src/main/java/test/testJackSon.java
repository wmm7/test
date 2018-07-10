package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testJackSon {

  private String string;
  private Date   date;
  private List<String> list;
  private Map<String, String> map = new HashMap<String, String>();

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public List<String> getList() {
    return list;
  }

  public void setList(List<String> list) {
    this.list = list;
  }

  public Map<String, String> getMap() {
    return map;
  }

  public void setMap(Map<String, String> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "testJackSon{" + "string='" + string + '\'' + ", date=" + date + ", list=" + list + ", map=" + map + '}';
  }
}
