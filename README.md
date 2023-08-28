Following project is done by Pushpanjali Dokania for work assignment for Materna Virtual Solutions.
Project includes Test Cases on searching "Active Sync" in Google Search.

How to Run:
Run org.example.testRunner.TestRunner.java File.

**Code Highlights:** 

1. **The Base Class is designed to be multi-threaded. Driver instance is per thread and hence can be run in parallel.**

2. **Click on Search Results is configurable. "People Also Ask" Section is handled as well. The first Link in the first suggestion will be clicked.**

3. Base Class includes parameter for providing Browser Name & Driver Path via Properties file.

4. Cookies of Chrome Browser are handled so that privacy policy need not be accepted.


Code Description:
This assignment only covers basic test cases around Google Search. It can be extended to cover more deeper scenarios. The focus
of this assignment was only to highlight code scalability & configurability.

Test Case 1:
1. Set Cookies in order to avoid Privacy Popups in Chrome.
2. Search Google for "Active Sync" keyword.
3. Verify Title of Page.
4. Clicks 1st Search Result.

Test Case 2:
1. Set Cookies in order to avoid Privacy Popups in Chrome.
2. Search Google for "Active Sync" keyword.
3. Verify Title of Page.
4. Clicks 5th Search Result.