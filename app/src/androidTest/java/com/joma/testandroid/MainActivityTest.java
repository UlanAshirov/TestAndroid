package com.joma.testandroid;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.sql.RowId;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void tvIsDisplayedCase() {
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(isDisplayed()));
    }

    @Test
    public void simpleMathAddTest() {
        onView(withId(R.id.etTextNum1)).perform(typeText("2"));
        onView(withId(R.id.etTextNum2)).perform(typeText("2"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4")));
    }

    @Test
    public void simpleMathSub() {
        onView(withId(R.id.etTextNum1)).perform(typeText("4"));
        onView(withId(R.id.etTextNum2)).perform(typeText("6"));
        onView(withId(R.id.btnSub)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("-2")));
    }

    @Test
    public void simpleMathMult() {
        onView(withId(R.id.etTextNum1)).perform(typeText("4"));
        onView(withId(R.id.etTextNum2)).perform(typeText("4"));
        onView(withId(R.id.btnMult)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("16")));
    }

    @Test
    public void typeException() {
        onView(withId(R.id.etTextNum1)).perform(typeText("7"));
        onView(withId(R.id.etTextNum2)).perform(typeText("3"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("2.3")));
    }

    @Test
    public void simpleMathDiv() {
        onView(withId(R.id.etTextNum1)).perform(typeText("4"));
        onView(withId(R.id.etTextNum2)).perform(typeText("4"));
        onView(withId(R.id.btnDiv)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("1")));
    }

    @Test
    public void spacedFieldsCase() {
        onView(withId(R.id.etTextNum1)).perform(typeText("   2   "));
        onView(withId(R.id.etTextNum2)).perform(typeText("   2   "));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("4")));
    }

    @Test
    public void letterCase() {
        onView(withId(R.id.etTextNum1)).perform(typeText("asda"));
        onView(withId(R.id.etTextNum2)).perform(typeText("asdas"));
        onView(withId(R.id.btnAdd)).perform(click());
        onView(withId(R.id.tvResult)).check(matches(withText("letter exception")));
    }
}
