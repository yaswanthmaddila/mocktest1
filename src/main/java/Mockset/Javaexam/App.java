package Mockset.Javaexam;
import java.util.Map;
import java.util.TreeMap;
public class App 
{
	    public static void main(String args []) {
	    	        // Create a TreeMap to map Technology with their Projects
	    	        Map<String, String> technologyProjects = new TreeMap<String, String>();

	    	        // Add technology-project mappings
	    	        technologyProjects.put("Java", " james gosling ");
	    	        technologyProjects.put("Python", "van rausam");
	    	        technologyProjects.put("c", "dennis ritchie");

	    	        // Print the TreeMap
	    	        System.out.println("Technology-Project Mapping:");
	    	        for (Map.Entry<String, String> entry : technologyProjects.entrySet()) {
	    	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	    	        }
	    	    }
	    	}
//////

