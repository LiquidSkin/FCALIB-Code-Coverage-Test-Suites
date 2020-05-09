import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcalib.FullObject;
import de.tudresden.inf.tcs.fcalib.FullObjectDescription;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.*;

public class FullObjectTest {

    @Test
    public void fullObjectPresenceTest()
    {
        FullObjectDescription desc = new FullObjectDescription();
        int id = 1;
        FullObject f = new FullObject(1);
        Object obj = f.getIdentifier();
        int res = (Integer) obj;
        assertTrue(res == 1);
    }
    @Test
    public void fullObjectPresenceWithAttributes()
    {
        HashSet<Object> set = new HashSet<Object>();
        set.add("sampleName");
        set.add("This is a sample description");
        int id = 1;
        FullObject f = new FullObject(1,set);
        Object description = f.getDescription();
        assertTrue(f.getDescription()== description);
    }

    @Test
    public void nameTest()
    {
        FullObject f = new FullObject(1);
        f.setName("Halliburton");
        assertTrue(f.getName()== "Halliburton");


    }
    @Test
    public void testRespectImplication()
    {
        FCAImplication impl = new FCAImplication() {
            @Override
            public Set getPremise() {
                return new HashSet<Integer>(Arrays.asList(1,2,3,4));
            }

            @Override
            public Set getConclusion() {
                return new HashSet<Integer>(Arrays.asList(10,20,30));
            }

            @Override
            public boolean equals(FCAImplication imp) {
                return false;
            }
        };
        HashSet<HashSet> set = new HashSet<HashSet>();
        set.add((HashSet) impl.getPremise());
        set.add((HashSet) impl.getConclusion());
        int id = 10;
        FullObject fd = new FullObject(10, set);
        assertTrue(fd.respects(impl));

    }
  @Test
    public void testRefuteImplication()
  {
      FCAImplication impl = new FCAImplication() {
          @Override
          public Set getPremise() {
              return new HashSet<Integer>(Arrays.asList(1,2,3,4));
          }

          @Override
          public Set getConclusion() {
              return new HashSet<Integer>(Arrays.asList(10,20,30));
          }

          @Override
          public boolean equals(FCAImplication imp) {
              return false;
          }
      };
      HashSet<HashSet> set = new HashSet<HashSet>();
      HashSet<Integer> setOne = new HashSet<Integer>();
      setOne.add(20000);
      setOne.add(40000);
      set.add(setOne);
      int id = 10;
      FullObject fd = new FullObject(10, set);
      assertTrue(!fd.refutes(impl));

  }
  @Test
    public void StringTest()
  {
      HashSet<Object> set = new HashSet<Object>();
      set.add("sampleName");
      set.add("This is a sample description");
      int id = 1;
      FullObject f = new FullObject(1,set);
      String result = f.toString();
      assertTrue(result.contains("sampleName"));
  }



}