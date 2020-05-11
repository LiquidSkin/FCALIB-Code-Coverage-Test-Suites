import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.ObjectDescription;
import de.tudresden.inf.tcs.fcaapi.action.ExpertActionListener;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcalib.PartialContext;
import de.tudresden.inf.tcs.fcalib.PartialObject;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class PartialContextTest {

    @Test
    public void partialContextAbsenceTest()
    {
        PartialContext pt = new PartialContext();
        HashSet set = new HashSet();
        assertTrue(!pt.containsObject(set));
    }
    @Test
    public void partialContextPresenceTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        assertTrue(pt.containsObject(1));
    }
    @Test
    public void getObjectNotPresentAtIndex()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        Object obj = pt.getObjectAtIndex(0);
        assertTrue(obj.toString().contains("1"));
    }
    @Test
    public void getObjectCountAbsenceTest()
    {
        PartialContext pt = new PartialContext();
        int count = pt.getObjectCount();
        assertTrue(count == 0);
    }
    @Test
    public void getObjectCountPresenceTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        int count = pt.getObjectCount();
        assertTrue(count == 1);
    }
    @Test
    public void removeObjectNotPresentTest() throws IllegalObjectException {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        boolean removed = false;
        try {
            removed = pt.removeObject(5);

        }
        catch(Exception e)
        {

        }
        assertTrue(removed == false);
    }
    @Test
    public void removeObjectPresentTest() throws IllegalObjectException {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        boolean removed = false;
        try {
            removed = pt.removeObject(1);

        }
        catch(Exception e)
        {

        }
        assertTrue(removed == true);
    }

    @Test
    public void removeObjectAbsentTest()
    {
        PartialContext pt = new PartialContext();
        PartialContext pt1 = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        boolean removed = false;
        try {
            removed = pt.removeObject(pt1);

        }
        catch(Exception e)
        {

        }
        assertTrue(removed == false);
    }
    @Test
    public void removeObjectPresentTestbyObjectName()throws Exception
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        boolean removed = false;
        try {
            removed = pt.removeObject(p);

        }
        catch(Exception e)
        {

        }
        assertTrue(removed == true);

    }
    @Test
    public void refuteTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
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
        Object obj = false;
        try {
             obj = p.refutes(ft);

        } catch(Exception e)
        {

        }
        String str = obj.toString();
        assertTrue(str.equals("false"));

    }
    @Test
    public void expertTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        Expert e = new Expert<>() {
            @Override
            public void askQuestion(FCAImplication<Object> question) {

            }

            @Override
            public void requestCounterExample(FCAImplication<Object> question) {

            }

            @Override
            public void addExpertActionListener(ExpertActionListener<Object, Object> listener) {

            }

            @Override
            public void removeExpertActionListeners() {

            }

            @Override
            public void counterExampleInvalid(FCAObject<Object, Object> counterExample, int reasonCode) {

            }

            @Override
            public void explorationFinished() {

            }

            @Override
            public void forceToCounterExample(FCAImplication<Object> implication) {

            }

            @Override
            public void implicationFollowsFromBackgroundKnowledge(FCAImplication<Object> implication) {

            }
        };
        pt.setExpert(e);
        pt.getExpert();
        Object obj = pt.getExpert().toString();
        assertTrue(obj.toString().contains("PartialContext"));
    }
    @Test
    public void stemBaseTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
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
        assertTrue(pt.getStemBase() == null);
    }
    @Test
    public void otherNullTests()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
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
        assertTrue(pt.getDuquenneGuiguesBase() == null);
    }
    @Test
    public void doublePrimeTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addObject(p);
        Object obj = null;
        try
        {
            Set<PartialContext> tmp = new HashSet<PartialContext>(pt.getAttributes());
            obj = pt.doublePrime(tmp);

        }
        catch(Exception e)
        {

        }
        assertTrue(obj.toString().contains("[]"));

    }
    @Test
    public void attributesTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addAttribute("set");
        pt.addObject(p);
        assertTrue(pt.objectHasAttribute(p,"set") == false);
        assertTrue(pt.objectHasNegatedAttribute(p,"set") == false);
    }
    @Test
    public void removeAttributeTest()
    {
        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addAttribute("set");
        pt.addObject(p);
        boolean obj = false;
        try
        {
            obj = pt.removeAttributeFromObject("set",1);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj== false);
    }
    @Test
    public void addAttributeTest() {

        PartialContext pt = new PartialContext();
        int id = 1;
        PartialObject p = new PartialObject(id);
        pt.addAttribute("set");
        pt.addObject(p);
        boolean obj = false;
        try {
            obj = pt.addAttributeToObject("Set", 1);

        }
        catch(Exception e)
        {

        }
       assertTrue(obj == false);
    }
  @Test
   public void counterExampleTest()
  {
      PartialContext pt = new PartialContext();
      int id = 1;
      PartialObject p = new PartialObject(id);
      pt.addAttribute("set");
      pt.addObject(p);
      boolean obj = false;
      FCAImplication f = new FCAImplication() {
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
      try {
          obj = pt.isCounterExampleValid(p, f);
      }
      catch(Exception e)
      {

      }
      assertTrue(obj == false);
  }

}