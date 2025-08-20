package webnav.solution;

import java.util.Stack;

/**
 * Web Navigator used to track which URLs a user is currently
 * or was previously browsing, as well as tools for updating the
 * currently viewed based on their session history.
 */
public class WebNavigator {

    private String current; // Tracks currently visited site
    private Stack<String> backStack;
    private Stack<String> forwStack;
    
    WebNavigator () {
        backStack = new Stack<String>();
        forwStack = new Stack<String>();
        current = null;
    }
    
    /**
     *  Visits the current site, clears the forward history,
     *  and records the visited site in the back history
     *  @param site The new site being visited
     */
    public void visit (String site) {
        backStack.push(current);
        current = site;
        forwStack.clear();
    }
    
    /**
     *  Changes the current site to the one that was last
     *  visited in the order on which visit was called on it
     */
    public void back () {
        if (backStack.size() > 1) {
            forwStack.push(current);
            current = backStack.pop();
        }
    }
    
    /**
     * Changes the current site to the one that was last
     * returned to via back()
     */
    public void forw () {
        if (forwStack.size() >= 1) {
            backStack.push(current);
            current = forwStack.pop();
        }
    }
    
    /**
     * Returns the String representing the site that the navigator
     * is currently at
     * @return The current site's URL
     */
    public String getCurrent () {
        return this.current;
    }
    
}
