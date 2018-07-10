package test;

import java.security.Key;

public class testHash {
  public static void main(String[] args){
    Key key = new Key() {
      @Override
      public String getAlgorithm() {
        return null;
      }

      @Override
      public String getFormat() {
        return null;
      }

      @Override
      public byte[] getEncoded() {
        return new byte[0];
      }
    };

    System.out.println(key.getAlgorithm());

//    try{
//      hash(key);
//    } catch (Throwable ta){
//      ta.printStackTrace();
//    }

  }

  private static int hash(Key key) {
    return Math.abs(key.hashCode()) % 1;
  }
}
