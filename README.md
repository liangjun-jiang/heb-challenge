## HEB Coding Assigment
### Liangjun Jiang on Dec. 23, 2017

Build an android instant app that displays a home menu and contains one feature that
displays images retrieved from a Flickr API.
Requirements:
1. Home Screen:
a. Contains a button that launches the image viewer feature
**Done**
2. Image Viewer:
a. Use the most recent Flicker API endpoint
**Done**
b. Modify the API request to include a product, ex. "tomato"
**Done**
c. Modify the API request to include paging, ex. first 30 items
**Done**
d. View should have two columns, if Portrait, or two rows, if Landscape
**Done**
3. Create Unit Tests
Bonus:
• Add an Image Captions
**Done**
• Support multiple screens (Phone and tablet) and both portrait and landscape
orientations
**Done**
• Tap cell to navigate to larger version of image
**Done**
• Load the next page set when the bottom of the collection view is reached (infinite
scroll)
**Done**
• Create a second feature that incorporates image search
**Done**
a. Search toolbar should collapse when content is scrolled
**Done**


### 3rd Party Library
Gson is used in this assignment. The reason I choose Gson is 
1. I have used Gson for parsing json object in the past and it proves simple, faster, robust and powerful.
2. For an assignment like this, probabaly it's no difference to use between Gson or JsonObject. Just I have been so used to Gson.

### Development Thought
1. For instant app feature, the best is to route the image viewer screen, instead of current main screen.
2. A service is used to fetch Flickr images and it also supports background fetch. Say, fetching is triggered by push notification, instead of triggered by scrolling to the bottom. It is another way to implement infinite scroll, I think. Flickr API returns 100 images per page so I didn't modify it. Since I have implemented the infinite scrolling and pagaination with Flickr api before, I am trying to implement this feature with a different approach.
3. Instead of collapse the whole actionbar, I just hide/show search view when scrolling/idle. Since I have implmented coordinatorlayout to collapse search view before, I am trying to implement this feature with a different approach. 

