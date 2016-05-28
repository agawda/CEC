import cec.cluster.types.ClusterKind;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by jkordas on 24/05/16.
 */
public class Comparison1 extends ComparisonWithR {
    private String filePath = "src/main/resources/datat/comparison_with_r/input1.txt";
    private double[][] centers = {
            {1.835500008, 1.83264112, -0.018794462},
            {0.003456549, -0.01457724, -0.008393578},
            {-1.802832615, 1.82421792, 0.001769739}
    };
    private double[][][] covariances = {
            {
                    {0.222550615, -0.0207875064, 0.0026668165},
                    {-0.020787506, 0.2318151647, 0.0001316783},
                    {0.002666816, 0.0001316783, 0.2458717487}
            },
            {
                    {0.784407934, 0.01700754, 0.009330744},
                    {0.017007543, 0.76841208, -0.012311903},
                    {0.009330744, -0.01231190, 0.827841153}
            },
            {
                    {0.21874747, 0.031540616, -0.004340000},
                    {0.03154062, 0.223044429, 0.003173891},
                    {-0.00434000, 0.003173891, 0.249890769}
            }
    };
    private ClusterKind clusterKind = ClusterKind.SphericalGaussians;

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public double[][] getCenters() {
        return centers;
    }

    @Override
    public double[][][] getCovariances() {
        return covariances;
    }

    @Override
    public ClusterKind getClusterKind() {
        return clusterKind;
    }

    @Test
    public void test() throws IOException {
        simpleTest();
    }
}
