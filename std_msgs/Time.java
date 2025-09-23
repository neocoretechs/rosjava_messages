package std_msgs;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.json.JSONObject;

public class Time implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Time";
	public static final java.lang.String _DEFINITION = "time data\n";
	public Time() {}
	private org.ros.message.Time data;
	public org.ros.message.Time getData() { return data; }
	public void setData(org.ros.message.Time value) { data = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(data != null) {
			ZoneId zone = ZoneId.of("America/Los_Angeles");
			LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond((long) data.toSeconds()), zone);
			jobj.append("time", dateTime);
		}
		return jobj;
	}
}
