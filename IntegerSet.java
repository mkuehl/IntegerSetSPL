//@ model import org.jmlspecs.models.*;
import java.util.*; 

/** A set of integers as a HashSet.
 * @author Katie Becker
 * @author Gary T. Leavens
 */

public   class  IntegerSet {
	

    public void insert  (int i) {
        hset.add(new Integer(i));
    }

	

    public /*@ pure @*/ boolean isMember(int i) {
        return hset.contains(new Integer(i));
    }

	

    public void remove  (int i) {
        hset.remove(new Integer(i));
    }

	

    private /*@ non_null @*/ HashSet hset;

	
    //@                      in theSet;
    //@                      maps hset.theSet \into theSet;
    //@ private represents theSet <- abstractValue();

    /** Return the abstract value of this IntegerSetAsHashSet. */

    /*@ 
    private pure model JMLValueSet abstractValue() {
        JMLValueSet ret = new JMLValueSet();
        Iterator iter = hset.iterator();
        while (iter.hasNext()) {
            ret = ret.insert(new JMLInteger((Integer)iter.next()));
        }
        return ret;
    } @*/

    /** Initialize this set to be the empty set. */
    /*@ public normal_behavior
      @   assignable theSet;
      @   ensures theSet != null && theSet.isEmpty();
      @*/
    public IntegerSet() {
        hset = new HashSet();
    }

	

    public String toString() {
        return hset.toString();
    }


}
