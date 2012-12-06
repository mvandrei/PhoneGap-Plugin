package au.com.BTek.Plugins;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;

public class BTekPlugin extends Plugin {
	
    public BTekPlugin() {
    }
    
    public PluginResult execute(String action, JSONArray args, String callbackId) {
    	
    	// Create the response JSON
        JSONObject jsonResponse = new JSONObject();
        try {
        	jsonResponse.put("title", "Hello JavaScript!");
        	jsonResponse.put("details", "How are you today?");
        } catch(JSONException e) {
        	// Raise the error event
        	this.error(e.getMessage(), callbackId);
        }
        
        // Raise the success event 
        this.success(new PluginResult(PluginResult.Status.OK, jsonResponse), callbackId);
                
        return new PluginResult(PluginResult.Status.OK, "success");    
    }
}