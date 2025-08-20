package main.webnav;

/**
 * Web Navigator used to track which URLs a user is currently
 * or was previously browsing, as well as tools for updating the
 * currently viewed based on their session history.
 */
public class WebNavigator {

    private String current;
    // [!] TODO: Choose your relevant JCF fields to manage
    // the browser's history!
    // [!] Hint: you may have multiple fields and multiple
    // data structures (even more than 1 of the same DS)
    
    /**
     * Initializes a new, empty WebNavigator with whatever chosen
     * data structures used to manage the browser's history
     */
    public WebNavigator () {
        // [!] TODO
    }
    
    /**
     *  Visits the current site, clears the forward history,
     *  and records the visited site in the back history
     *  @param site The new site being visited
     */
    public void visit (String site) {
        // [!] TODO
        throw new UnsupportedOperationException();
    }
    
    /**
     *  Changes the current site to the one that was last
     *  visited in the order on which visit was called on it
     */
    public void back () {
        // [!] TODO
        throw new UnsupportedOperationException();
    }
    
    /**
     * Changes the current site to the one that was last
     * returned to via back()
     */
    public void forw () {
        // [!] TODO
        throw new UnsupportedOperationException();
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
