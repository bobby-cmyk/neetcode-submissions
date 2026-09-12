class Solution {
    // Using a set
    // So why I am using a set, is that a set only holds unique values
    // I will be able to check if something exists in the set in O(1)
    // I will iterate through this nums array
    // And as I interate through it
    // I will be adding the nums into the hashset
    // with the add method in hashset, it acctually returns a true, if the element is added succesfully
    // else, if there's duplicate, the add method would return false 
    public boolean hasDuplicate(int[] nums) {

        // before we iterate, we have to instantiate a set  
        Set<Integer> uniqueNums = new HashSet<>(); 

        for (int i = 0; i < nums.length; i++) {
            // if add method ever returns false
            // this will immediately break the loop by return a value -> which will be true for this case
            int currNum = nums[i];

            if (!uniqueNums.add(currNum)) {
                return true;
            }
        }

        // if it ever reaches the end of this loop
        // that means that no duplicate value was found in the set
        // so it can return false, to show that there are no duplicates
        return false;
    }

    // What is the time complexity
    // Since we are looping through the nums array, the time complexity would be at least O(n)
    // In each iteration, the time taken to check and add to the set will be O(1)
    // So the overall time complexity will be O(n)

    // What about space complexity
    // So space complexity, is what amount of extra space is created for this method
    // The hashset will be instantiate, so it will be O(n)
    // But for the rest of the variables, it will be O(1)
    // So overall time complexity will be O(n) 
}