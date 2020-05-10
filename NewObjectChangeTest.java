import de.tudresden.inf.tcs.fcaapi.*;
import de.tudresden.inf.tcs.fcaapi.action.ExpertAction;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalAttributeException;
import de.tudresden.inf.tcs.fcaapi.exception.IllegalObjectException;
import de.tudresden.inf.tcs.fcaapi.utils.IndexedSet;
import de.tudresden.inf.tcs.fcalib.change.NewObjectChange;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class NewObjectChangeTest {

    @Test
    public void NewObjectPresenceTest()
    {

        FCAObject f = new FCAObject() {
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
        Context cf = new Context() {
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
                return true;
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
        NewObjectChange nw = new NewObjectChange(cf,f);
        Object c = nw.getObject();
        assertTrue(c.toString().contains("NewObjectChangeTest"));


    }

    @Test
    public void undoTest()
    {
        FCAObject f = new FCAObject() {
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
        Context cf = new Context() {
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
                return true;
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
        NewObjectChange nw = new NewObjectChange(cf,f);
        nw.undo();
        Object obj = nw.getObject();
        String result = obj.toString();
        assertTrue(result.contains("NewObject"));
    }
    @Test
    public void getTypeTest()
    {
        FCAObject f = new FCAObject() {
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
        Context cf = new Context() {
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
                return true;
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
        NewObjectChange nw = new NewObjectChange(cf,f);
        int id  = nw.getType();
        assertTrue(id == 2);
    }




}