package test;


import com.google.common.base.Joiner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class testJson {

  public static void main(String args[]){
//    ObjectMapper objectMapper = new ObjectMapper();
//    Map map = new HashMap();
//    map.put("test", 0);
//    try {
//      String json = objectMapper.writeValueAsString(map);
//      System.out.println(json);
//    } catch (JsonProcessingException e) {
//      e.printStackTrace();
//    }
//    System.out.println("[" + Joiner.on(",").join(new String[]{
//        "uid",
//        "biz_status",
//        "level",
//        }) + "]");
    String left = StringUtils.left("3****************7", 1);
    System.out.println(left);
  }

}
