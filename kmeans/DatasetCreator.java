
import java.util.*;
import java.nio.file.*;


public class DatasetCreator {
    private ArrayList<Double> datasetX1 = new ArrayList<Double>();
    private ArrayList<Double> datasetX2 = new ArrayList<Double>();
    private ArrayList<String> datasetx1 = new ArrayList<String>();
    private ArrayList<String> datasetx2 = new ArrayList<String>();
    private double leftLimitX1;
    private double rightLimitX1;
    private double leftLimitX2;
    private double rightLimitX2;
    private double generatedNumX1;
    private double generatedNumX2;
    
	public ArrayList<Double> getDatasetX1() {
		return datasetX1;
	}
	
	public ArrayList<Double> getDatasetX2() {
		return datasetX2;
	}
	
    public void createTXT() {
    	
    	for (int i=0; i<datasetX1.size(); i++) {
    		datasetx1.add(datasetX1.get(i).toString());
    		datasetx2.add(datasetX2.get(i).toString());
    	}
    	Path outputX1 = Paths.get("datasetX1.txt");
    	Path outputX2 = Paths.get("datasetX2.txt");
    	
        try {
            Files.write(outputX1, datasetx1);
            Files.write(outputX2, datasetx2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
	
	public void createValues1() {
		
		for(int i=0; i<150; i++) {
		    leftLimitX1 = 0.8;
		    rightLimitX1 = 1.2;
		    leftLimitX2 = 0.8;
		    rightLimitX2 = 1.2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
    
	public void createValues2() {
		
		for(int i=0; i<150; i++) {
		    leftLimitX1 = 0;
		    rightLimitX1 = 0.5;
		    leftLimitX2 = 0;
		    rightLimitX2 = 0.5;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues3() {
		
		for(int i=0; i<150; i++) {
		    leftLimitX1 = 0;
		    rightLimitX1 = 0.5;
		    leftLimitX2 = 1.5;
		    rightLimitX2 = 2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues4() {
		
		for(int i=0; i<150; i++) {
		    leftLimitX1 = 1.5;
		    rightLimitX1 = 2;
		    leftLimitX2 = 0;
		    rightLimitX2 = 0.5;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues5() {
		
		for(int i=0; i<150; i++) {
		    leftLimitX1 = 1.5;
		    rightLimitX1 = 2;
		    leftLimitX2 = 1.5;
		    rightLimitX2 = 2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues6() {
		
		for(int i=0; i<75; i++) {
		    leftLimitX1 = 0.8;
		    rightLimitX1 = 1.2;
		    leftLimitX2 = 0;
		    rightLimitX2 = 0.4;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues7() {
		
		for(int i=0; i<75; i++) {
		    leftLimitX1 = 0.8;
		    rightLimitX1 = 1.2;
		    leftLimitX2 = 1.6;
		    rightLimitX2 = 2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues8() {
		
		for(int i=0; i<75; i++) {
		    leftLimitX1 = 0.3;
		    rightLimitX1 = 0.7;
		    leftLimitX2 = 0.8;
		    rightLimitX2 = 1.2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}

	public void createValues9() {
		
		for(int i=0; i<75; i++) {
		    leftLimitX1 = 1.3;
		    rightLimitX1 = 1.7;
		    leftLimitX2 = 0.8;
		    rightLimitX2 = 1.2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
	
	public void createValues10() {
		
		for(int i=0; i<150; i++) {
		    leftLimitX1 = 0;
		    rightLimitX1 = 2;
		    leftLimitX2 = 0;
		    rightLimitX2 = 2;
		    generatedNumX1 = leftLimitX1 + new Random().nextDouble() * (rightLimitX1 - leftLimitX1);
		    generatedNumX2 = leftLimitX2 + new Random().nextDouble() * (rightLimitX2 - leftLimitX2);
		    datasetX1.add(generatedNumX1);
		    datasetX2.add(generatedNumX2);
		}
	}
}

