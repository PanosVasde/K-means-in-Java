
import java.util.*;
import java.lang.Math;

public class Main {
	  public static void main(String[] args) {
		  	
		  	final int M = 12;
		    ArrayList<Double> datasetX1 = new ArrayList<Double>();
		    ArrayList<Double> datasetX2 = new ArrayList<Double>();
		    ArrayList<Double> clustersX1 = new ArrayList<Double>();
		    ArrayList<Double> clustersX2 = new ArrayList<Double>();

		    double d, x, y, avgX1, avgX2, sumX1, sumX2, error=0;
		    int count, iteration = 1;
		    boolean bool = true;

		    DatasetCreator datasetCreator = new DatasetCreator();
		    datasetCreator.createValues1();
		    datasetCreator.createValues2();
		    datasetCreator.createValues3();
		    datasetCreator.createValues4();
		    datasetCreator.createValues5();
		    datasetCreator.createValues6();
		    datasetCreator.createValues7();
		    datasetCreator.createValues8();
		    datasetCreator.createValues9();
		    datasetCreator.createValues10();
		    datasetX1 = datasetCreator.getDatasetX1();
		    datasetX2 = datasetCreator.getDatasetX2();
		    
		    datasetCreator.createTXT();
		    
		    ClusterCreator clusterCreator = new ClusterCreator(M, datasetX1, datasetX2);
		    clusterCreator.initializeClusters();
		    clustersX1 = clusterCreator.getClustersX1();
		    clustersX2 = clusterCreator.getClustersX2();
		    
		    System.out.println("iteration = 0\n" + clustersX1);
		    System.out.println(clustersX2 + "\n");
		    
		    
		    //k-means algorithm
		    
		    while(bool) {
		    	ArrayList<ArrayList<Double>> clusters = new ArrayList<ArrayList<Double>>();
		    	ArrayList<Double> previousClustersX1 = new ArrayList<Double>();
			    ArrayList<Double> previousClustersX2 = new ArrayList<Double>();
		    	previousClustersX1.addAll(clustersX1);
		    	previousClustersX2.addAll(clustersX2);
		    	
			    error = 0;
			    
			    for(int i=0; i<datasetX1.size(); i++) {
			    	ArrayList<Double> euclideanDistances = new ArrayList<Double>();
			    	ArrayList<Double> dumbArr = new ArrayList<Double>();
			    	for (int j=0; j<clustersX1.size(); j++) {
			    		x = Math.pow((datasetX1.get(i)-clustersX1.get(j)), 2);
			    		y = Math.pow((datasetX2.get(i)-clustersX2.get(j)), 2);
			    		d = Math.sqrt(x + y);
			    		euclideanDistances.add(d);
			    	}
			    	
			    	dumbArr.add(datasetX1.get(i));
			    	dumbArr.add(datasetX2.get(i));
			    	dumbArr.add(Double.valueOf(euclideanDistances.indexOf(Collections.min(euclideanDistances))));
			    	clusters.add(dumbArr);
			    	
			    	error += Collections.min(euclideanDistances);
			    }
			    
			    
			    for(int j=0; j<M; j++) {
			    	avgX1=0;
			    	avgX2=0;
			    	count=0;
			    	sumX1=0;
			    	sumX2=0;
			    	for(int i=0; i<clusters.size(); i++) {
			    		if(j==clusters.get(i).get(2)) {
			    			sumX1 += datasetX1.get(i);
			    			sumX2 += datasetX2.get(i);
			    			count+=1;
			    		}
			    		avgX1 = sumX1/count;
			    		avgX2 = sumX2/count;
			    		clustersX1.set(j, avgX1);
			    		clustersX2.set(j, avgX2);
			    		
			    	}
			    }
			    System.out.println("iteration = " + iteration + "\n" + clustersX1);
			    System.out.println(clustersX2);
			    System.out.println("error = " + error + "\n");
			    iteration+=1;
			    
			    if (clustersX1.equals(previousClustersX1) & clustersX2.equals(previousClustersX2)) {
		    		bool = false;
		    	}
		    }
	 }
}