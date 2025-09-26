package std_msgs;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.json.JSONObject;

public class Header implements org.ros.internal.message.Message, java.io.Serializable {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "std_msgs/Header";
	public static final java.lang.String _DEFINITION = "# Standard metadata for higher-level stamped data types.\n# This is generally used to communicate timestamped data \n# in a particular coordinate frame.\n# \n# sequence ID: consecutively increasing ID \nuint32 seq\n#Two-integer timestamp that is expressed as:\n# * stamp.sec: seconds (stamp_secs) since epoch (in Python the variable is called \'secs\')\n# * stamp.nsec: nanoseconds since stamp_secs (in Python the variable is called \'nsecs\')\n# time-handling sugar is provided by the client library\ntime stamp\n#Frame this data is associated with\n# 0: no frame\n# 1: global frame\nstring frame_id\n";
	public Header() {}
	private int seq;
	public int getSeq() { return seq; }
	public void setSeq(int value) { seq = value; }
	private org.ros.message.Time stamp;
	public org.ros.message.Time getStamp() { return stamp; }
	public void setStamp(org.ros.message.Time value) { stamp = value; }
	private java.lang.String frame_id;
	public java.lang.String getFrameId() { return frame_id; }
	public void setFrameId(java.lang.String value) { frame_id = value; }
	public Object toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("seq", seq);
		jobj.put("type", _TYPE);
		if(stamp != null) {
			ZoneId zone = ZoneId.of("America/Los_Angeles");
			LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond((long) stamp.toSeconds()), zone);
			jobj.put("time", dateTime.toString());
		}
		jobj.put("frame_id", frame_id);
		return jobj;
	}
}
