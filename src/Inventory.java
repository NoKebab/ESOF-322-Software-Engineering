/*
 * TODO: ADD COMMENTS
 * 
 */
public class Inventory {

    // the default sorting method
    // starts initialized to BubbleSort
    protected ISortingMethod sorting_method = new BubbleSort();

    // changes the default sorting method to the new one chosen by the user
    public void setSortMethod(ISortingMethod method) {
        sorting_method = method;
        // cleanly prints out the new default sorting method to the user
        System.out.println("\nDefault sorting method set to: " + sorting_method.toString().split("@")[0]);
    }

    // calls ISortingMethod's implementation of sort
    public void preformSort() {
        System.out.println("Sort Called");
        sorting_method.sort();
    }

}
