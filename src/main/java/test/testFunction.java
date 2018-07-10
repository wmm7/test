package test;


import org.junit.Test;

import java.util.function.*;
import java.util.Comparator;
import java.util.Optional;

public class testFunction {

  /**
   * 断言接口（Predicates）
   * Predicates是只拥有一个参数的Boolean型功能的接口。这个接口拥有多个默认方法用于构成predicates复杂的逻辑术语。
   */
  @Test
  public void Predicates(){

    Predicate<String> predicates = (str) -> str.length()> 5;
    boolean b1 = predicates.test("foo"); //true
    System.err.println(b1);
    b1 = predicates.negate().test("foo"); //false ,取反
    System.err.println(b1);

    Predicate<String> isEmpty = String::isEmpty;
    Predicate<String> isNotEmpty = isEmpty.negate();

    System.err.println(isEmpty.test("sfasdfsa")); //false
    System.err.println(isNotEmpty.test("sfasdfsa")); //true

  }

  /**
   * 功能接口（Functions）
   * Functions接受一个参数并产生一个结果。默认方法能够用于将多个函数链接在一起。
   */
  @Test
  public void Function(){
    Function<String, Integer> toInteger = Integer::valueOf;//(str) -> Integer.valueOf(str);
    Function<String, String> backToString = toInteger.andThen(String::valueOf);

    System.err.println(backToString.apply("123")); // "123"
  }

  /**
   * 供应接口（Suppliers）
   * Suppliers对于给定的泛型类型产生一个实例。不同于Functions，Suppliers不需要任何参数。
   */
  @Test
  public void Supplier(){
    Supplier<Person> supplier = Person::new;
    Person p =  supplier.get();
    System.err.println(p);
  }

  /**
   * 消费接口（Consumers）
   Consumers代表在只有一个输入参数时操作被如何执行。
   */
  @Test
  public void Consumers(){
    Consumer<Person> greeter = (p) -> System.err.println("Hello, "+p.firstName + "," + p.lastName);
    greeter.accept(new Person("Lee","xx"));
  }

  /**
   * 比较接口（Comparators）
   Comparators在老版本中就已经被熟知。Java8向该接口中添加了多种默认方法。
   */
  @Test
  public void Comparator(){
    Comparator<Person> comparator = (p1,p2) -> p1.firstName.compareTo(p2.firstName);
    Person p1 = new Person("Lee","bugua");
    Person p2 = new Person("Chen","yueyayun");
    System.err.println(comparator.compare(p1, p2)); // 9>0       why is 9????????????????????
    System.err.println(comparator.reversed().compare(p1, p2));; // -9<0
  }

  /**
   * 选项接口（Optionals）
   Optionals并不是功能性接口，反而它是一种特殊的工具用来阻止NullPointerException。
   Optional是一种可以包含null和non-null值的简单容器。考虑到方法可以返回non-null结果，偶尔也可能任何都不返回。
   在Java8中，你可以返回Optional而不是返回null。
   */
  @Test
  public void Optionals(){
    Optional<String> optional = Optional.of(""); //不能为空

    System.err.println(optional.isPresent()); // true
    System.err.println(optional.get()); // "bam"
    System.err.println(optional.orElse("fallback"));

    optional.ifPresent( (s) -> System.err.println(s+"----------"));

  }


}

