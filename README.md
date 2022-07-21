# Baigiamasis darbas
Pasirinkta testuoti svetainė: https://www.1a.lt/

# Tests:
1. Testlogin with no data function:
    * click 'Prisijungti' on the main page
    * click 'Prisijungti' in registration page with empy fields;
    * check if text apears same as expected message

2. Try logging in using valid email and valid password:
    * click button 'Prisijungti' on the main page;
    * enter valid email address;
    * enter valid password;
    * check if it possible to go to profile.


3. Try to search for an item:
    * Enter text in search field;
    * click on button 'Search';
    * click on product that shows in list;
    * check if product name is same as search name;
    

4. Try to add searched item to cart:
    * Enter text in search field;
    * click on button 'Search';
    * click on product that shows in list;
    * click button 'I Krepseli';
    * click button 'X' to close pop up window;
    * click button 'Mano krepselis';
    * Check if in there is same product ass added by name;


5. Try to add two more same items in cart and try to buy it with no account:
   * Enter text in search field;
   * click on button 'Search';
   * click on product that shows in list;
   * click button 'I Krepseli';
   * click button 'X' to close pop up window;
   * click button 'Mano krepselis';
   * click button '+';
   * click button 'Testi' in Mano krepselis page;
   * click button 'Testi' in registration page;
   * Check if is possible to buy item without account