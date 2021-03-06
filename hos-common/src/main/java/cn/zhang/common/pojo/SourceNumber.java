package cn.zhang.common.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.util.comparator.ComparableComparator;

public class SourceNumber implements Comparable<SourceNumber>{
	
	private Date date;
	private Date startTime;
	private Date endtTime;
	private Long scheduleId;
	private String Date_x;
	private String StartTime_x;
	private String endTime_x;

	public void setEndTime_x(String endTime_x) {
		this.endTime_x = endTime_x;
	}

	public void setDate_x(String date_x) {
		Date_x = date_x;
	}

	public void setStartTime_x(String startTime_x) {
		StartTime_x = startTime_x;
	}

	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public Date getDate() {
		return date;
	}
	public String getDate_x(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		return format.format(date);
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getStartTime() {
		return startTime;
	}
	public String getStartTime_x(){
		return dateConvertString(startTime);
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public String dateConvertString(Date date){
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		return format.format(date);
	}
	public Date getEndtTime() {
		return endtTime;
	}
	
	public String getEndTime_x(){
		return dateConvertString(endtTime);
	}
	public void setEndtTime(Date endtTime) {
		this.endtTime = endtTime;
	}
	@Override
	public int compareTo(SourceNumber o) {
		return getStartTime_x().compareTo(o.getStartTime_x());
	}
}
