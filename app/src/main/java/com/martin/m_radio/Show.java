package com.martin.m_radio;


import com.martin.m_radio.schedule.ScheduleRecyclerItem;
import com.martin.m_radio.schedule.ScheduleRecyclerViewAdapter;

public class Show extends ScheduleRecyclerItem {

    private String day;

    public Show(String title, String date) {
        super(ScheduleRecyclerViewAdapter.CARD, title, date);
    }

    public String getTitle() {
        return super.getS1();
    }

    public String getTime() {
        return super.getS2();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
