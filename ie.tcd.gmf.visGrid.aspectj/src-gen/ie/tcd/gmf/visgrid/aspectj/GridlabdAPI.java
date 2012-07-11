package ie.tcd.gmf.visgrid.aspectj;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import visGrid.House;

public class GridlabdAPI {
  public House createHouse(final String core) {
    String mTypeName = "House";
    for(EObject obj : _instPool.keySet())
    	if(_instPool.get(obj).equals(core))
    		return (House)obj;
    org.eclipse.emf.ecore.EPackage epackage = resource.getAllContents().next().eClass().getEPackage();
    House ins = (House)epackage.getEFactoryInstance().create((org.eclipse.emf.ecore.EClass)epackage.getEClassifier(mTypeName));
    ins.eAdapters().add(GridlabdAPIAdapter.INSTANCE);
    initHouse(ins, core);
    _instPool.put(ins,core);
    return ins;
  }
  
  public void initHouse(final House element, final String core) {
    element.setName(core);
  }
  
  private static Map<Resource,GridlabdAPI> instances =  new java.util.HashMap<Resource,GridlabdAPI>();
  
  private Resource resource = null;
  
  public static GridlabdAPI resolveInstance(final Resource resource) {
    GridlabdAPI result = instances.get(resource);
    if(result!=null)
    	return result;
    result = new GridlabdAPI();
    result.resource = resource;
    instances.put(resource,result);
    for(Object o:resource.eAdapters())
    	if(o instanceof GridlabdAPIAdapter)
    		return result;
    resource.eAdapters().add(GridlabdAPIAdapter.INSTANCE);
    return result;
  }
  
  private Map<EObject,Object> _instPool = new java.util.HashMap<EObject,Object>();
}