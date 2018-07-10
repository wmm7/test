package test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class testMath {

  public static void main(String[] args){
    BigDecimal bigDecimal = new BigDecimal(0).divide(new BigDecimal(100.00), 2, BigDecimal.ROUND_HALF_EVEN);
    System.out.println(bigDecimal.equals(new BigDecimal(0).setScale(2, BigDecimal.ROUND_HALF_EVEN)));

  }

}
