package rosgraph_msgs;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.json.JSONObject;

public class Clock implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "rosgraph_msgs/Clock";
	public static final java.lang.String _DEFINITION = "# roslib/Clock is used for publishing simulated time in ROS. \n# This message simply communicates the current time.\n# For more information, see http://www.ros.org/wiki/Clock\ntime clock\n";
	public Clock() {}
	private org.ros.message.Time clock;
	public org.ros.message.Time getClock() { return clock; }
	public void setClock(org.ros.message.Time value) { clock = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		if(clock != null) {
			ZoneId zone = ZoneId.of("America/Los_Angeles");
			LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond((long) clock.toSeconds()), zone);
			jobj.put("clock", dateTime);
		}
		return jobj;
	}
}
