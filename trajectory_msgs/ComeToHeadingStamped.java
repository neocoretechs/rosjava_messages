package trajectory_msgs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONObject;

/**
 * "action":"move_left",<br>
 * "distance": 109,<br>
 * "heading": 60.938,<br>
 * "timestamp":1758148733360<br>
 * action:move_left and action:move_right will move in the heading specified by the value from 0 to 360 over the specified distance <p>
 * e.g. action:move_left distance:100 heading:10 would move to the left 10 degrees over a distance of 100cm<p>
 * action:move_forward and action:move_backward will move by the value of the distance, in the current heading<p>
 * e.g. action:move_forward distance:10 would move 10 degrees forward<p>
 * action:pivot_left and action:pivot_right will pivot the wheels (neutral steering), in the direction specified, from 0 to 360 degrees <p>
 * e.g. action:pivot_left heading:10 would pivot left 10 degrees, and action:pivot_right heading:200 would pivot right 200 degrees<p>
 */
public class ComeToHeadingStamped implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON, std_msgs.InputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "trajectory_msgs/ComeToHeadingStamped";
	public static final java.lang.String _DEFINITION = "# This represents a new orientation with reference coordinate frame and timestamp.\n";
	public enum action {
		move_forward("move_forward"),
		move_backward("move_backward"),
		move_left("move_left"),
		move_right("move_right"),
		pivot_left("pivot_left"),
		pivot_right("pivot_right");
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
	@Override
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.put("type", _TYPE);
		jobj.put("action", act.getData());
		jobj.put("distance", dist.getData());
		jobj.put("heading", heading.getData());
		jobj.put("timestamp", time.getData());
		return jobj;
	}
	@Override
	public void fromJSON(java.lang.String json) {
		JSONObject jobj = new JSONObject(json);
		this.act = new std_msgs.String();
		this.act.setData(action.valueOf(jobj.getString("action")).name);
		setDist(new std_msgs.Int32());
		this.dist.setData(jobj.optInt("distance", 0));
		setHeading(new std_msgs.Float32());
		this.heading.setData(jobj.optFloat("heading", 0.0f));
		setTime(new std_msgs.UInt64());
		this.time.setData(jobj.optLong("timestamp", System.currentTimeMillis()));	
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
	
	public static void main(String[] args) {
		/*
		action act = action.valueOf(args[0]);
		if(act == null)
			throw new RuntimeException("cant parse "+args[0]);
		std_msgs.Int32 dist = new std_msgs.Int32();
		dist.setData(Integer.parseInt(args[1]));
		std_msgs.Float32 heading = new std_msgs.Float32();
		heading.setData(Float.parseFloat(args[2]));
		long time = System.currentTimeMillis();
		std_msgs.UInt64 utime = new std_msgs.UInt64();
		utime.setData(time);
		ComeToHeadingStamped cths = new ComeToHeadingStamped(act, dist, heading, utime);
		System.out.println(cths.toJSON());
		*/
		String s = null;
		try {
			s = Files.readString(Path.of(args[0]));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		ComeToHeadingStamped cths = new ComeToHeadingStamped();
		cths.fromJSON(s);
		System.out.println(cths.toJSON());
	}
}
