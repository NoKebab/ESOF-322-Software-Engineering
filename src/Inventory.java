/*
 * TODO: ADD COMMENTS
 * 
 */
public class Inventory {
    
    /**
     * Default sorting method, initially set to bubble sort
     */
    protected ISortingMethod sorting_method = new BubbleSort();

    /*
     * TODO: ADD COMMENTS
     * 
     */
    public void setSortMethod(ISortingMethod method) {
       sorting_method = method;
    }
    
    /*
     * TODO: ADD COMMENTS
     * 
     */
    public void preformSort() {
        sorting_method.sort();
    }

}
