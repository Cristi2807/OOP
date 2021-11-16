package Lab8.Task2;

import Lab8.Task1.GeometricBody;

public class GeometricBodyController {

    public GeometricBody maxVolumeBody(GeometricBody[] arr) {
        double max = 0;
        GeometricBody z = null;
        for (GeometricBody i : arr) {
            if (i.getVolume() > max) {
                max = i.getVolume();
                z = i;
            }
        }
        return z;
    }

    public GeometricBody maxSurfaceAreaBody(GeometricBody[] arr) {
        double max = 0;
        GeometricBody z = null;
        for (GeometricBody i : arr) {
            if (i.getSurface() > max) {
                max = i.getSurface();
                z = i;
            }
        }
        return z;
    }

}
