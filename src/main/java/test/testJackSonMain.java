package test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testJackSonMain {

  public static void main(String args[]){

    testJackSon test = new testJackSon();
    test.setDate(new Date());
    test.setString("testString");
    List<String> list = new ArrayList<String>();
    list.add("testList");
    test.setList(list);
//    Map<String, String> map = new HashMap<String, String>();
//    map.put("testMapKey", "testMapValue");
//    test.setMap(map);

    ObjectMapper objectMapper = new ObjectMapper();
    //当反序列化json时，未知属性会引起的反序列化被打断，这里我们禁用未知属性打断反序列化功能
//    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
//        .configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false)
//        .configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false)
//        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    objectMapper.setDateFormat(dateFormat);

//    objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

    String json = null;
    try {
      json = objectMapper.writeValueAsString(test);
      System.out.println(json);
      testJackSon newTest = objectMapper.readValue(json, testJackSon.class);
      System.out.println(newTest.toString());
    }catch (Exception e){
      e.printStackTrace();
    }

  }
}
