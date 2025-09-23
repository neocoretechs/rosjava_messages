package trajectory_msgs;

import org.json.JSONObject;

import std_msgs.String;
/**
 * "action":"move_forward",
 * "distance": 109,
 * "heading": 60.938,
 * "timestamp":1758148733360
 */
public class ComeToHeadingStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON, std_msgs.InputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "trajectory_msgs/ComeToHeadingStamped";
	public static final java.lang.String _DEFINITION = "# This represents a new orientation with reference coordinate frame and timestamp.\n";
	public enum action {
		MOVE_FORWARD("move_forward"),
		MOVE_BACKWARD("move_backward"),
		MOVE_LEFT("move_left"),
		MOVE_RIGHT("move_right");
		action(java.lang.String name) {
			this.name = name;
		}
		java.lang.String name;
		public java.lang.String val() { return name; }
	}
	public ComeToHeadingStamped() {}
	public ComeToHeadingStamped(action act, std_msgs.Int32 dist, std_msgs.Float32 heading, std_msgs.UInt64 time) {
		this.act = new std_msgs.String();
		this.act.setData(act.val());
		this.dist = dist;
		this.heading = heading;
		this.time = time;
	}
	public std_msgs.String getAction() {
		return act;
	}
	private std_msgs.String act;
	private std_msgs.Int32 dist;
	private std_msgs.Float32 heading;
	private std_msgs.UInt64 time;
	
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		jobj.append("action", act.getData());
		jobj.append("distance", dist.getData());
		jobj.append("heading", heading.getData());
		jobj.append("timestamp", time.getData());
		return jobj;
	}
	@Override
	public void fromJSON(java.lang.String json) {
		JSONObject jobj = new JSONObject(json);
		this.act = new std_msgs.String();
		this.act.setData(jobj.getString("action"));
		setDist(new std_msgs.Int32());
		this.dist.setData(jobj.getInt("distance"));
		setHeading(new std_msgs.Float32());
		this.heading.setData(jobj.getFloat("heading"));
		setTime(new std_msgs.UInt64());
		this.time.setData(jobj.getInt("timestamp"));
		
	}
	/**
	 * @return the dist
	 */
	public std_msgs.Int32 getDist() {
		return dist;
	}
	/**
	 * @param dist the dist to set
	 */
	public void setDist(std_msgs.Int32 dist) {
		this.dist = dist;
	}
	/**
	 * @return the heading
	 */
	public std_msgs.Float32 getHeading() {
		return heading;
	}
	/**
	 * @param heading the heading to set
	 */
	public void setHeading(std_msgs.Float32 heading) {
		this.heading = heading;
	}
	/**
	 * @return the time
	 */
	public std_msgs.UInt64 getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(std_msgs.UInt64 time) {
		this.time = time;
	}
}
