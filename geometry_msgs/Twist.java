package geometry_msgs;

import org.json.JSONObject;

public class Twist implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "geometry_msgs/Twist";
	public static final java.lang.String _DEFINITION = "# This expresses velocity in free space broken into its linear and angular parts.\nVector3  linear\nVector3  angular\n";
	public Twist() {}
	private geometry_msgs.Vector3 linear;
	public geometry_msgs.Vector3 getLinear() { return linear; }
	public void setLinear(geometry_msgs.Vector3 value) { linear = value; }
	private geometry_msgs.Vector3 angular;
	public geometry_msgs.Vector3 getAngular() { return angular; }
	public void setAngular(geometry_msgs.Vector3 value) { angular = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(linear != null)
		jobj.append("linear", linear.toJSON());
		if(angular != null)
		jobj.append("angular", angular.toJSON());
		return jobj;
	}
}
