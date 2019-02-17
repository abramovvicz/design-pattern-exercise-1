package main;

import chart.BarChart;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BarChart barChart = new BarChart("Task types report", new ArrayList());

        BarChart barChartBuilder = new BarChart.BarChartBuilder("some title", 800, 600)
                .withBackgroundColor("FFF000").withFontColor("white").withFontName("Arial").withFontSize(12).build();
    }
}
