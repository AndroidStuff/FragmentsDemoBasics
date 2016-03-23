# FragmentsDemoBasics

## About this Project

The objective of this project is to get a feel for the basics of creation of Fragments (Static Fragments).

In this project we add a Fragment to an Activity using XML.

In this project we are going to use a static fragment. Static fragments are easy to add to your application:
just use the <fragment> element in a layout file, such as our res/layout/activity_main.xml


## Steps in creating a basic fragment (aka. Static Fragment)
* Create a fragment layout with prefix fragment_ (similar to Activity)
* Create a corresponding class (extending `Fragment` class) for the layout  (similar to Activity)
    - At a minimum all you need to do is over-ride the onCreateView() method
* In the Activity where you want to include this fragment, open its layout and add a snippet like below. Here, we are declaring our UI to be completely comprised of one fragment, whose implementation (BasicFragment.java) is identified by the android:name attribute on the <fragment> element. Instead of android:name, you can use class, though most of the Android documentation has now switched over to android:name.
```xml
<fragment android:id="@+id/basic_fragment"
        android:name="com.example.fragmentsdemobasics.BasicFragment"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
``` 

## References
* [Training Basics : Creating a Fragment](http://developer.android.com/training/basics/fragments/creating.html)
* Busy Coder's Guide to Android Development