
import java.util.*;

public class ClusterCreator {
	
	private int M;
    private ArrayList<Double> datasetX1 = new ArrayList<Double>();
    private ArrayList<Double> clustersX1 = new ArrayList<Double>();
    private ArrayList<Double> datasetX2 = new ArrayList<Double>();
    private ArrayList<Double> clustersX2 = new ArrayList<Double>();
    private Random rand = new Random();
    private int randomNum=0;
	
	public ClusterCreator(int M, ArrayList<Double> datasetX1, ArrayList<Double> datasetX2) {
		this.M = M;
		this.datasetX1 = datasetX1;
		this.datasetX2 = datasetX2;
	}
	
	public void initializeClusters() {
		for(int i=0; i<M; i++) {
			randomNum = rand.nextInt(datasetX1.size() + 1);
			clustersX1.add(datasetX1.get(randomNum));
			clustersX2.add(datasetX2.get(randomNum));
		}
	}

	public ArrayList<Double> getClustersX1() {
		return clustersX1;
	}

	public ArrayList<Double> getClustersX2() {
		return clustersX2;
	}
}
