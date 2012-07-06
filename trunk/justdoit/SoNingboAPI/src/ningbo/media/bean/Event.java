package ningbo.media.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_event")
public class Event implements Serializable {

	private static final long serialVersionUID = 2156307824455276583L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String md5Value;

	private String title;

	private String subject;

	private String address;

	private String startDate;

	private String startTime;

	private String endDate;

	private String endTime;

	private String photo_path;

	private String organizer;

	private String locationMd5Value;

	private String userMd5Value;

	public Event() {
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMd5Value() {
		return md5Value;
	}

	public void setMd5Value(String md5Value) {
		this.md5Value = md5Value;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getPhoto_path() {
		return photo_path;
	}

	public void setPhoto_path(String photo_path) {
		this.photo_path = photo_path;
	}

	public String getLocationMd5Value() {
		return locationMd5Value;
	}

	public void setLocationMd5Value(String locationMd5Value) {
		this.locationMd5Value = locationMd5Value;
	}

	public String getUserMd5Value() {
		return userMd5Value;
	}

	public void setUserMd5Value(String userMd5Value) {
		this.userMd5Value = userMd5Value;
	}

}
