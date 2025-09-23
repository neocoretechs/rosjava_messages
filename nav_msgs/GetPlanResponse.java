package nav_msgs;

import org.json.JSONObject;

public class GetPlanResponse implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "nav_msgs/GetPlanResponse";
	public static final java.lang.String _DEFINITION = "nav_msgs/Path plan";
	public GetPlanResponse() {}
	private nav_msgs.Path plan;
	public nav_msgs.Path getPlan() { return plan; }
	public void setPlan(nav_msgs.Path value) { plan = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(plan != null)
		jobj.append("plan", plan.toJSON());
		return jobj;
	}
}
