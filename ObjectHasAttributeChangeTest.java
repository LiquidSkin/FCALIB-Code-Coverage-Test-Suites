import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.ObjectDescription;
import de.tudresden.inf.tcs.fcaapi.change.ContextChange;
import de.tudresden.inf.tcs.fcalib.change.ObjectHasAttributeChange;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectHasAttributeChangeTest {

    @Test
    public void attributePresenceTest()
    {
        FCAObject f = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return 1;
            }

            @Override
            public String getName() {
                return "FCAObject";
            }

            @Override
            public ObjectDescription getDescription() {
                return null;
            }

            @Override
            public boolean respects(FCAImplication implication) {
                return false;
            }
        };
        ContextChange cc = new ContextChange() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 1;
            }
        };

        ObjectHasAttributeChange oh = new ObjectHasAttributeChange(f,cc);
        Object obj = oh.getAttribute();
        String result = obj.toString();
        assertTrue(result.contains("ObjectHasAttributeChange"));
    }

    @Test

    public void undoTest()
    {
        FCAObject f = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return 1;
            }

            @Override
            public String getName() {
                return "FCAObject";
            }

            @Override
            public ObjectDescription getDescription() {
                return null;
            }

            @Override
            public boolean respects(FCAImplication implication) {
                return false;
            }
        };
        ContextChange cc = new ContextChange() {
            @Override
            public void undo() {

            }

            @Override
            public int getType() {
                return 1;
            }
        };
        ObjectHasAttributeChange oh = new ObjectHasAttributeChange(f,cc);
        try {
            oh.undo();
        }
        catch (Exception e)
        {

        }
        Object obj = oh.getObject();
        String res = obj.toString();
        assertTrue(res.contains("HasAttributeChangeTest"));

    }
@Test
    public void geTypeTest()
   {
       FCAObject f = new FCAObject() {
           @Override
           public Object getIdentifier() {
               return 1;
           }

           @Override
           public String getName() {
               return "FCAObject";
           }

           @Override
           public ObjectDescription getDescription() {
               return null;
           }

           @Override
           public boolean respects(FCAImplication implication) {
               return false;
           }
       };
       ContextChange cc = new ContextChange() {
           @Override
           public void undo() {

           }

           @Override
           public int getType() {
               return 1;
           }
       };
       ObjectHasAttributeChange oh = new ObjectHasAttributeChange(f,cc);

       int id = oh.getType();
      assertTrue(id == 0);

   }


}