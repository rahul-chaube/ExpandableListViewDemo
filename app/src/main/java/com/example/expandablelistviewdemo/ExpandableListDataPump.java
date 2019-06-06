package com.example.expandablelistviewdemo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> cricket = new ArrayList<String>();
        cricket.add("India");
        cricket.add("Pakistan");
        cricket.add("Australia");
        cricket.add("England");
        cricket.add("South Africa");

        List<String> football = new ArrayList<String>();
        football.add("Brazil");
        football.add("Spain");
        football.add("Germany");
        football.add("Netherlands");
        football.add("Italy");

        List<String> basketball = new ArrayList<String>();
        basketball.add("United States");
        basketball.add("Spain");
        basketball.add("Argentina");
        basketball.add("France");
        basketball.add("Russia");

        expandableListDetail.put("CRICKET TEAMS", cricket);
        expandableListDetail.put("FOOTBALL TEAMS", football);
        expandableListDetail.put("BASKETBALL TEAMS", basketball);
        expandableListDetail.put("CRICKET TEAMS 1", cricket);
        expandableListDetail.put("FOOTBALL TEAMS 1", football);
        expandableListDetail.put("BASKETBALL TEAMS 1", basketball);
        expandableListDetail.put("CRICKET TEAMS 2", cricket);
        expandableListDetail.put("FOOTBALL TEAMS 2", football);
        expandableListDetail.put("BASKETBALL TEAMS 2", basketball);
        expandableListDetail.put("CRICKET TEAMS 3", cricket);
        expandableListDetail.put("FOOTBALL TEAMS 3", football);
        expandableListDetail.put("BASKETBALL TEAMS 3", basketball);
        expandableListDetail.put("CRICKET TEAMS 4", cricket);
        expandableListDetail.put("FOOTBALL TEAMS 4", football);
        expandableListDetail.put("BASKETBALL TEAMS 4", basketball);
        expandableListDetail.put("CRICKET TEAMS 5", cricket);
        expandableListDetail.put("FOOTBALL TEAMS 5", football);
        expandableListDetail.put("BASKETBALL TEAMS 5", basketball);
        expandableListDetail.put("CRICKET TEAMS 6", cricket);
        expandableListDetail.put("FOOTBALL TEAMS 6", football);
        expandableListDetail.put("BASKETBALL TEAMS 6", basketball);

        return expandableListDetail;
    }
}