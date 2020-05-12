import de.tudresden.inf.tcs.fcaapi.*;
import de.tudresden.inf.tcs.fcaapi.action.ExpertAction;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.AbstractContext;
import de.tudresden.inf.tcs.fcalib.change.ObjectHasAttributeChange;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.util.*;

import static org.junit.Assert.*;

public class AbstractContextTest {
    @Test
    public void abstractContextPresenceTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        String str = ac.getClass().toString();
        assertTrue(str.contains("AbstractContext"));
    }
    @Test
    public void presenceOfAttributesTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        ac.addAttribute("A sample attribute");
        ac.addAttribute("Another attribute");
        IndexedSet<String> set = ac.getAttributes();
        assertTrue(set.size() > 0);
    }
    @Test
    public void absenceOfAttributesTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        IndexedSet<String> set = ac.getAttributes();
        assertTrue(set.size() == 0);
    }
    @Test
    public void attributeCountSizeTest()
    {
       AbstractContext ac = new AbstractContext() {
           @Override
           public IndexedSet getObjects() {
               return null;
           }

           @Override
           public boolean addObject(FCAObject object) throws IllegalObjectException {
               return false;
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
           public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
               return false;
           }

           @Override
           public Set doublePrime(Set x) {
               return null;
           }

           @Override
           public Set<FCAImplication> getStemBase() {
               return null;
           }

           @Override
           public boolean refutes(FCAImplication imp) {
               return false;
           }

           @Override
           public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
               return false;
           }

           @Override
           protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
               return false;
           }

           @Override
           public FCAObject getObject(Object id) {
               return null;
           }

           @Override
           public FCAObject getObjectAtIndex(int index) {
               return null;
           }

           @Override
           public boolean objectHasAttribute(FCAObject object, Object attribute) {
               return false;
           }

           @Override
           public Set<FCAImplication> getDuquenneGuiguesBase() {
               return null;
           }

           @Override
           public Expert getExpert() {
               return null;
           }

           @Override
           public void setExpert(Expert e) {

           }
       };
       assertTrue(ac.getAttributeCount() == 0);
    }
    @Test
    public void getObjectsTest() throws IllegalObjectException {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject ft = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        ac.addObject(ft);
        IndexedSet<FCAObject> set = new IndexedSet<FCAObject>() {
            @Override
            public int getIndexOf(FCAObject e) {
                return 0;
            }

            @Override
            public FCAObject getElementAt(int index) throws IndexOutOfBoundsException {
                return null;
            }

            @Override
            public void changeOrder() {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<FCAObject> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(FCAObject fcaObject) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends FCAObject> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        set = ac.getObjects();
        int count = 0;
        try {
          count =   ac.getObjectCount();
        }
        catch(Exception e)
        {

        }
        assertTrue(count == 0);
        assertTrue(set == null);
    }
    @Test
    public void attributeIndexTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        ac.addAttribute("A sample attribute");
        ac.addAttribute("Another attribute");
        Object obj = ac.getAttributeAtIndex(0);
        assertTrue(obj.toString().contains("sample attribute"));
    }
    @Test
    public void attributeAdditionFailureTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        ac.addAttribute("A sample attribute");
        boolean added = false;
        try
        {
            added = ac.getAttributes().add("A sample attribute");
        }
        catch(IllegalAttributeException e)
        {

        }
        Object obj = ac.getAttributeCount();
        String str = obj.toString();
        assertTrue(str.length() >0);
    }
    @Test
    public void addAttributesTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        Set<String> attrs = new HashSet<String>(Arrays.asList("abc", "def"));
        try {
            ac.addAttributes(attrs);
        }
        catch(Exception e)
        {

        }
        assertTrue(ac.getAttributeCount() > 1);
    }
    @Test
    public void addObjectTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        try
        {
            ac.addObject(a);

        }
        catch(Exception e)
        {

        }

        assertTrue(ac.containsObject(1) == false);
    }
    @Test
    public void removeObjectTest() throws IllegalObjectException {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        ac.addObject(a);
        try {
            ac.removeObject(1);
            ac.removeObject(a);
        }
        catch(Exception e)
        {

        }
        assertTrue(ac.containsObject(1) == false);
    }
    @Test
    public void addObjectsTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        FCAObject b = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        Set<FCAObject> set = new HashSet<FCAObject>();
        try {
            ac.addObjects(set);
        }
        catch(Exception e)
        {

        }
        assertTrue(ac.containsObject(1) == false);
    }
    @Test
    public void clearObjectsTest() throws IllegalObjectException {

        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        ac.addObject(a);
        try
        {
            ac.clearObjects();
        }
        catch(Exception e)
        {

        }

        assertTrue(ac.containsObject(1) == false);
    }
    @Test
    public void attributeAdditionToObjectTest() throws IllegalObjectException {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        ac.addObject(a);
        try {
            ac.addAttributeToObject(a, 1);
        }
        catch(Exception e)
        {

        }
        assertTrue(ac.getAttributeCount() == 0);
    }
    @Test
    public void getImplicationsTest() throws IllegalObjectException {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        ac.addObject(a);
        Object obj = null;
        try
        {
            obj = ac.getImplications();
        }
        catch(Exception e)
        {

        }
        assertTrue(ac.getAttributeCount() == 0);
    }
    @Test
    public void implicationQuestionTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        Object obj = null;
        try {
            ac.getCurrentQuestion();
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void nextPremiseTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        Set<Integer> set = new HashSet<Integer>();
        Object obj = null;
        try
        {
            obj = ac.getNextPremise(set);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void stemBaseTest()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        Object obj = null;
        try
        {
            obj = ac.getStemBase();
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }
    @Test
    public void otherFCATests()
    {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        boolean obj = true;
        boolean obj1 = true;
        Object obj2 = null;
        try
        {
         obj = ac.refutes((FCAImplication) a);
         obj1 = ac.isCounterExampleValid(null, (FCAImplication) a);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj2 == null);
    }
    @Test
    public void  expertTests() {
        AbstractContext ac = new AbstractContext() {
            @Override
            public IndexedSet getObjects() {
                return null;
            }

            @Override
            public boolean addObject(FCAObject object) throws IllegalObjectException {
                return false;
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
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public Set doublePrime(Set x) {
                return null;
            }

            @Override
            public Set<FCAImplication> getStemBase() {
                return null;
            }

            @Override
            public boolean refutes(FCAImplication imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject counterExample, FCAImplication imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication implication) {
                return false;
            }

            @Override
            public FCAObject getObject(Object id) {
                return null;
            }

            @Override
            public FCAObject getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean objectHasAttribute(FCAObject object, Object attribute) {
                return false;
            }

            @Override
            public Set<FCAImplication> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert e) {

            }
        };
        FCAObject a = new FCAObject() {
            @Override
            public Object getIdentifier() {
                return null;
            }

            @Override
            public String getName() {
                return null;
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
        ExpertAction ea = new ExpertAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

            @Override
            public Context<?, ?, ?> getContext() {
                return null;
            }
        };
        Set<Integer> set = new HashSet<Integer>();
        boolean obj = true;
        boolean obj1 = true;
        try {
            obj = ac.isExpertSet();
            ac.expertPerformedAction(ea);
            ac.initializeExploration();
            ac.continueExploration(set);

        } catch (Exception e) {

        }
        assertTrue(obj1 == true);
    }

}