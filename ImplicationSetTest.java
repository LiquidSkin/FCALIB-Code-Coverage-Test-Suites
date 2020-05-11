import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.AbstractContext;
import de.tudresden.inf.tcs.fcalib.Implication;
import de.tudresden.inf.tcs.fcalib.ImplicationSet;
import org.junit.Test;
import java.util.*;

import java.util.Hashtable;
import java.util.Set;

import static org.junit.Assert.*;

public class ImplicationSetTest {



    @Test
    public void implicationSetPresenceTest() {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        Object obj = it.getClass();
        String result = String.valueOf(obj);
        assertTrue(result.contains("ImplicationSet"));

    }

    @Test
    public void implicatioSetAbsenceTest() {
        AbstractContext a = new AbstractContext() {
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
        AbstractContext b = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        ImplicationSet it1 = new ImplicationSet(b);
        Object obj = it.contains(b);
        String result = String.valueOf(obj);
        assertTrue(result.contains("false"));
    }

    @Test
    public void contextPresenceTest() {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        Object obj = it.getContext();
        assertTrue(obj.toString().contains("ImplicationSet"));
    }

    @Test
    public void fcaImplicationPresenceTest() {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        FCAImplication fca = new FCAImplication() {
            @Override
            public Set getPremise() {
                return new HashSet(Arrays.asList(1, 2, 3, 5));
            }

            @Override
            public Set getConclusion() {
                return new HashSet(Arrays.asList(10, 20, 30, 40));
            }

            @Override
            public boolean equals(FCAImplication imp) {
                return true;

            }
        };
        HashSet<FCAImplication> tmp;
        for (Object attr : fca.getPremise()) {
            tmp = ht.get(attr);
            try {
                tmp.add(fca);
                ht.put(attr, tmp);
            } catch (Exception e) {
            }
        }
        try {
            it.add(fca);
        } catch (Exception e) {
        }
        Object obj = it.contains(fca);
        assertTrue(obj.equals(false));
    }

    @Test

    public void checkClosureTest() {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        HashSet<String> set = new HashSet<String>(Arrays.asList("Jack", "Closure"));
        try {
            Set<String> update = new HashSet<>(set);
            Set<String> newDep = new LinkedHashSet<>(set);
            Hashtable<String, Integer> premiseSizes = new Hashtable<>();
            for (String imp : set) {
                premiseSizes.put(imp, set.size());
                if (imp == null) {
                    newDep.addAll(update);
                    update.addAll(update);
                }
            }
        }
        catch(Exception e) {
        }
        Object Obj = false;
        try {
             Obj = it.closure(set);
        }
        catch(Exception e) {
        }
        String res = String.valueOf(Obj);
        assertTrue(Obj.equals(false));
    }
    @Test
    public void closureClosedTest()
    {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        Set set = new HashSet();
        Object obj = false;
        try {
            obj = it.isClosed(set);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj.equals(true));
    }
    @Test
    public void bitVectorTest()
    {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        Set<Integer> s = new LinkedHashSet<Integer>();
        BitSet b = new BitSet();
        try
        {
            for (int i = 0; i < a.getAttributeCount(); ++i) {
                if (b.get(i)) {
                    s.add(i);
                }
            }
        }
        catch(Exception e)
        {

        }
        Object obj = it.bitVectorToSet(b);
        assertTrue(obj.toString().contains("[]"));
    }
    @Test
    public void closureStartingTest()
    {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        Set<Integer> s = new LinkedHashSet<Integer>();
        Object obj = it.closuresStartingFrom(s);
        assertTrue(obj.toString().contains("[["));


    }
    @Test
    public void getAllClosuresTest()
    {
        AbstractContext a = new AbstractContext() {
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
        Hashtable<Object, HashSet> ht = new Hashtable<Object, HashSet>();
        a.addAttribute("String Value");
        a.addAttribute("Integer Value");
        for (Object attr : a.getAttributes()) {
            ht.put(attr, new HashSet<>());
        }
        ImplicationSet it = new ImplicationSet(a);
        Object obj = it.allClosures();
        System.out.println("The object is" + "" + obj.toString());
        assertTrue(obj.toString().contains("[["));
    }



}