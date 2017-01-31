import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
/**
 * Created by knoldus on 23/01/17.
 */
public class SumTest {


@Test
  public void testSum(){
  Sum sum = new Sum();
  int result = sum.sum(1,2);
  assertEquals(3,result);
}
}
