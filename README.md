## Normal Mode

You must write a program that can take a string and return a boolean depending on if it is a palindrome or not.  As a reminder a palindrome is a string that has the same letters forwards and backwords.  These strings can be a word, a phrase, a sentence or even multiple sentences.


Letter casing and punctuation do not matter when testing a palindrome. All of the following are valid palindromes:

* stunt nuts
* Lisa Bonet ate no basil.
* A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal: Panama!
* Doc, note, I dissent. A fast never prevents a fatness. I diet on cod.

You must implement this using a recursion and strip out non letters.
Hint: The replaceAll method should strip out the non-whitespace `mystring.replaceAll("[^A-Za-z0-9 ]", "");`

## Hard Mode

* Make both an iterative and recursive version of your palindrome test function.

## Nightmare Mode
In this mode you will create a new project for binary search.  This algorithm is pretty simple conceptually.  If you have a sorted list and you need to search for an item you can simply keep splitting the list in half.  For example [1,2,3,4,5,6,7,8,9,10] is the list and I want to see if 7 is in the list.
1. Find the halfway point of the list (5 or 6 so we will just round down)
2. Pull out that value (5)
3. 7 (search value) > 5 so we need to look at the back half of the list
4. Look at the subset of the list [5,6,7,8,9,10] knowing that it can't be in the first half
5. Go to step 1 and repeat with the sublist in the previous step
6. Keep repeating until the number is found or the number isn't there

Your requirement is to take those steps and create a recursive system that will return true or false depending on a list of strings.
* Load the mac dictionary `/usr/share/dict/web2` into an `ArrayList<String>`
* Create a search class
* Create a method (or more if you need) that will take a user inputed string and recursively search the arraylist to see if your word is in there.

## Additional Resources

* [Palindrome list](http://www.palindromelist.net/).
