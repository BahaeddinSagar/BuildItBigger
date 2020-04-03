package com.udacity.gradle.builditbigger;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class JokeTest {

    @Rule
    public ActivityTestRule<MainActivity> newRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void CheckJoke() throws InterruptedException {
        onView(withId(R.id.tell_me_a_joke)).perform(click());
        Thread.sleep(2000);
        //check that output is not empty
        onView(withId(R.id.textView)).check(matches(not(withText(""))));
    }

}
