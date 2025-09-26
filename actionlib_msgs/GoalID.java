package actionlib_msgs;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.json.JSONObject;

public class GoalID implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "actionlib_msgs/GoalID";
	public static final java.lang.String _DEFINITION = "# The stamp should store the time at which this goal was requested.\n# It is used by an action server when it tries to preempt all\n# goals that were requested before a certain time\ntime stamp\n\n# The id provides a way to associate feedback and\n# result message with specific goal requests. The id\n# specified must be unique.\nstring id\n\n";
	public GoalID() {}
	private org.ros.message.Time stamp;
	public org.ros.message.Time getStamp() { return stamp; }
	public void setStamp(org.ros.message.Time value) { stamp = value; }
	private java.lang.String id;
	public java.lang.String getId() { return id; }
	public void setId(java.lang.String value) { id = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("id", id);
		jobj.put("type", _TYPE);
		if(stamp != null ) {
			ZoneId zone = ZoneId.of("America/Los_Angeles");
			LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond((long) stamp.toSeconds()), zone);
			jobj.put("time", dateTime.toString());
		}
		return jobj;
	}
}
