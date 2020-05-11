import de.tudresden.inf.tcs.fcaapi.Expert;
import de.tudresden.inf.tcs.fcaapi.FCAImplication;
import de.tudresden.inf.tcs.fcaapi.FCAObject;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.AbstractContext;
import de.tudresden.inf.tcs.fcalib.action.StartExplorationAction;
import org.junit.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.Assert.*;

public class StartExplorationActionTest {

    @Test

    public void actionTest()
    {
        StartExplorationAction st = new StartExplorationAction();
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
        Object obj = null;
        try
        {
            st.actionPerformed(null);
            a.initializeExploration();
            if (a.isExpertSet()) {

            }
            else {

                Set<AbstractContext> initialPremise = Collections.emptySet();
                a.continueExploration(initialPremise);
            }

        }
        catch(Exception e)
        {

        }
        assertTrue(obj == null);
    }

}