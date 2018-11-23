package cr.ac.tec.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.jws.WebService;


@WebService (targetNamespace="http://service.tec.ac.cr/", serviceName="ServiceService", portName="ServicePort")
public class ServiceDelegate{

    cr.ac.tec.service.Service _service = null;

    public void postList (String strList) {
        _service.postList(strList);
    }

    public String getQuickSort () {
        return _service.getQuickSort();
    }

    public ServiceDelegate() {
        _service = new cr.ac.tec.service.Service(); }

}