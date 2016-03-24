# FragmentsDemoBasics

## About this Project

The objective of this project is to get a feel for the basics of creation of Fragments (Static Fragments).

In this project we add a Fragment to an Activity using XML.

In this project we are going to use a static fragment.

Static fragments are fairly simple, once you have the Fragment implementation: just add the <fragment> element to where you want to have the fragment appear in your activity’s layout, such as our res/layout/activity_main.xml in our case in this project.

## Fragment's Life-cycle methods
* onCreate()
* onStart() (but not onRestart()) 
* onResume()
* onPause()
*onStop()
* onDestroy()
* onAttach() called when a fragment is attached to an activity
* onCreateView()
* onViewCreated() will be called after onCreateView(). This is particularly useful if you are inheriting the onCreateView() implementation but need to configure the resulting views, such as with a ListFragment and needing to set up an adapter.
* onActivityCreated() will be called after onCreate() and onCreateView(), to indicate that the activity’s onCreate() has completed. If there is something that you need to initialize in your fragment that depends upon the activity’s onCreate() having completed its work, you can use onActivityCreated() for that initialization work.
* onDestroyView() is called before onDestroy(). This is the counterpart to onCreateView() where you set up your UI. If there are things that you need to clean up specific to your UI, you might put that logic in onDestroyView().
* onDetach() is called after onDestroy(), to let you know that your fragment has been disassociated from its hosting activity.


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

## onClick() Events in Fragment
You don't want onClick events to be handled in the Activity where the fragment is attached. So DO NOT use the onClick in the xml layout of the fragment. Instead, refer your buttons or anything else within the fragment class and attach onclick listeners to it within the code.

## References
* [Training Basics : Creating a Fragment](http://developer.android.com/training/basics/fragments/creating.html)
* Busy Coder's Guide to Android Development