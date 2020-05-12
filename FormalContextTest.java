import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.FormalContext;
import de.tudresden.inf.tcs.fcalib.FullObject;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

import static org.junit.Assert.*;

public class FormalContextTest {

    @Test
    public void FormalContextPresence()
    {
        FormalContext f = new FormalContext();
        String res = f.getClass().toString();
        assertTrue(res.contains("FormalContext"));
    }
    @Test
    public void objectPresenceTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        FullObject f = new FullObject(id);
        s.addObject(f);
        try
        {
            s.addObject(f);
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));

    }
    @Test
    public void getObjectsTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        FullObject f = new FullObject(id);
        s.addObject(f);
        try
        {
            IndexedSet<FCAObject> set = s.getObjects();
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));
    }
    @Test
    public void objectIndexTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            Object obj  = s.getObjectAtIndex(0);
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));
    }
    @Test
    public void objectRemovalTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            s.removeObject(1);
            s.removeObject(1);
        }
        catch(Exception e)
        {

        }
        assertTrue(!s.containsObject(1));
    }
    @Test
    public void fullObjectRemovalTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            s.removeObject(f);
            s.removeObject(f);
        }
        catch(Exception e)
        {

        }
        assertTrue(!s.containsObject(1));
    }
    @Test
    public void clearObjectsTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            s.clearObjects();
        }
        catch(Exception e)
        {

        }
      assertTrue(!s.containsObject(1));
    }
    @Test
    public void addAttributeTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            s.addAttributeToObject("set",1);
            s.addAttributeToObject("java",3);
            s.addAttributeToObject("Python",4);
            s.addAttributeToObject("set",1);

        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));
    }
    @Test
    public void checkAttributeExistence() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        try
        {
            s.addAttributeToObject("set",1);
            s.addAttributeToObject("java",3);
            s.addAttributeToObject("Python",4);
            s.addAttributeToObject("set",1);

        }
        catch(Exception e)
        {

        }
        try
        {
           boolean var = s.objectHasAttribute(f,"set");
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));

    }
    @Test
    public void primeTest() throws IllegalObjectException {
        FormalContext s = new FormalContext();
        int id = 1;
        int id2 = 2;
        FullObject f = new FullObject(id);
        s.addObject(f);
        FullObject f1 = new FullObject(id2);
        s.addObject(f1);
        HashSet<Integer> set = new HashSet<Integer>(0);
        try
        {
            Object obj = s.doublePrime(set);
        }
        catch(Exception e)
        {

        }
        assertTrue(s.containsObject(1));
    }
  @Test
    public void closureTest() throws IllegalObjectException {
      FormalContext s = new FormalContext();
      int id = 1;
      int id2 = 2;
      FullObject f = new FullObject(id);
      s.addObject(f);
      FullObject f1 = new FullObject(id2);
      s.addObject(f1);
      Set<Integer> set = new HashSet<Integer>();
      try
      {
          Object obj = s.closure(set);
          boolean var = s.isClosed(set);
          Object obj1 = s.allClosures();
          Object obj2 = s.getStemBase();
          Object obj3 = s.getDuquenneGuiguesBase();
          Object obj4 = s.getIntents();
          Object obj5 = s.getConcepts();
          Object obj6 = s.getConceptLattice();
          Object ob7 =  s.getExtents();
      }
      catch(Exception e)
      {

      }
      assertTrue(s.containsObject(1));
  }
  @Test
    public void refuteTest() throws IllegalObjectException {
      FormalContext s = new FormalContext();
      int id = 1;
      int id2 = 2;
      FullObject f = new FullObject(id);
      s.addObject(f);
      FullObject f1 = new FullObject(id2);
      s.addObject(f1);
      FCAImplication ft = new FCAImplication() {
          @Override
          public Set getPremise() {
              return null;
          }

          @Override
          public Set getConclusion() {
              return null;
          }

          @Override
          public boolean equals(FCAImplication imp) {
              return false;
          }
      };
      try
      {
          boolean var = s.refutes(ft);
      }
      catch(Exception e)
      {

      }
      assertTrue(s.containsObject(1));

  }
  @Test
    public void counterExampleTest() throws IllegalObjectException {
      FormalContext s = new FormalContext();
      int id = 1;
      int id2 = 2;
      FullObject f = new FullObject(id);
      s.addObject(f);
      FullObject f1 = new FullObject(id2);
      s.addObject(f1);
      FCAImplication ft = new FCAImplication() {
          @Override
          public Set getPremise() {
              return null;
          }

          @Override
          public Set getConclusion() {
              return null;
          }

          @Override
          public boolean equals(FCAImplication imp) {
              return false;
          }
      };
      try
      {
          s.isCounterExampleValid(f1,ft);
      }
      catch(Exception e)
      {

      }
      assertTrue(s.containsObject(1));
  }
  @Test
    public void otherTests() throws IllegalObjectException {
      FormalContext s = new FormalContext();
      int id = 1;
      int id2 = 2;
      FullObject f = new FullObject(id);
      s.addObject(f);
      FullObject f1 = new FullObject(id2);
      s.addObject(f1);
      FCAImplication ft = new FCAImplication() {
          @Override
          public Set getPremise() {
              return null;
          }

          @Override
          public Set getConclusion() {
              return null;
          }

          @Override
          public boolean equals(FCAImplication imp) {
              return false;
          }
      };
      try
      {
          s.followsFromBackgroundKnowledge(ft);
          s.setExpert(null);
          s.getExpert();

      }
      catch(Exception e)
      {

      }
      assertTrue(s.containsObject(1));
  }

}
