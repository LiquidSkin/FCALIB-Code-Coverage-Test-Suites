import de.tudresden.inf.tcs.fcaapi.Context;
import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.action.ExpertAction;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.Implication;
import de.tudresden.inf.tcs.fcalib.change.NewImplicationChange;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class NewImplicationChangeTest {

    @Test
    public void NewImplicationChangeTypeFunctionalTest()
    {
        Implication i = new Implication();
        Context c = new Context() {
            @Override
            public boolean addAttribute(Object attr) throws IllegalAttributeException {


                return false;
            }

            @Override
            public boolean addAttributes(Set attrs) throws IllegalAttributeException {
                return false;
            }

            @Override
            public IndexedSet getAttributes() {
                return null;
            }

            @Override
            public int getAttributeCount() {
                return 0;
            }

            @Override
            public Object getAttributeAtIndex(int index) {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public int getObjectCount() {
                return 0;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean addObjects(Set objects) throws IllegalObjectException {
                return false;
            }

            @Override
            public void clearObjects() {

            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public boolean containsObject(Object id) {
                return false;
            }

            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set doublePrime(Set attributes) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public boolean isExpertSet() {
                return false;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }

            @Override
            public Set<FCAImplication> getImplications() {
                return null;
            }

            @Override
            public void expertPerformedAction(ExpertAction action) {

            }
        };
        NewImplicationChange n = new NewImplicationChange(c, i);
        int number = n.getType();
        assertTrue(number > 0);

   }
  @Test
    public void undoTest()
  {
      Implication i = new Implication();

      Context c = new Context() {
          @Override
          public boolean addAttribute(Object attr) throws IllegalAttributeException {


              return false;
          }

          @Override
          public boolean addAttributes(Set attrs) throws IllegalAttributeException {
              return false;
          }

          @Override
          public IndexedSet getAttributes() {
              return null;
          }

          @Override
          public int getAttributeCount() {
              return 0;
          }

          @Override
          public Object getAttributeAtIndex(int index) {
              return null;
          }

          @Override
          public boolean addObject(FCAObject object) throws IllegalObjectException {
              return false;
          }

          @Override
          public int getObjectCount() {
              return 0;
          }

          @Override
          public boolean removeObject(Object id) throws IllegalObjectException {
              return false;
          }

          @Override
          public boolean removeObject(FCAObject object) throws IllegalObjectException {
              return false;
          }

          @Override
          public boolean addObjects(Set objects) throws IllegalObjectException {
              return false;
          }

          @Override
          public void clearObjects() {

          }

          @Override
          public FCAObject getObject(Object id) {
              return null;
          }

          @Override
          public boolean containsObject(Object id) {
              return false;
          }

          @Override
          public IndexedSet getObjects() {
              return null;
          }

          @Override
          public FCAObject getObjectAtIndex(int index) {
              return null;
          }

          @Override
          public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
              return false;
          }

          @Override
          public boolean objectHasAttribute(FCAObject object, Object attribute) {
              return false;
          }

          @Override
          public Set doublePrime(Set attributes) {
              return null;
          }

          @Override
          public Set<FCAImplication> getStemBase() {
              return null;
          }

          @Override
          public Set<FCAImplication> getDuquenneGuiguesBase() {
              return null;
          }

          @Override
          public boolean isExpertSet() {
              return false;
          }

          @Override
          public Expert getExpert() {
              return null;
          }

          @Override
          public void setExpert(Expert e) {

          }

          @Override
          public Set<FCAImplication> getImplications() {
              return null;
          }

          @Override
          public void expertPerformedAction(ExpertAction action) {

          }
      };
      NewImplicationChange n = new NewImplicationChange(c, i);
      try {
          n.undo();
      }
      catch(NullPointerException e)
      {

      }
      FCAImplication f = n.getImplication();
      String result = String.valueOf(f);
      //System.out.println("the FCA Implication is" + result);

  }
  @Test
  public void getImplicationTest()
  {
      Implication i = new Implication();

      Context c = new Context() {
          @Override
          public boolean addAttribute(Object attr) throws IllegalAttributeException {


              return false;
          }

          @Override
          public boolean addAttributes(Set attrs) throws IllegalAttributeException {
              return false;
          }

          @Override
          public IndexedSet getAttributes() {
              return null;
          }

          @Override
          public int getAttributeCount() {
              return 0;
          }

          @Override
          public Object getAttributeAtIndex(int index) {
              return null;
          }

          @Override
          public boolean addObject(FCAObject object) throws IllegalObjectException {
              return false;
          }

          @Override
          public int getObjectCount() {
              return 0;
          }

          @Override
          public boolean removeObject(Object id) throws IllegalObjectException {
              return false;
          }

          @Override
          public boolean removeObject(FCAObject object) throws IllegalObjectException {
              return false;
          }

          @Override
          public boolean addObjects(Set objects) throws IllegalObjectException {
              return false;
          }

          @Override
          public void clearObjects() {

          }

          @Override
          public FCAObject getObject(Object id) {
              return null;
          }

          @Override
          public boolean containsObject(Object id) {
              return false;
          }

          @Override
          public IndexedSet getObjects() {
              return null;
          }

          @Override
          public FCAObject getObjectAtIndex(int index) {
              return null;
          }

          @Override
          public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
              return false;
          }

          @Override
          public boolean objectHasAttribute(FCAObject object, Object attribute) {
              return false;
          }

          @Override
          public Set doublePrime(Set attributes) {
              return null;
          }

          @Override
          public Set<FCAImplication> getStemBase() {
              return null;
          }

          @Override
          public Set<FCAImplication> getDuquenneGuiguesBase() {
              return null;
          }

          @Override
          public boolean isExpertSet() {
              return false;
          }

          @Override
          public Expert getExpert() {
              return null;
          }

          @Override
          public void setExpert(Expert e) {

          }

          @Override
          public Set<FCAImplication> getImplications() {
              return null;
          }

          @Override
          public void expertPerformedAction(ExpertAction action) {

          }
      };
      NewImplicationChange n = new NewImplicationChange(c,i);
      FCAImplication f = n.getImplication();
      String res = String.valueOf(f);
      System.out.println("The String Value is" + res);
      assertTrue(res.equals("[] -> []" ));

  }


}
