package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Spatial;

public class Shooter extends SimpleApplication {

    public Shooter() {

    }

    @Override
    public void update() {
        super.update();
    }

    @Override
    public void simpleInitApp() {
        Spatial turret = assetManager.loadModel("Models/Turret.obj");
        Material mat_default = new Material(assetManager, "Common/MatDefs/Misc/ShowNormals.j3md");
        turret.setMaterial(mat_default);
        rootNode.attachChild(turret);
    }
}
