package sensor_msgs;

import org.json.JSONObject;

public class Temperature implements org.ros.internal.message.Message, java.io.Serializable, std_msgs.OutputJSON {
	private static final long serialVersionUID = -1L;
	public static final java.lang.String _TYPE = "sensor_msgs/Temperature";
	public static final java.lang.String _DEFINITION = " # Single temperature reading.\n\n Header header           # timestamp is the time the temperature was measured\n                         # frame_id is the location of the temperature reading\n\n float64 temperature     # Measurement of the Temperature in Degrees Celsius\n\n float64 variance        # 0 is interpreted as variance unknown";
	public Temperature() {}
	private std_msgs.Header header;
	public std_msgs.Header getHeader() { return header; }
	public void setHeader(std_msgs.Header value) { header = value; }
	private double temperature;
	public double getTemperature() { return temperature; }
	public void setTemperature(double value) { temperature = value; }
	private double variance;
	public double getVariance() { return variance; }
	public void setVariance(double value) { variance = value; }
	public JSONObject toJSON() {
		JSONObject jobj = new JSONObject();
		jobj.append("type", _TYPE);
		if(header != null)
		jobj.append("header", header.toJSON());
		jobj.append("temperature", temperature);
		jobj.append("variance", variance);
		return jobj;
	}
}
