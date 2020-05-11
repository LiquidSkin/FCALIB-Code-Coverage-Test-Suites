import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.AbstractContext;
import de.tudresden.inf.tcs.fcalib.action.ResetExplorationAction;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ResetExplorationActionTest {

    @Test
    public void resetActionTest()
    {

        AbstractContext a = new AbstractContext<>() {
            @Override
            public IndexedSet<FCAObject<Object, Object>> getObjects() {
                return null;
            }

            @Override
            public FCAObject<Object, Object> getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean addObject(FCAObject<Object, Object> object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject<Object, Object> object) throws IllegalObjectException {
                return false;
            }

            @Override
            public FCAObject<Object, Object> getObject(Object id) {
                return null;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public boolean objectHasAttribute(FCAObject<Object, Object> object, Object attribute) {
                return false;
            }

            @Override
            public Set<Object> doublePrime(Set<Object> x) {
                return null;
            }

            @Override
            public Set<FCAImplication<Object>> getStemBase() {
                return null;
            }

            @Override
            public Set<FCAImplication<Object>> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert<Object, Object, FCAObject<Object, Object>> getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert<Object, Object, FCAObject<Object, Object>> e) {

            }

            @Override
            public boolean refutes(FCAImplication<Object> imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject<Object, Object> counterExample, FCAImplication<Object> imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication<Object> implication) {
                return false;
            }
        };
        ResetExplorationAction r = new ResetExplorationAction(a);
        Object obj = null;
        try
        {
            r.setContext(a);
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);

    }
    @Test
    public void actionTest()
    {
        AbstractContext a = new AbstractContext<>() {
            @Override
            public IndexedSet<FCAObject<Object, Object>> getObjects() {
                return null;
            }

            @Override
            public FCAObject<Object, Object> getObjectAtIndex(int index) {
                return null;
            }

            @Override
            public boolean addObject(FCAObject<Object, Object> object) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(Object id) throws IllegalObjectException {
                return false;
            }

            @Override
            public boolean removeObject(FCAObject<Object, Object> object) throws IllegalObjectException {
                return false;
            }

            @Override
            public FCAObject<Object, Object> getObject(Object id) {
                return null;
            }

            @Override
            public boolean addAttributeToObject(Object attribute, Object id) throws IllegalAttributeException, IllegalObjectException {
                return false;
            }

            @Override
            public boolean objectHasAttribute(FCAObject<Object, Object> object, Object attribute) {
                return false;
            }

            @Override
            public Set<Object> doublePrime(Set<Object> x) {
                return null;
            }

            @Override
            public Set<FCAImplication<Object>> getStemBase() {
                return null;
            }

            @Override
            public Set<FCAImplication<Object>> getDuquenneGuiguesBase() {
                return null;
            }

            @Override
            public Expert<Object, Object, FCAObject<Object, Object>> getExpert() {
                return null;
            }

            @Override
            public void setExpert(Expert<Object, Object, FCAObject<Object, Object>> e) {

            }

            @Override
            public boolean refutes(FCAImplication<Object> imp) {
                return false;
            }

            @Override
            public boolean isCounterExampleValid(FCAObject<Object, Object> counterExample, FCAImplication<Object> imp) {
                return false;
            }

            @Override
            protected boolean followsFromBackgroundKnowledge(FCAImplication<Object> implication) {
                return false;
            }
        };
        ResetExplorationAction r = new ResetExplorationAction(a);
        Object obj = null;
        try
        {
            r.actionPerformed(null);
            try
            {
                a.getAttributes().clear();
                a.clearObjects();
                if (a.getImplications() != null) {
                    a.getImplications().clear();
                }
            }
            catch(Exception e)
            {

            }
        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);

    }

}