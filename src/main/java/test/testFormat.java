package test;

import org.apache.shiro.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class testFormat {

  private static final String SIX_NUMBER_PATTERN = "^\\d{6}$";      //6位数字
  private static final String SIX_REPEAT_NUMBER_PATTERN = "^(\\d)\\1{5}$";   //6位完全重复数字

  public static void main(String[] args){
//    String balanceStr = String.format("%03d", 5000000);
//    System.out.println(balanceStr);
//    String yuan = new StringBuilder(balanceStr).insert(balanceStr.length() - 2, ".").toString();
//    System.out.println(yuan);
    System.out.println(isOrderedAsc("123456789"));
  }


  private static boolean isOrderedAsc(String password){
    boolean flag = true;
    for (int i = 0; i < password.length() - 1; i++) {  //是否正序连续
      int current = Integer.parseInt(String.valueOf(password.charAt(i)))+1;
      int next = Integer.parseInt(String.valueOf(password.charAt(i + 1)));
      System.out.println("current="+current+",i="+i);
      System.out.println("next="+next+",i="+i);
      if(current != next){
        flag = false;
        break;
      }
    }
    return flag;
  }

  private static boolean isOrderedDesc(String password){
    boolean flag = true;
    for (int i = 0; i < password.length() - 1; i++) {  //是否倒序连续
      int current = Integer.parseInt(String.valueOf(password.charAt(i)))-1;
      int next = Integer.parseInt(String.valueOf(password.charAt(i + 1)));
      System.out.println("current="+current+",i="+i);
      System.out.println("next="+next+",i="+i);
      if(current != next){
        flag = false;
        break;
      }
    }
    return flag;
  }

}
